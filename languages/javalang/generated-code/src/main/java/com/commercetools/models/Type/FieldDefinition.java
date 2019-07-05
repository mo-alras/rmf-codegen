package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.TypeTextInputHint;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Type.FieldDefinitionImpl;

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
@JsonDeserialize(as = FieldDefinitionImpl.class)
public interface FieldDefinition  {

   
   @NotNull
   @Valid
   @JsonProperty("type")
   public Object getType();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();
   
   @NotNull
   @JsonProperty("required")
   public Boolean getRequired();
   
   
   @JsonProperty("inputHint")
   public TypeTextInputHint getInputHint();

   public void setType(final Object type);
   
   public void setName(final String name);
   
   public void setLabel(final LocalizedString label);
   
   public void setRequired(final Boolean required);
   
   public void setInputHint(final TypeTextInputHint inputHint);

   public String toJson();
   
   public static FieldDefinitionImpl of(){
      return new FieldDefinitionImpl();
   }
   
   
   public static FieldDefinitionImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, FieldDefinitionImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}