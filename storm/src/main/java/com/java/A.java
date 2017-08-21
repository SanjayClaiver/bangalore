package com.java;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class A {

	public static final String JSON_FILE = "F://test//def.txt";

	public static void main(String[] args) {

		Gson gson = new GsonBuilder().setLenient().create();

		JsonArray jsonArray = gson.fromJson (JSON_FILE, JsonElement.class).getAsJsonArray(); // Convert the Json string to JsonArray

		JsonObject jsonObj = jsonArray.get(0).getAsJsonObject(); //Get the first element of array and convert it to Json object

		Pojo pojo = gson.fromJson(jsonObj.get("data").toString(), Pojo.class); //Get the data property from json object and convert it to Pojo object

	}

}
