package com.commercetools.models.Common;

import java.lang.String;
import com.commercetools.models.Common.LocalizedStringImpl;

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
@JsonDeserialize(as = LocalizedStringImpl.class)
public interface LocalizedString  {

   
   @NotNull
   @JsonAnyGetter
   public Map<String, String> values();

   @JsonAnySetter
   public void setValue(String key, String value);

   public String toJson();
   
   public static LocalizedStringImpl of(){
      return new LocalizedStringImpl();
   }
   
   
   public static LocalizedStringImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, LocalizedStringImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}