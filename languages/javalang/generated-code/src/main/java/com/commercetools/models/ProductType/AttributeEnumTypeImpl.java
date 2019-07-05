package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributePlainEnumValue;
import com.commercetools.models.ProductType.AttributeType;
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
public class AttributeEnumTypeImpl implements AttributeEnumType {

   private List<AttributePlainEnumValue> values;

   @JsonCreator
   AttributeEnumTypeImpl(@JsonProperty("values") final List<AttributePlainEnumValue> values) {
      this.values = values;
   }
   public AttributeEnumTypeImpl() {
      
   }
   
   
   public List<AttributePlainEnumValue> getValues(){
      return this.values;
   }

   public void setValues(final List<AttributePlainEnumValue> values){
      this.values = values;
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