package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
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
public class AttributeLocalizedEnumValueImpl implements AttributeLocalizedEnumValue {

   private com.commercetools.models.Common.LocalizedString label;
   
   private String key;

   @JsonCreator
   AttributeLocalizedEnumValueImpl(@JsonProperty("label") final com.commercetools.models.Common.LocalizedString label, @JsonProperty("key") final String key) {
      this.label = label;
      this.key = key;
   }
   public AttributeLocalizedEnumValueImpl() {
      
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setLabel(final com.commercetools.models.Common.LocalizedString label){
      this.label = label;
   }
   
   public void setKey(final String key){
      this.key = key;
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