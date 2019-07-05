package com.commercetools.models.Common;

import com.commercetools.models.Common.AssetDimensions;
import java.lang.String;
import com.commercetools.models.Common.AssetSourceImpl;

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
@JsonDeserialize(as = AssetSourceImpl.class)
public interface AssetSource  {

   
   @NotNull
   @JsonProperty("uri")
   public String getUri();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("dimensions")
   public AssetDimensions getDimensions();
   
   
   @JsonProperty("contentType")
   public String getContentType();

   public void setUri(final String uri);
   
   public void setKey(final String key);
   
   public void setDimensions(final AssetDimensions dimensions);
   
   public void setContentType(final String contentType);

   public String toJson();
   
   public static AssetSourceImpl of(){
      return new AssetSourceImpl();
   }
   
   
   public static AssetSourceImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, AssetSourceImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}