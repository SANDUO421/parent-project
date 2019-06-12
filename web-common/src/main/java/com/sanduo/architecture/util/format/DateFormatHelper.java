package com.sanduo.architecture.util.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
* @Description:    日期格式化
* @Author:         sanduo
* @CreateDate:     2019/6/11 17:36
* @Version:        1.0
*/
public class DateFormatHelper {
	
	private DateFormatHelper(){}
	private final static String FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
	public static String long2str(long time){
		Date d = new Date(time);
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		return df.format(d);
	}
//	public static long str2long(String str){
//		DateFormat df = new SimpleDateFormat(FORMAT_STR);
//		return df.parse(str).getTime();
//	}
}
