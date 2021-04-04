package com.hatim.chisel.sdk;

import java.util.Map;

public interface processflow {

	public Object get(String pathVar, String jsonRequestBody, Map<String, String> httpHeaders);

	public Object post(String pathVar, String jsonRequestBody, Map<String, String> httpHeaders);

	public Object put(String pathVar, String jsonRequestBody, Map<String, String> httpHeaders);

	public Object patch(String pathVar, String jsonRequestBody, Map<String, String> httpHeaders);

	public Object delete(String pathVar, String jsonRequestBody, Map<String, String> httpHeaders);
	
	public Object connect(String pathVar, String jsonRequestBody, Map<String, String> httpHeaders);
	
	public Object options(String pathVar, String jsonRequestBody, Map<String, String> httpHeaders);
	
	public Object trace(String pathVar, String jsonRequestBody, Map<String, String> httpHeaders);
}