package com.ljw.common;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * HTTP请求工具类
 * @author luojw
 *
 */
public class HttpUtils {
	
	/**
	 * get请求
	 * @param url
	 * @return
	 */
	public static String doGet(String url) {
		String result = null;
		
		//创建默认配置HTTPCLIENT实例
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//创建httpGet请求实例
		HttpGet httpGet = new HttpGet(url);
		try {
			//response
			HttpResponse response =   httpClient.execute(httpGet);
			if(response != null) {
				HttpEntity resEntity = response.getEntity();
				if(resEntity != null) {
					//结果
					result = EntityUtils.toString(resEntity,"UTF-8");
				}
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * 不带参数的post请求
	 * @param url
	 * @return
	 */
	public static String doPost(String url) {
		String result = null;
		//创建默认配置HTTPCLIENT实例
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		try {
			HttpResponse response = httpClient.execute(httpPost);
			if(response != null) {
				HttpEntity resEntity = response.getEntity();
				if(resEntity != null) {
					//结果
					result = EntityUtils.toString(resEntity,"UTF-8");
				}
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	/**
	 * 带map参数的post请求
	 * @param url
	 * @param paramMap
	 * @return
	 */
	public static String doPost(String url,Map<String,String> paramMap) {
		String result = null;
		
		//创建默认配置HTTPCLIENT实例
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		
		//组装参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		for(Entry<String, String> entity :paramMap.entrySet()) {
			params.add(new BasicNameValuePair(entity.getKey(), entity.getValue()));
		}
		
		try {
			if(params.size() > 0) {
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params,Consts.UTF_8);
				httpPost.setEntity(entity);
			}
			HttpResponse response = httpClient.execute(httpPost);
			if(response != null) {
				HttpEntity resEntity = response.getEntity();
				if(resEntity != null) {
					//结果
					result = EntityUtils.toString(resEntity,"UTF-8");
				}
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	/**
	 * 带json字符串参数的post请求
	 * @param url
	 * @param jsonStr
	 * @return
	 */
	public static String doPost(String url,String jsonStr) {
		String result = null;
		
		//创建默认配置HTTPCLIENT实例
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		
		if(!StringUtils.isEmpty(jsonStr)) {
			StringEntity entity = new StringEntity(jsonStr,Consts.UTF_8);
			entity.setContentType("application/json;charset=UTF-8");
			httpPost.setEntity(entity);
		}
		
		try {
			HttpResponse response = httpClient.execute(httpPost);
			if(response != null) {
				HttpEntity resEntity = response.getEntity();
				if(resEntity != null) {
					//结果
					result = EntityUtils.toString(resEntity,"UTF-8");
				}
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
	
	
//	public static void main(String[] args) {
//		String url = "http://172.16.71.32:8080/test?name=ljw&age=21";
//		String result = HttpUtils.doGet(url);
//		System.out.println(result);
		
//		String url = "http://172.16.71.32:8080/testNo";
//		String result = HttpUtils.doPost(url);
//		System.out.println(result);
		
//		String url = "http://172.16.71.32:8080/testMap";
//		Map<String,String> map = new HashMap<String, String>(); 
//		map.put("name", "ljw");
//		map.put("age", "22");
//		String result = HttpUtils.doPost(url, map);
//		System.out.println(result);
		
//		String jsonStr = "{\"name\":\"ljw3\",\"age\":\"23\"}";
//		
//		String url1 = "http://172.16.71.32:8080/testJson1";
//		String result1 = HttpUtils.doPost(url1,jsonStr);
//		System.out.println(result1);
//		
//		String url2 = "http://172.16.71.32:8080/testJson2";
//		String result2 = HttpUtils.doPost(url2,jsonStr);
//		System.out.println(result2);
//		
//		
//		String url3 = "http://172.16.71.32:8080/testJson3";
//		String result3 = HttpUtils.doPost(url3,jsonStr);
//		System.out.println(result3);
//	}
}	
