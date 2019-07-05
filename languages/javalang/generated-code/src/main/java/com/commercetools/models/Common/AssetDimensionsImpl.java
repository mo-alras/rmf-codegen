package com.commercetools.models.Common;

import java.lang.Integer;
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
public class AssetDimensionsImpl implements AssetDimensions {

   private Integer w;
   
   private Integer h;

   @JsonCreator
   AssetDimensionsImpl(@JsonProperty("w") final Integer w, @JsonProperty("h") final Integer h) {
      this.w = w;
      this.h = h;
   }
   public AssetDimensionsImpl() {
      
   }
   
   
   public Integer getW(){
      return this.w;
   }
   
   
   public Integer getH(){
      return this.h;
   }

   public void setW(final Integer w){
      this.w = w;
   }
   
   public void setH(final Integer h){
      this.h = h;
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