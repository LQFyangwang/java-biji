package com.gs.jdkclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	public static Date getCurrentDate() {
		return Calendar.getInstance().getTime();
	}
	
	public static long dayBetweenDate(Date d1, Date d2) {
		return (d1.getTime() - d2.getTime()) / 1000 / 60 / 60 / 24;
	}
	
	public static String format(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}
	
	public static String defaultFormat(Date date) {
		return new SimpleDateFormat(DEFAULT_PATTERN).format(date);
	}

}
