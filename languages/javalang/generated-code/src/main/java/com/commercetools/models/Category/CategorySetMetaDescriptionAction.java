package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategorySetMetaDescriptionActionImpl;

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
@JsonDeserialize(as = CategorySetMetaDescriptionActionImpl.class)
public interface CategorySetMetaDescriptionAction extends CategoryUpdateAction {

   
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();

   public void setMetaDescription(final LocalizedString metaDescription);

   public String toJson();
   
   public static CategorySetMetaDescriptionActionImpl of(){
      return new CategorySetMetaDescriptionActionImpl();
   }
   
   
   public static CategorySetMetaDescriptionActionImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, CategorySetMetaDescriptionActionImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}