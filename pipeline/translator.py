import json
import os.path
from typing import Dict, List
from jinja2 import Environment, PackageLoader, select_autoescape

#Some property names can conflict with protected keywords of the target language. Accordingly, they need to be translated
property_translation = {
    "abstract": "abstract_"
}


class JavaBuilder(object):

    def __init__(self, schema_file_path:str, root_path:str):
        _relative_path_without_extension = schema_file_path[len(root_path)+1:].replace(".schema.omi.json", "").split("/")
        self.version = _relative_path_without_extension[0].split(".")[0]
        self.relative_path_without_extension = _relative_path_without_extension[1:]
        self.absolute_translations = {}
        with open(schema_file_path, "r") as schema_f:
            self._schema_payload = json.load(schema_f)
        if "properties" in self._schema_payload:
            for p in set(self._schema_payload["properties"].keys()):
                property_split = p.split('/')
                simple_property_name = property_split[-1]
                path = "/".join(property_split[0:-1])
                if simple_property_name in property_translation:
                    self.absolute_translations[f"{path}/{property_translation[simple_property_name]}"] = p
                    self._schema_payload["properties"][f"{path}/{property_translation[simple_property_name]}"] = self._schema_payload["properties"][p]
                    del self._schema_payload["properties"][p]
        if "required" in self._schema_payload:
            for p in self._schema_payload["required"]:
                property_split = p.split('/')
                simple_property_name = property_split[-1]
                path = "/".join(property_split[0:-1])
                if simple_property_name in property_translation:
                    self.absolute_translations[f"{path}/{property_translation[simple_property_name]}"] = p
                    self._schema_payload["required"].remove(p)
                    self._schema_payload["required"].append(f"{path}/{property_translation[simple_property_name]}")

        self.type = self._schema_payload['_type']
        self.version_path = os.path.join("org/openmetadatainitiative/openminds/", self.version)
        self.package_path = os.path.join(self.version_path, "/".join(self.relative_path_without_extension[0:-1])).replace("-", "")
        self.class_name = f"{self.relative_path_without_extension[-1][0].upper()}{self.relative_path_without_extension[-1][1:]}"
        self.additional_interfaces = self._additional_interfaces()



        env = Environment(
            loader=PackageLoader("generator"),
            autoescape=select_autoescape()
        )
        self.template = env.get_template("schema_class.java.j2")
        self.interface_template = env.get_template("interface.java.j2")
        self.imports = []

    def property_to_type(self, property_name):
        simple_property_name = property_name.split('/')[-1]
        return f"{simple_property_name[0].upper()}{simple_property_name[1:]}"

    def _get_type(self, property_name, property_definition, type_to_class_name) -> str:
        if "type" in property_definition:
            if property_definition["type"] == "array":
                if "_linkedTypes" in property_definition and property_definition["_linkedTypes"]:
                    if len(property_definition["_linkedTypes"]) == 1:
                        if property_definition["_linkedTypes"][0] in type_to_class_name:
                            self.imports.append(type_to_class_name[property_definition["_linkedTypes"][0]])
                        return f"List<Reference<{property_definition['_linkedTypes'][0].split('/')[-1]}>>"
                    else:
                        self.imports.append(self.interface_path(property_name).replace("/", "."))
                        return f"List<Reference<? extends {self.interface_name(property_name)}>>"
                if "_embeddedTypes" in property_definition and property_definition["_embeddedTypes"]:
                    if len(property_definition["_embeddedTypes"]) == 1:
                        if property_definition["_embeddedTypes"][0] in type_to_class_name:
                            self.imports.append(type_to_class_name[property_definition["_embeddedTypes"][0]])
                        return f"List<{property_definition['_embeddedTypes'][0].split('/')[-1]}>"
                    else:
                        self.imports.append(self.interface_path(property_name).replace("/", "."))
                        return f"List<? extends {self.interface_name(property_name)}>"
                if "items" in property_definition:
                    if "type" in property_definition["items"]:
                        if property_definition["items"]["type"] == "string":
                            return "List<String>"
            if property_definition["type"] == "string":
                return "String"
        else:
            if "_linkedTypes" in property_definition and property_definition["_linkedTypes"]:
                if len(property_definition["_linkedTypes"]) == 1:
                    if property_definition["_linkedTypes"][0] in type_to_class_name:
                        self.imports.append(type_to_class_name[property_definition["_linkedTypes"][0]])
                    return f"Reference<{property_definition['_linkedTypes'][0].split('/')[-1]}>"
                else:
                    self.imports.append(self.interface_path(property_name).replace("/", "."))
                    return f"Reference<? extends {self.interface_name(property_name)}>"
            if "_embeddedTypes" in property_definition and property_definition["_embeddedTypes"]:
                if len(property_definition["_embeddedTypes"]) == 1:
                    if property_definition["_embeddedTypes"][0] in type_to_class_name:
                        self.imports.append(type_to_class_name[property_definition["_embeddedTypes"][0]])
                    return f"{property_definition['_embeddedTypes'][0].split('/')[-1]}"
                else:
                    self.imports.append(self.interface_path(property_name).replace("/", "."))
                    return f"{self.interface_name(property_name)}"

        return "Object"

    def translate_interface(self, additional_interface, types, package_name):
        return self.interface_template.render(
            package_name = package_name,
            additional_interface = additional_interface,
            types = types
        )


    def translate(self, type_to_class_name, implemented_interfaces) -> str:
        # set required properties
        required_prop = self._schema_payload["required"] if "required" in self._schema_payload else []
        required_prop.extend(["@id", "@type"])

        # set description
        description = "* "+"\n * ".join(self._schema_payload['description'].split("\n")) if "description" in self._schema_payload else "* "

        property_descriptions = {}
        member_for_properties = {}
        getter_for_properties = {}
        builder_for_properties = {}

        for property, spec in self._schema_payload["properties"].items():
            property_descriptions[property] = spec["description"] if "description" in spec else None
            type = self._get_type(property, spec, type_to_class_name)
            property_name = property.split('/')[-1]
            member_for_properties[property] = f"private {type} {property_name};"
            getter_for_properties[property] = f"public {type} get{property_name[0].upper()}{property_name[1:]}() {{\n       return this.{property_name};\n    }}"
            builder_for_properties[property] = [
                f"public Builder {property_name}({type} {property_name}) {{ {self.class_name}.this.{property_name} = {property_name}; return this; }}"
            ]

        if self.canonical_class_name() in self.imports:
            self.imports.remove(self.canonical_class_name())

        return self.template.render(
            type = self.type,
            java_doc = description,
            package_name = self.package_path.replace("/", "."),
            class_name = self.class_name,
            properties = sorted(list(self._schema_payload["properties"].keys())),
            member_for_properties = member_for_properties,
            getter_for_properties = getter_for_properties,
            property_descriptions = property_descriptions,
            absolute_property_translations = self.absolute_translations,
            implemented_interfaces = implemented_interfaces[self.type] if self.type in implemented_interfaces else None,
            additional_interfaces = {self.property_to_type(p) : sorted([f"{t.split('/')[-1]}.class" for t in k]) for p, k in self.additional_interfaces.items()},
            builder_for_properties = builder_for_properties,
            imports = sorted(list(set(self.imports)))
        )

    def _target_file_path(self) -> str:
        return os.path.join(self.package_path, self.class_name)

    def canonical_class_name(self) -> str:
        return self._target_file_path().replace("/", ".")

    def interface_name(self, property_name) -> str:
        return f"{self.class_name}{self.property_to_type(property_name)}"

    def interface_path(self, property_name) -> str:
        return os.path.join(self.package_path, "intf", self.interface_name(property_name))

    def _additional_interfaces(self) -> Dict[str, List[str]]:
        additional_interfaces = {}
        for property, property_definition in self._schema_payload["properties"].items():
            if "_linkedTypes" in property_definition and len(property_definition["_linkedTypes"]) > 1:
                additional_interfaces[property] = property_definition["_linkedTypes"]
            elif "_embeddedTypes" in property_definition and len(property_definition["_embeddedTypes"]) > 1:
                additional_interfaces[property] = property_definition["_embeddedTypes"]
        return additional_interfaces

    def build(self, type_to_class_name, implemented_interfaces):
        target_file = os.path.join("target", "src/main/java", f"{self._target_file_path()}.java")
        os.makedirs(os.path.dirname(target_file), exist_ok=True)
        result = self.translate(type_to_class_name, implemented_interfaces)

        with open(target_file, "w") as target_file:
            target_file.write(result)

        for additional_interface, types in self.additional_interfaces.items():
            interface_path = self.interface_path(additional_interface)
            target_file = os.path.join("target", "src/main/java", f"{interface_path}.java")
            os.makedirs(os.path.dirname(target_file), exist_ok=True)
            result = self.translate_interface(self.interface_name(additional_interface), [f"{type_to_class_name[t]}.class" for t in types if t in type_to_class_name], os.path.join(self.package_path, "intf").replace("/", "."))
            with open(target_file, "w") as target_file:
                target_file.write(result)