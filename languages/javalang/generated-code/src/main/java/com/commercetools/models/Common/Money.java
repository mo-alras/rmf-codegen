package com.commercetools.models.Common;

import com.commercetools.models.Common.TypedMoney;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Common.MoneyImpl;

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
@JsonDeserialize(as = MoneyImpl.class)
public interface Money  {

   
   @NotNull
   @JsonProperty("centAmount")
   public Long getCentAmount();
   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   @NotNull
   @JsonProperty("currencyCode")
   public String getCurrencyCode();

   public void setCentAmount(final Long centAmount);
   
   public void setCurrencyCode(final String currencyCode);

   public String toJson();
   
   public static MoneyImpl of(){
      return new MoneyImpl();
   }
   
   
   public static MoneyImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, MoneyImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}