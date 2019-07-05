package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryReference;
import com.commercetools.models.Common.Asset;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import com.commercetools.models.Category.CategoryImpl;

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
@JsonDeserialize(as = CategoryImpl.class)
public interface Category extends LoggedResource {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("ancestors")
   public List<CategoryReference> getAncestors();
   
   @Valid
   @JsonProperty("parent")
   public CategoryReference getParent();
   
   @NotNull
   @JsonProperty("orderHint")
   public String getOrderHint();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();
   
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();
   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   @Valid
   @JsonProperty("assets")
   public List<Asset> getAssets();
   
   
   @JsonProperty("key")
   public String getKey();

   public void setName(final LocalizedString name);
   
   public void setSlug(final LocalizedString slug);
   
   public void setDescription(final LocalizedString description);
   
   public void setAncestors(final List<CategoryReference> ancestors);
   
   public void setParent(final CategoryReference parent);
   
   public void setOrderHint(final String orderHint);
   
   public void setExternalId(final String externalId);
   
   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setCustom(final CustomFields custom);
   
   public void setAssets(final List<Asset> assets);
   
   public void setKey(final String key);

   public String toJson();
   
   public static CategoryImpl of(){
      return new CategoryImpl();
   }
   
   
   public static CategoryImpl of(String json) {
      try{
          return CommercetoolsJsonUtils.fromJsonString(json, CategoryImpl.class);
      }catch (IOException e){
          e.printStackTrace();
      }
      return null;
   }

}