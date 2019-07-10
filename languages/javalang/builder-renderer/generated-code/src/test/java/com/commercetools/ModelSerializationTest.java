package com.commercetools;

import com.commercetools.models.Category.*;
import com.commercetools.models.Common.*;
import com.commercetools.models.Type.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ModelSerializationTest {
    
    @Test
    public void serializeCategoryDraftToJson() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue("test-key", "test-value");
        String key = "test-key";
        String id = "test-id";
        String testString = "test-string";
        
        Map<String, Object> fieldContainerValues = new HashMap<>();
        fieldContainerValues.put(key, testString);
        FieldContainer fieldContainer = FieldContainerBuilder.of().values(fieldContainerValues).build();
        
        AssetDraft assetDraft = AssetDraftBuilder.of()
                .description(localizedString)
                .key(key)
                .name(localizedString)
                .custom(CustomFieldsDraftBuilder.of()
                        .fields(fieldContainer)
                        .type("string type")
                        .build())
                .sources(Arrays.asList(AssetSourceBuilder.of().contentType("application/json").dimensions(AssetDimensionsBuilder.of().h(10).w(5).build()).build()))
                .tags(Arrays.asList("tag 1", "tag 2"))
                .build();
                
        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .parent(CategoryResourceIdentifierBuilder.of().id(id).key(key).build())
                .assets(Arrays.asList(assetDraft))
                .custom(CustomFieldsDraftBuilder.of().type("string type").fields(fieldContainer).build())
                .description(localizedString)
                .externalId(id)
                .key(key)
                .metaDescription(localizedString)
                .metaKeywords(localizedString)
                .metaTitle(localizedString)
                .name(localizedString)
                .orderHint(testString)
                .slug(localizedString)
                .build();
        
        String categoryDraftJson = categoryDraft.toJson();
        
        try{
            final URL url = Thread.currentThread().getContextClassLoader().getResource("json_examples/category-draft-example.json");
            String categoryDraftExample = new String(Files.readAllBytes(Paths.get(url.getPath())));
            Assert.assertEquals(categoryDraftJson, categoryDraftExample);
        }catch (IOException e){
            e.printStackTrace();
            Assert.fail();
        }
    }
    
    @Test
    public void serializeProductDraftToJson() {
        
    }
    
    @Test
    public void deserializeCategoryFromJson() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue("test-key", "test-value");
        String key = "test-key";
        String id = "test-id";
        String testString = "test-string";

        Map<String, Object> fieldContainerValues = new HashMap<>();
        fieldContainerValues.put(key, testString);
        FieldContainer fieldContainer = FieldContainerBuilder.of().values(fieldContainerValues).build();

        CustomFields customFields = CustomFieldsBuilder.of()
                .fields(fieldContainer)
                .type(TypeReferenceBuilder.of().key(key).obj(Type.of()).build())
                .build();

        
        Asset asset = AssetBuilder.of()
                .custom(customFields)
                .description(localizedString)
                .id(id)
                .key(key)
                .name(localizedString)
                .sources(Arrays.asList(AssetSourceBuilder.of().contentType("application/json").dimensions(AssetDimensionsBuilder.of().h(10).w(5).build()).build()))
                .tags(Arrays.asList("tag 1", "tag 2"))
                .build();
        
        CategoryReference reference = CategoryReferenceBuilder.of()
                .key(key)
                .id(id)
                .obj(Category.of())
                .build();

        Category category = CategoryBuilder.of()
                .key(key)
                .id(id)
                .ancestors(Arrays.asList(reference))
                .assets(Arrays.asList(asset))
                .custom(customFields)
                .description(localizedString)
                .externalId(id)
                .metaDescription(localizedString)
                .metaKeywords(localizedString)
                .metaTitle(localizedString)
                .name(localizedString)
                .orderHint(testString)
                .parent(reference)
                .slug(localizedString)
                .createdAt(ZonedDateTime.of(2019, 12, 12, 12, 12, 12, 12, ZoneId.ofOffset("UTC", ZoneOffset.ofHours(1))))
                .build();
        
        try{
            final URL url = Thread.currentThread().getContextClassLoader().getResource("json_examples/category-example.json");
            String categoryExampleJsonString = new String(Files.readAllBytes(Paths.get(url.getPath())));
            Category exampleCategory = Category.of(categoryExampleJsonString);
            Assert.assertEquals(category.toJson(), exampleCategory.toJson());
        }catch (IOException e){
            e.printStackTrace();
            Assert.fail();
        }
    }
    
    @Test
    public void deserializeProductFromJson() throws Exception {
        
    }
}