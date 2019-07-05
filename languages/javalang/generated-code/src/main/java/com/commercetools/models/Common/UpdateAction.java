package com.commercetools.models.Common;

import java.lang.String;
import com.commercetools.models.Common.UpdateActionImpl;

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
@JsonDeserialize(as = UpdateActionImpl.class)
public interface UpdateAction  {

   
   @NotNull
   @JsonProperty("action")
   public String getAction();

   public void setAction(final String action);

   public String toJson();
   
   public static UpdateActionImpl of(){
      return new UpdateActionImpl();
   }
   
   
   public static UpdateActionImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, UpdateActionImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}