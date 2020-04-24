package com.ljw.common;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * JSON操作工具类
 * @author Administrator
 *
 */
public class JsonUtils {
	
	/**
	 * java对象转json字符串
	 * @param O
	 * @return
	 */
	public static String objToJSONStr(Object O) {
		return JSON.toJSONString(O);
	}
	
	/**
	 * json字符串转java对象
	 * @param str
	 * @param type
	 * @return
	 */
	public static <T> Object jsonStrToJavaObj(String str,Class<T> type) {
		return JSON.parseObject(str).toJavaObject(type);
	}
	
	/**
	 * json转字符串
	 * @param jsonObject
	 * @return
	 */
	public static String jsonToJSONStr(JSONObject jsonObject) {
		return jsonObject.toJSONString();
	}
	
	/**
	 * 字符串转json
	 * @param str
	 * @return
	 */
	public static JSONObject stringToJson(String str) {
		return JSON.parseObject(str);
	}
	
	/**
	 * Java对象转JSON对象
	 * @param o
	 * @return
	 */
	public static JSONObject javaObjToJSONObj(Object o) {
		return JSON.parseObject(JSON.toJSONString(o));
	}
	
	/**
	 * json对象转java对象
	 * @param jsonObject
	 * @param type
	 * @return
	 */
	public static <T> Object jsonToJavaObj(JSONObject jsonObject,Class<T> type) {
		return jsonObject.toJavaObject(type);
	}
	
	/**
	 * 字符串转json数组
	 * @param str
	 * @return
	 */
	public static JSONArray jsonStrToJSONArray(String str) {
		return JSONArray.parseArray(str);
	}
	
	/**
	 * json数组转字符串
	 * @param jsonArray
	 * @return
	 */
	public static String jsonArrayToJsonStr(JSONArray jsonArray) {
		return jsonArray.toJSONString();
	}
	
	/**
	 * json数组转List
	 * @param jsonArray
	 * @param type
	 * @return
	 */
	public static <T> List  jsonArrayToList(JSONArray jsonArray,Class<T> type){
		return jsonArray.toJavaList(type);
	}
	
	/**
	 * list转jsonArray
	 * @param list
	 * @return
	 */
	public static  JSONArray listToJsonArray(List list) {
		return JSONArray.parseArray(JSON.toJSONString(list));
	}
	
	/**
	 * list转字符串
	 * @param list
	 * @return
	 */
	public static String listToStr(List list) {
		return JSON.toJSONString(list);
	}
	
	/**
	 * 字符串转List
	 * @param str
	 * @param type
	 * @return
	 */
	public static <T> List strToList(String str,Class<T> type) {
		return JSONObject.parseArray(str, type);
	}
	
//	public static void main(String[] args) {
//		String jsonstr = "{'name':'ljw','age':'21'}";
//		
//		JSONObject jsonObject = stringToJson(jsonstr);
//		System.out.println(jsonObject.get("name"));
//		System.out.println(jsonObject.get("age"));
//		
//		Person p = (Person) jsonStrToJavaObj(jsonstr,Person.class);
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		
//		System.out.println(objToJSONStr(p));
//		
//		System.out.println(jsonToJSONStr(jsonObject));
//		
//		JSONObject  jsonobj1 = javaObjToJSONObj(p);
//		System.out.println(jsonobj1.get("name"));
//		System.out.println(jsonobj1.get("age"));
//		
//		
//		Person p1 = (Person) jsonToJavaObj(jsonObject,Person.class);
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		
//		String strArr = "[{'name':'ljw1','age':'21'},{'name':'ljw2','age':'22'}]";
//		
//		JSONArray jsonArray1 = jsonStrToJSONArray(strArr);
//		System.out.println(jsonArray1);
//		
//		String strArr2 = jsonArrayToJsonStr(jsonArray1);
//		System.out.println(strArr2);
//		
//		List<Person>  list1 = jsonArrayToList(jsonArray1, Person.class);
//		
//		JSONArray jsonArray2 = listToJsonArray(list1);
//		System.out.println(jsonArray2);
//		
//		List<Person> list2 = strToList(strArr, Person.class);
//		
//		String str3 = listToStr(list2);
//		System.out.println(str3);
//		
//		
//		
//	}
}
