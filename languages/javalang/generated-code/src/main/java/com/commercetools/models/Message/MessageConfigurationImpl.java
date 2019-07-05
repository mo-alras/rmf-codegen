package com.commercetools.models.Message;

import java.lang.Boolean;
import java.lang.Integer;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class MessageConfigurationImpl implements MessageConfiguration {

   private Integer deleteDaysAfterCreation;
   
   private Boolean enabled;

   @JsonCreator
   MessageConfigurationImpl(@JsonProperty("deleteDaysAfterCreation") final Integer deleteDaysAfterCreation, @JsonProperty("enabled") final Boolean enabled) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      this.enabled = enabled;
   }
   public MessageConfigurationImpl() {
      
   }
   
   
   public Integer getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public Boolean getEnabled(){
      return this.enabled;
   }

   public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation){
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
   }
   
   public void setEnabled(final Boolean enabled){
      this.enabled = enabled;
   }
   
   public String toJson() {
      try {
          return CommercetoolsJsonUtils.toJsonString(this);
      }catch(JsonProcessingException e) {
          e.printStackTrace();
      }
      return null;
   }

}