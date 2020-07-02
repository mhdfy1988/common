package com.ljw.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import org.apache.commons.lang3.StringUtils;

/**
 * 时间操作工具类
 * @author luojw
 *
 */
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
	
	/**
	 * 获取指定时间间隔N年的时间
	 * @param date 时间
	 * @param num 间隔年
	 * @return
	 */
	public static Date getDateByIntervalYear(Date date,int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(Calendar.YEAR, num);
		return ca.getTime();
	} 
	
	/**
	 * 获取指定时间间隔N年的时间
	 * @param dateStr 时间字符串 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @param num 间隔年
	 * @return
	 */
	public static Date getDateByIntervalYear(String dateStr,int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(dateStr));
		ca.add(Calendar.YEAR, num);
		return ca.getTime();
	} 
	
	/**
	 * 获取指定时间间隔N年的时间
	 * @param dateStr 时间字符串
	 * @param num	间隔年
	 * @param pattern 时间格式
	 * @return
	 */
	public static Date getDateByIntervalYear(String dateStr,int num,String pattern) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(dateStr,pattern));
		ca.add(Calendar.YEAR, num);
		return ca.getTime();
	} 
	
	/**
	 * 获取指定时间间隔N月的时间
	 * @param date 时间
	 * @param num 间隔月
	 * @return
	 */
	public static Date getDateByIntervalMonth(Date date,int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(Calendar.MONTH, num);
		return ca.getTime();
	} 
	
	/**
	 * 获取指定时间间隔N月的时间
	 * @param dateStr 时间字符串 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @param num 间隔月
	 * @return
	 */
	public static Date getDateByIntervalMonth(String dateStr,int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(dateStr));
		ca.add(Calendar.MONTH, num);
		return ca.getTime();
	} 
	
	/**
	 * 获取指定时间间隔N月的时间
	 * @param dateStr 时间字符串
	 * @param num	间隔月
	 * @param pattern 时间格式
	 * @return
	 */
	public static Date getDateByIntervalMonth(String dateStr,int num,String pattern) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(dateStr,pattern));
		ca.add(Calendar.MONTH, num);
		return ca.getTime();
	} 
	
	/**
	 * 获取指定时间间隔N天的时间
	 * @param date 时间
	 * @param num 间隔天
	 * @return
	 */
	public static Date getDateByIntervalDay(Date date,int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(Calendar.DATE, num);
		return ca.getTime();
	} 
	
	/**
	 * 获取指定时间间隔N天的时间
	 * @param dateStr 时间字符串 （默认格式：yyyy-MM-dd HH:mm:ss）
	 * @param num 间隔天
	 * @return
	 */
	public static Date getDateByIntervalDay(String dateStr,int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(dateStr));
		ca.add(Calendar.DATE, num);
		return ca.getTime();
	} 
	
	/**
	 * 获取指定时间间隔N天的时间
	 * @param dateStr 时间字符串
	 * @param num	间隔天
	 * @param pattern 时间格式
	 * @return
	 */
	public static Date getDateByIntervalDay(String dateStr,int num,String pattern) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(getDate(dateStr,pattern));
		ca.add(Calendar.DATE, num);
		return ca.getTime();
	} 
	
	/**
	 * 将时间字符串以指定格式输出
	 * @param dataStr 时间字符串
	 * @param oldPattern 旧时间格式
	 * @param newPattern 新时间格式
	 * @return
	 */
	public static String getDateStr(String dataStr,String oldPattern,String newPattern) {
		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat(oldPattern);
			Date d = sdf1.parse(dataStr);
			SimpleDateFormat sdf2 = new SimpleDateFormat(newPattern);
			return sdf2.format(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getDateStr(getDateByIntervalMonth(new Date(), -2),"yyyyMMdd"));
		
	}
	
//	public static void main(String[] args) {
//		System.out.println(DateUtils.getCurrentDate());
//		System.out.println(DateUtils.getCurrentDate("yyyy_MM_dd"));
//		
//		System.out.println(DateUtils.getCurrentTime());
//		System.out.println(DateUtils.getCurrentTime("yyyyMMddHHmmss"));
//		
//		System.out.println(DateUtils.getDateStr(new Date()));
//		System.out.println(DateUtils.getDateStr(new Date().getTime()));
//		
//		System.out.println(DateUtils.getDateStr(new Date(),"yyyyMMddHHmmss"));
//		System.out.println(DateUtils.getDateStr(new Date().getTime(),"yyyyMMddHHmmss"));
//		
//		System.out.println(DateUtils.getDate("2020-04-23 11:11:11"));
//		System.out.println(DateUtils.getDate("20200423111111","yyyyMMddHHmmss"));
//		System.out.println(DateUtils.getDate(new Date().getTime()));
//		
//		System.out.println(DateUtils.getTimestamp(new Date()));
//		System.out.println(DateUtils.getTimestamp("2020-04-23 11:11:11"));
//		System.out.println(DateUtils.getTimestamp("20200423111111","yyyyMMddHHmmss"));
//
//		System.out.println(DateUtils.getYear(new Date()));
//		System.out.println(DateUtils.getYear("2021-04-23 11:11:11"));
//		System.out.println(DateUtils.getYear("20190423111111","yyyyMMddHHmmss"));
//		
//		System.out.println(DateUtils.getMonth(new Date()));
//		System.out.println(DateUtils.getMonth("2021-04-23 11:11:11"));
//		System.out.println(DateUtils.getMonth("20190423111111","yyyyMMddHHmmss"));
//		
//		System.out.println(DateUtils.getDay(new Date()));
//		System.out.println(DateUtils.getDay("2021-04-29 11:11:11"));
//		System.out.println(DateUtils.getDay("20190421111111","yyyyMMddHHmmss"));
//		
//		System.out.println(DateUtils.getDateByIntervalYear(new Date(), 1));
//		System.out.println(DateUtils.getDateByIntervalYear("2015-11-11 12:11:11", 5));
//		System.out.println(DateUtils.getDateByIntervalYear("20151111121111", -1,"yyyyMMddHHmmss"));
//		
//		System.out.println(DateUtils.getDateByIntervalMonth(new Date(), 1));
//		System.out.println(DateUtils.getDateByIntervalMonth("2015-11-11 12:11:11", 5));
//		System.out.println(DateUtils.getDateByIntervalMonth("20151111121111", -1,"yyyyMMddHHmmss"));
//		
//		System.out.println(DateUtils.getDateByIntervalDay(new Date(), 1));
//		System.out.println(DateUtils.getDateByIntervalDay("2015-11-11 12:11:11", 5));
//		System.out.println(DateUtils.getDateByIntervalDay("20151111121111", -1,"yyyyMMddHHmmss"));
//		
//		System.out.println(DateUtils.getDateStr("2020-01-02 11:22:33", "yyyy-MM-dd HH:mm:ss", "yyyyMMdd"));
//	}
	

}
