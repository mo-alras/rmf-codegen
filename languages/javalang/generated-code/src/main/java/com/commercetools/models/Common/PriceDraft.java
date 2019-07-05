package com.commercetools.models.Common;

import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Common.PriceTier;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Common.PriceDraftImpl;

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
@JsonDeserialize(as = PriceDraftImpl.class)
public interface PriceDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("value")
   public Money getValue();
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   
   @JsonProperty("country")
   public String getCountry();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   
   @Valid
   @JsonProperty("channel")
   public ChannelReference getChannel();
   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("tiers")
   public List<PriceTier> getTiers();

   public void setValue(final Money value);
   
   public void setCountry(final String country);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setChannel(final ChannelReference channel);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setTiers(final List<PriceTier> tiers);

   public String toJson();
   
   public static PriceDraftImpl of(){
      return new PriceDraftImpl();
   }
   
   
   public static PriceDraftImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, PriceDraftImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}