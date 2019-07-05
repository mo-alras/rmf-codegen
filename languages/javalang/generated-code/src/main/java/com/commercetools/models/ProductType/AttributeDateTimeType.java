package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeDateTimeTypeImpl;

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
@JsonDeserialize(as = AttributeDateTimeTypeImpl.class)
public interface AttributeDateTimeType extends AttributeType {



   public String toJson();
   
   public static AttributeDateTimeTypeImpl of(){
      return new AttributeDateTimeTypeImpl();
   }
   
   
   public static AttributeDateTimeTypeImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, AttributeDateTimeTypeImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}