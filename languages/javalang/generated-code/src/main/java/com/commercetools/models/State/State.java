package com.commercetools.models.State;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.State.StateRoleEnum;
import com.commercetools.models.State.StateTypeEnum;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.State.StateImpl;

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
@JsonDeserialize(as = StateImpl.class)
public interface State extends LoggedResource {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("type")
   public StateTypeEnum getType();
   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @JsonProperty("initial")
   public Boolean getInitial();
   
   @NotNull
   @JsonProperty("builtIn")
   public Boolean getBuiltIn();
   
   
   @JsonProperty("roles")
   public List<StateRoleEnum> getRoles();
   
   @Valid
   @JsonProperty("transitions")
   public List<StateReference> getTransitions();

   public void setKey(final String key);
   
   public void setType(final StateTypeEnum type);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setInitial(final Boolean initial);
   
   public void setBuiltIn(final Boolean builtIn);
   
   public void setRoles(final List<StateRoleEnum> roles);
   
   public void setTransitions(final List<StateReference> transitions);

   public String toJson();
   
   public static StateImpl of(){
      return new StateImpl();
   }
   
   
   public static StateImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, StateImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}