package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeSetTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeSetTypeImpl.class)
public interface AttributeSetType extends AttributeType {

   
   @NotNull
   @Valid
   @JsonProperty("elementType")
   public AttributeType getElementType();

   public void setElementType(final AttributeType elementType);

   public String toJson();
   
   public static AttributeSetTypeImpl of(){
      return new AttributeSetTypeImpl();
   }
   
   
   public static AttributeSetTypeImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, AttributeSetTypeImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}