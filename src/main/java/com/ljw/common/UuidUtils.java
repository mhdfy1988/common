package com.ljw.common;

import java.util.UUID;

public class UuidUtils {

	/**
	 * 生成不带-的UUID
	 * @return
	 */
	public static String ge32UUID() {
		return UUID.randomUUID().toString().trim().replace("-", "");
	}
	
	/**
	 * 生成带-分隔的UUID
	 * @return
	 */
	public static String getUUID() {
		return  UUID.randomUUID().toString();
	}
	
//	public static void main(String[] args) {
//		System.out.println(UuidUtils.ge32UUID());
//		System.out.println(UuidUtils.getUUID());
//	}
}
