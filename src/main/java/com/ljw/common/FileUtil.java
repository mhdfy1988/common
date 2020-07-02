package com.ljw.common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件操作工具类
 * @author luojw
 *
 */
public class FileUtil {
	
	/**
	 * 获取路径下所有文件路径
	 * @param file
	 * @return
	 */
	public static List<String>	getFilePaths(File file){
		List<String> fileList = new ArrayList<String>();
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File fs : files) {
				fileList.addAll(getFilePaths(fs));
			}
		}else {
			fileList.add(file.getPath());
		}
		return fileList;
	}
	
	/**
	 * 获取路径下指定后缀名文件路径
	 * @param file
	 * @param suffix
	 * @return
	 */
	public static List<String>	getFilePaths(File file,String suffix){
		List<String> fileList = new ArrayList<String>();
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File fs : files) {
				fileList.addAll(getFilePaths(fs,suffix));
			}
		}else {
			if(file.getName().endsWith("."+suffix)) {
				fileList.add(file.getPath());
			}
		}
		return fileList;
	}
	
	
	/**
	 * 获取路径下所有文件
	 * @param file
	 * @return
	 */
	public static List<File>	getFiles(File file){
		List<File> fileList = new ArrayList<File>();
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File fs : files) {
				fileList.addAll(getFiles(fs));
			}
		}else {
			fileList.add(file);
		}
		return fileList;
	}
	
	/**
	 * 获取路径下指定后缀名文件
	 * @param file
	 * @param suffix
	 * @return
	 */
	public static List<File>	getFiles(File file,String suffix){
		List<File> fileList = new ArrayList<File>();
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File fs : files) {
				fileList.addAll(getFiles(fs,suffix));
			}
		}else {
			if(file.getName().endsWith("."+suffix)) {
				fileList.add(file);
			}
		}
		return fileList;
	}
}
