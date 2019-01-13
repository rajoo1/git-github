package com.demo.util;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonUtil{
	/**
	 * This method convert JSON To Java Object
	 * @param objInput
	 * @param cls
	 * @return
	 */
	public static <T> T convertJsonToJavaObject(String objInput,Class<T> cls){
    	ObjectMapper mapper = new ObjectMapper();
    	T Objresult=null;
    	try {
    		Objresult =  mapper.readValue(objInput, cls);
    	}catch (Exception e) {
			e.printStackTrace();
		}
		return Objresult;
    }
	/**
	 * This method is convert Java Object To JSON
	 * @param object
	 * @return
	 */
	public static String convertJavaObjectToJson(Object object){
    	ObjectMapper mapper = new ObjectMapper();
    	String jsonResult = "";
    	try {
    		jsonResult =  mapper.writeValueAsString(object);
    	}catch (Exception e) {
			e.printStackTrace();
		}
		return jsonResult;
    }
	
	/**
	 * This method is convert Java Object Pretty To JSON
	 * @param object
	 * @return
	 */
	public static String convertJavaObjectPrettyToJson(Object object){
    	ObjectMapper mapper = new ObjectMapper();
    	String jsonPrettyResult = "";
    	try {
    		jsonPrettyResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    	}catch (Exception e) {
			e.printStackTrace();
		}
		return jsonPrettyResult;
    }
}