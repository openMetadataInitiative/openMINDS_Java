package org.openmetadatainitiative.openminds.latest.core.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart;


import static org.openmetadatainitiative.openminds.latest.core.miscellaneous.ResearchProductGroup.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResearchProductGroup extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ResearchProductGroup";

    @JsonIgnore
    public Reference<ResearchProductGroup> getReference() {
        return doGetReference();
    }

    public static Reference<ResearchProductGroup> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ResearchProductGroup(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ResearchProductGroup>{
        
        public Builder context(String context) { ResearchProductGroup.this.context = context; return this; }
        
        public Builder hasPart(List<Reference<? extends ResearchProductGroupHasPart>> hasPart) { ResearchProductGroup.this.hasPart = hasPart; return this; }
        

        public ResearchProductGroup build(OpenMINDSContext context) {
            if (ResearchProductGroup.this.id == null) {
                ResearchProductGroup.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            ResearchProductGroup.this.type = SEMANTIC_NAME;
            return ResearchProductGroup.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/context")
    private String context;
    
    public String getContext() {
       return this.context;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasPart")
    private List<Reference<? extends ResearchProductGroupHasPart>> hasPart;
    
    public List<Reference<? extends ResearchProductGroupHasPart>> getHasPart() {
       return this.hasPart;
    }

 
    public static ResearchProductGroup.Builder create(LocalId localId){
        return new ResearchProductGroup(localId).new Builder();
    }

    public ResearchProductGroup.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ResearchProductGroup.class).new Builder();
    }
}