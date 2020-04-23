package com.ljw.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 使用java原生MessageDigest类实现MD5加密
 * @author luojw
 *
 */
public class MD5Utils {
	
	/**
	 * 实现小写32位加密字符
	 * @param text
	 * @return
	 */
	public static String md5_32_lower(String text) {
		try {
			byte[] s = encryptWithMd5(text);
			String result = byteToHexString(s);
			
			return result;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	/**
	 * 实现大写32位加密字符
	 * @param text
	 * @return
	 */
	public static String md5_32_upper(String text) {
		try {
			byte[] s = encryptWithMd5(text);
			String result = byteToHexString(s).toUpperCase();			
			return result;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	/**
	 * 实现小写16位加密字符
	 * @param text
	 * @return
	 */
	public static String md5_16_lower(String text) {
		try {
			byte[] s = encryptWithMd5(text);
			String result = byteToHexString(s).substring(8,24);
			
			return result;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	/**
	 * 实现大写16位加密字符
	 * @param text
	 * @return
	 */
	public static String md5_16_upper(String text) {
		try {
			byte[] s = encryptWithMd5(text);
			String result = byteToHexString(s).toUpperCase().substring(8,24);			
			return result;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	/**
	 * 使用MD5加密
	 * @param text
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	private static byte[] encryptWithMd5(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//使用MD5加密算法加密
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.update(text.getBytes("UTF8"));
		byte[] s = m.digest();
		return s;
	}
	
	
	/**
	 * 二进制转16进制
	 * @param b
	 * @return
	 */
	private static String byteToHexString(byte[] b ) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ;i < b.length;i++) {

            int val = 0xff & b[i];  //自动转为int类型
            if (val < 16) {//如果小于16后 转为16进制前面会少一位，需要在前面加0
            	sb.append("0"); 
            } 
			
			sb.append(Integer.toHexString(val));
		}
		return sb.toString();
	}
	
//	public static void main(String[] args) {
//		System.out.println(MD5Utils.md5_32_lower("123456"));
//		System.out.println(MD5Utils.md5_32_upper("123456"));
//		System.out.println(MD5Utils.md5_16_lower("123456"));
//		System.out.println(MD5Utils.md5_16_upper("123456"));
//	}
}
