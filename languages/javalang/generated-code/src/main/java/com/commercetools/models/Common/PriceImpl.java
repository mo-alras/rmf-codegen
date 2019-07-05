package com.commercetools.models.Common;

import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Common.PriceTier;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
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
public class PriceImpl implements Price {

   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   private String country;
   
   private List<PriceTier> tiers;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private com.commercetools.models.Channel.ChannelReference channel;
   
   private ZonedDateTime validUntil;
   
   private ZonedDateTime validFrom;
   
   private String id;
   
   private com.commercetools.models.Common.Money value;

   @JsonCreator
   PriceImpl(@JsonProperty("discounted") final com.commercetools.models.Common.DiscountedPrice discounted, @JsonProperty("country") final String country, @JsonProperty("tiers") final List<PriceTier> tiers, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("channel") final com.commercetools.models.Channel.ChannelReference channel, @JsonProperty("validUntil") final ZonedDateTime validUntil, @JsonProperty("validFrom") final ZonedDateTime validFrom, @JsonProperty("id") final String id, @JsonProperty("value") final com.commercetools.models.Common.Money value) {
      this.discounted = discounted;
      this.country = country;
      this.tiers = tiers;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.channel = channel;
      this.validUntil = validUntil;
      this.validFrom = validFrom;
      this.id = id;
      this.value = value;
   }
   public PriceImpl() {
      
   }
   
   
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   
   public List<PriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   
   public ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Common.Money getValue(){
      return this.value;
   }

   public void setDiscounted(final com.commercetools.models.Common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setTiers(final List<PriceTier> tiers){
      this.tiers = tiers;
   }
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setChannel(final com.commercetools.models.Channel.ChannelReference channel){
      this.channel = channel;
   }
   
   public void setValidUntil(final ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setValue(final com.commercetools.models.Common.Money value){
      this.value = value;
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