package org.openmetadatainitiative.openminds.v3.core.actors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.core.actors.ContactInformation.SEMANTIC_NAME;
/**
 * Structured information about how to contact a given person or consortium.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactInformation extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ContactInformation";

    @JsonIgnore
    public Reference<ContactInformation> getReference() {
        return doGetReference();
    }

    public static Reference<ContactInformation> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private ContactInformation(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ContactInformation>{
        
        public Builder email(String email) { ContactInformation.this.email = email; return this; }
        

        public ContactInformation build() {
            if (ContactInformation.this.id == null) {
                ContactInformation.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(ContactInformation.this.types == null || ContactInformation.this.types.isEmpty() || !ContactInformation.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = ContactInformation.this.types;
                ContactInformation.this.types = new ArrayList<>();
                ContactInformation.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    ContactInformation.this.types.addAll(oldValues);
                }
            }
            return ContactInformation.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/email")
    private String email;
    
    /**
    * Address to which or from which an electronic mail can be sent.
    */
    public String getEmail() {
       return this.email;
    }

 
    public static ContactInformation.Builder create(LocalId localId){
        return new ContactInformation(localId).new Builder();
    }

    public ContactInformation.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ContactInformation.class).new Builder();
    }
}