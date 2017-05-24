package com.reflect.integration.api.reporting.settings.serialization;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.reflect.integration.api.reporting.settings.Dimension;

public class DimensionDeserializer implements JsonDeserializer<Dimension> {
	@Override
	public Dimension deserialize(JsonElement arg0, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
		return new Dimension(arg0.getAsString());
	}
}
