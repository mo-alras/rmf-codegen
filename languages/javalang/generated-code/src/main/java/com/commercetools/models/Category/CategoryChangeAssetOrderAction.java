package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategoryChangeAssetOrderActionImpl;

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
@JsonDeserialize(as = CategoryChangeAssetOrderActionImpl.class)
public interface CategoryChangeAssetOrderAction extends CategoryUpdateAction {

   
   @NotNull
   @JsonProperty("assetOrder")
   public List<String> getAssetOrder();

   public void setAssetOrder(final List<String> assetOrder);

   public String toJson();
   
   public static CategoryChangeAssetOrderActionImpl of(){
      return new CategoryChangeAssetOrderActionImpl();
   }
   
   
   public static CategoryChangeAssetOrderActionImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, CategoryChangeAssetOrderActionImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}