package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Long;
import com.commercetools.models.Product.ProductUpdateImpl;

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
@JsonDeserialize(as = ProductUpdateImpl.class)
public interface ProductUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<ProductUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<ProductUpdateAction> actions);

   public String toJson();
   
   public static ProductUpdateImpl of(){
      return new ProductUpdateImpl();
   }
   
   
   public static ProductUpdateImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, ProductUpdateImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}