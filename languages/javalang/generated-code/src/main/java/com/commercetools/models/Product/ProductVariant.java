package com.commercetools.models.Product;

import com.commercetools.models.Common.Asset;
import com.commercetools.models.Common.Image;
import com.commercetools.models.Common.Price;
import com.commercetools.models.Common.ScopedPrice;
import com.commercetools.models.Product.Attribute;
import com.commercetools.models.Product.ProductVariantAvailability;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductVariantImpl;

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
@JsonDeserialize(as = ProductVariantImpl.class)
public interface ProductVariant  {

   
   @NotNull
   @JsonProperty("id")
   public Long getId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("prices")
   public List<Price> getPrices();
   
   @Valid
   @JsonProperty("attributes")
   public List<Attribute> getAttributes();
   
   @Valid
   @JsonProperty("price")
   public Price getPrice();
   
   @Valid
   @JsonProperty("images")
   public List<Image> getImages();
   
   @Valid
   @JsonProperty("assets")
   public List<Asset> getAssets();
   
   @Valid
   @JsonProperty("availability")
   public ProductVariantAvailability getAvailability();
   
   
   @JsonProperty("isMatchingVariant")
   public Boolean getIsMatchingVariant();
   
   @Valid
   @JsonProperty("scopedPrice")
   public ScopedPrice getScopedPrice();
   
   
   @JsonProperty("scopedPriceDiscounted")
   public Boolean getScopedPriceDiscounted();

   public void setId(final Long id);
   
   public void setSku(final String sku);
   
   public void setKey(final String key);
   
   public void setPrices(final List<Price> prices);
   
   public void setAttributes(final List<Attribute> attributes);
   
   public void setPrice(final Price price);
   
   public void setImages(final List<Image> images);
   
   public void setAssets(final List<Asset> assets);
   
   public void setAvailability(final ProductVariantAvailability availability);
   
   public void setIsMatchingVariant(final Boolean isMatchingVariant);
   
   public void setScopedPrice(final ScopedPrice scopedPrice);
   
   public void setScopedPriceDiscounted(final Boolean scopedPriceDiscounted);

   public String toJson();
   
   public static ProductVariantImpl of(){
      return new ProductVariantImpl();
   }
   
   
   public static ProductVariantImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, ProductVariantImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}