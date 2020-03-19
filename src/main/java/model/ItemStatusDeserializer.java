package model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class ItemStatusDeserializer extends StdDeserializer<ItemStatus> {

  public ItemStatusDeserializer() {
    super(ItemStatus.class);
  }

  @Override
  public ItemStatus deserialize(JsonParser p, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {

    JsonNode json = ctxt.readTree(p);
    if (!json.isTextual() || json.textValue() == null) {
      throw new IllegalStateException("ItemStatus needs a text value");
    }
    switch (json.textValue()) {
      case "ACTIVE":
        return ItemStatus.ACTIVE;
      case "CANCEL":
        return ItemStatus.CANCELED;
    }
    throw new IllegalStateException("Bad ItemStatus value: " + json.textValue());
  }
}
