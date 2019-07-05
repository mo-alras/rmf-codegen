package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeMoneyTypeImpl;

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
@JsonDeserialize(as = AttributeMoneyTypeImpl.class)
public interface AttributeMoneyType extends AttributeType {



   public String toJson();
   
   public static AttributeMoneyTypeImpl of(){
      return new AttributeMoneyTypeImpl();
   }
   
   
   public static AttributeMoneyTypeImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, AttributeMoneyTypeImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}