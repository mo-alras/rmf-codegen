package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategorySetExternalIdActionImpl;

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
@JsonDeserialize(as = CategorySetExternalIdActionImpl.class)
public interface CategorySetExternalIdAction extends CategoryUpdateAction {

   
   
   @JsonProperty("externalId")
   public String getExternalId();

   public void setExternalId(final String externalId);

   public String toJson();
   
   public static CategorySetExternalIdActionImpl of(){
      return new CategorySetExternalIdActionImpl();
   }
   
   
   public static CategorySetExternalIdActionImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, CategorySetExternalIdActionImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}