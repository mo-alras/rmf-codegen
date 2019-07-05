package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelRoleEnum;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Review.ReviewRatingStatistics;
import com.commercetools.models.Type.CustomFields;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Channel.ChannelImpl;

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
@JsonDeserialize(as = ChannelImpl.class)
public interface Channel extends LoggedResource {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("roles")
   public List<ChannelRoleEnum> getRoles();
   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   
   @Valid
   @JsonProperty("reviewRatingStatistics")
   public ReviewRatingStatistics getReviewRatingStatistics();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   
   @JsonProperty("geoLocation")
   public Object getGeoLocation();

   public void setKey(final String key);
   
   public void setRoles(final List<ChannelRoleEnum> roles);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setAddress(final Address address);
   
   public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);
   
   public void setCustom(final CustomFields custom);
   
   public void setGeoLocation(final Object geoLocation);

   public String toJson();
   
   public static ChannelImpl of(){
      return new ChannelImpl();
   }
   
   
   public static ChannelImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, ChannelImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}