package com.inxedu.os.common.util;

/**
 * 字符串处理工具类
 * @author Administrator
 *
 */
public class StringUtil {
	public static boolean isNull(String str) {
		if(null == str) {
			return true;
		} else if (str.toString().trim().equals("")) {
			return true;
		} else if (str.toString().trim().toLowerCase().equals("null")) {
			return true;
		}
		return false;
	}
}































