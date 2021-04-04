package com.hatim.chisel.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class ChiselUtils {

	private static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * 
	 * @param Object
	 * @return JSON
	 * @throws JsonProcessingException
	 */
	public static String objectToJson(Object object) throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(object);
		return jsonString;
	}

	/**
	 * @param JSON
	 * @param class
	 * @return Object
	 */
	public static <T> T jsonToObject(String json, Class<T> clazz) {
		return new Gson().fromJson(json, clazz);
	}
}
