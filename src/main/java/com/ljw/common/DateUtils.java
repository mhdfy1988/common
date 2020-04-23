package com.ljw.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import org.apache.commons.lang3.StringUtils;

public class DateUtils {
	
	private static final String YYYYMMDD = "yyyy-MM-dd";
	
	private static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	
	
	
	/**
	 * 获取当前日期（默认格式：yyyy-MM-dd）
	 * @return
	 */
	public static String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDD);
		return sdf.format(new Date());
	}
	
	
	/**
	 * 获取当前日期,须指定格式
	 * @return
	 */
	public static String getCurrentDate(String pattern) {
		if(StringUtils.isEmpty(pattern)) {
			pattern = YYYYMMDD;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date());
	}
	
	
	/**
	 * 获取当前时间(默认格式：yyyy-MM-dd HH:mm:ss)
	 * @param args
	 */
	public static String getCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDDHHMMSS);
		return sdf.format(new Date());
	}
	
	/**
	 * 获取当前时间，须指定格式
	 * @param pattern
	 * @return
	 */
	public static String getCurrentTime(String pattern) {
		if(StringUtils.isEmpty(pattern)) {
			pattern = YYYYMMDDHHMMSS;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date());
	}
	
	/**
	 * 获取时间字符串
	 * @param timestamp 时间戳 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static String getDateStr(Long timestamp) {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDDHHMMSS);
		return sdf.format(new Date(timestamp));
	}
	
	/**
	 * 获取时间字符串
	 * @param timestamp 时间戳
	 * @param pattern 字符串格式
	 * @return
	 */
	public static String getDateStr(Long timestamp,String pattern) {
		if(StringUtils.isEmpty(pattern)) {
			pattern = YYYYMMDDHHMMSS;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date(timestamp));
	}
	
	/**
	 * 获取时间字符串
	 * @param date 时间 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static String getDateStr(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDDHHMMSS);
		return sdf.format(date);
	}
	
	/**
	 * 获取时间字符串
	 * @param date  时间
	 * @param pattern 字符串格式
	 * @return
	 */
	public static String getDateStr(Date date,String pattern) {
		if(StringUtils.isEmpty(pattern)) {
			pattern = YYYYMMDDHHMMSS;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	/**
	 * 获取时间
	 * @param timestamp  时间戳
	 * @return
	 */
	public static Date getDate(Long timestamp) {
		return new Date(timestamp);
	}
	
	/**
	 * 获取时间 
	 * @param datestr 时间字符串
	 * @param pattern 字符串格式
	 * @return
	 */
	public static Date getDate(String datestr,String pattern) {
		if(StringUtils.isEmpty(pattern)) {
			pattern = YYYYMMDDHHMMSS;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取时间
	 * @param datestr 时间字符串 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static Date getDate(String datestr) {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDDHHMMSS);
		try {
			return sdf.parse(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获得时间戳
	 * @param date 时间
	 * @return
	 */
	public static Long getTimestamp(Date date) {
		return date.getTime();
	}
	
	/**
	 * 获取时间戳
	 * @param datestr 时间字符串 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static Long getTimestamp(String datestr) {
		return getDate(datestr).getTime();
	}
	
	
	/**
	 * 获取时间戳
	 * @param datestr 时间字符串 
	 * @return
	 */
	public static Long getTimestamp(String datestr,String pattern) {
		return getDate(datestr,pattern).getTime();
	}
	
	/**
	 * 获取年
	 * @param date 时间
	 * @return
	 */
	public static int getYear(Date date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		return ca.get(Calendar.YEAR);
	}
	
	/**
	 * 获取年 
	 * @param date 时间字符串 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static int getYear(String date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(date));
		return ca.get(Calendar.YEAR);
	}
	
	/**
	 * 获取年
	 * @param date 时间字符串
	 * @param pattern 时间格式
	 * @return
	 */
	public static int getYear(String date,String pattern) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(date,pattern));
		return ca.get(Calendar.YEAR);
	}
	
	/**
	 * 获取月
	 * @param date 时间
	 * @return
	 */
	public static int getMonth(Date date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		return ca.get(Calendar.MONTH)+1;
	}
	
	/**
	 * 获取月
	 * @param date 时间字符串 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static int getMonth(String date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(date));
		return ca.get(Calendar.MONTH)+1;
	}
	
	/**
	 * 获取月
	 * @param date 时间字符串
	 * @param pattern 时间格式
	 * @return
	 */
	public static int getMonth(String date,String pattern) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(date,pattern));
		return ca.get(Calendar.MONTH)+1;
	}
	
	
	/**
	 * 获取天
	 * @param date 时间
	 * @return
	 */
	public static int getDay(Date date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		return ca.get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 获取天
	 * @param date 时间字符串 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static int getDay(String date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(date));
		return ca.get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 获取天
	 * @param date 时间字符串
	 * @param pattern 时间格式
	 * @return
	 */
	public static int getDay(String date,String pattern) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(date,pattern));
		return ca.get(Calendar.DAY_OF_MONTH);
	}
	
	public static void main(String[] args) {
		System.out.println(DateUtils.getCurrentDate());
		System.out.println(DateUtils.getCurrentDate("yyyy_MM_dd"));
		
		System.out.println(DateUtils.getCurrentTime());
		System.out.println(DateUtils.getCurrentTime("yyyyMMddHHmmss"));
		
		System.out.println(DateUtils.getDateStr(new Date()));
		System.out.println(DateUtils.getDateStr(new Date().getTime()));
		
		System.out.println(DateUtils.getDateStr(new Date(),"yyyyMMddHHmmss"));
		System.out.println(DateUtils.getDateStr(new Date().getTime(),"yyyyMMddHHmmss"));
		
		System.out.println(DateUtils.getDate("2020-04-23 11:11:11"));
		System.out.println(DateUtils.getDate("20200423111111","yyyyMMddHHmmss"));
		System.out.println(DateUtils.getDate(new Date().getTime()));
		
		System.out.println(DateUtils.getTimestamp(new Date()));
		System.out.println(DateUtils.getTimestamp("2020-04-23 11:11:11"));
		System.out.println(DateUtils.getTimestamp("20200423111111","yyyyMMddHHmmss"));

		System.out.println(DateUtils.getYear(new Date()));
		System.out.println(DateUtils.getYear("2021-04-23 11:11:11"));
		System.out.println(DateUtils.getYear("20190423111111","yyyyMMddHHmmss"));
		
		System.out.println(DateUtils.getMonth(new Date()));
		System.out.println(DateUtils.getMonth("2021-04-23 11:11:11"));
		System.out.println(DateUtils.getMonth("20190423111111","yyyyMMddHHmmss"));
		
		System.out.println(DateUtils.getDay(new Date()));
		System.out.println(DateUtils.getDay("2021-04-29 11:11:11"));
		System.out.println(DateUtils.getDay("20190421111111","yyyyMMddHHmmss"));
		
		
		
	}
	

}
