import os.path
import shutil

from jinja2 import Environment, PackageLoader, select_autoescape

from pipeline.translator import JavaBuilder
from pipeline.utils import clone_sources, SchemaLoader

print("***************************************")
print(f"Triggering the generation of Java classes for openMINDS")
print("***************************************")

# Step 1 - clone central repository in main branch to get the latest sources
clone_sources()
schema_loader = SchemaLoader()
if os.path.exists("target"):
    shutil.rmtree("target")

ignored_versions = ["v1.0", "v2.0"]
relevant_versions = [v for v in schema_loader.get_schema_versions() if v not in ignored_versions]


def build_central():
    env = Environment(
        loader=PackageLoader("generator"),
        autoescape=select_autoescape()
    )
    template = env.get_template("OpenMINDS.java.j2")
    result = template.render(
        relevant_versions = built_versions,
        packages_by_version = packages_by_version
    )
    target_file = "target/src/main/java/org/openmetadatainitiative/openminds/OpenMINDS.java"
    os.makedirs(os.path.dirname(target_file), exist_ok=True)
    with open(target_file, "w") as target_file:
        target_file.write(result)

built_versions = []
packages_by_version = {}


for schema_version in relevant_versions:
    # Step 2 - find all involved schemas for the current version
    schemas_file_paths = schema_loader.find_schemas(schema_version)
    type_to_class_name = {}
    implemented_interfaces = {}
    builders = []
    for schema_file_path in schemas_file_paths:
        builder = JavaBuilder(schema_file_path, schema_loader.schemas_sources)
        if builder.version not in packages_by_version:
            packages_by_version[builder.version] = {}
        if builder.relative_path_without_extension[0] not in packages_by_version[builder.version]:
            packages_by_version[builder.version][builder.relative_path_without_extension[0]] = []
        packages_by_version[builder.version][builder.relative_path_without_extension[0]].append((builder.class_name, builder.canonical_class_name()))
        if builder.version not in built_versions:
            built_versions.append(builder.version)
        for property, types in builder.additional_interfaces.items():
            for t in types:
                if t not in implemented_interfaces:
                    implemented_interfaces[t] = []
                implemented_interfaces[t].append(f"{builder.interface_path(property).replace('/', '.')}")
        type_to_class_name[builder.type]=builder.canonical_class_name()
        builders.append(builder)


    for builder in builders:
        # Step 3 - translate and build each openMINDS schema as JSON-Schema
        builder.build(type_to_class_name, implemented_interfaces)

build_central()