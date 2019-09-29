package org.soft.oa.product.utlis;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonToString {

	
	public String jsonString(String json,String value) {
		
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = jsonParser.parse(json).getAsJsonObject();
		value = jsonObject.get("'"+value+"'").getAsString();
		System.out.println(value);
		return value;
	}
}
