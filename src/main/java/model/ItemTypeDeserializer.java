package model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class ItemTypeDeserializer extends StdDeserializer<ItemType> {

  public ItemTypeDeserializer() {
    super(ItemType.class);
  }

  @Override
  public ItemType deserialize(JsonParser p, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {

    JsonNode json =ctxt.readTree(p);
    if (!json.isTextual()||json.textValue()==null){
      throw new IllegalStateException("ItemType needs a text value");
    }
    if ("Item_Type_Auto_Recurring_Subscription".equals(json.textValue())) {
      return ItemType.AUTO_RECURRING_SUBSCRIPTION;
    }
    throw new IllegalStateException("Bad ItemType value: " + json.textValue());
  }
}
