package com.gs.jdkclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	
	public static void main(String[] args) {
		// 单例模式
		Calendar cal = Calendar.getInstance(); // Calendar.getInstance()
		//用来获取Calendar类的对象，此对象用来表示时间日期的值
		Date date = cal.getTime();// getTime()获取一个Date对象
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(df.format(date));
		
		
		int year = cal.get(Calendar.YEAR); // 根据指定的字段来获取其值
		int month = cal.get(Calendar.MONTH) + 1; // 月份从0开始计数
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millis = cal.get(Calendar.MILLISECOND);
		System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second + ":" + millis);
		System.out.println(cal.getTimeZone()); // offset以毫秒为单位 
		
		System.out.println("weekOfMonth: " + cal.get(Calendar.WEEK_OF_MONTH)); // 月里的第几周
		System.out.println("weekOfYear: " + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("dayOfWeek: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("dayOfMonth: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("dayOfYear: " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("dayOfWeekInMonth: " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.YEAR, 2019);
		cal1.set(Calendar.MONTH, 10);
		cal1.set(Calendar.DATE, 10);
		cal1.set(Calendar.HOUR_OF_DAY, 10);
		cal1.set(Calendar.MINUTE, 30);
		cal1.set(Calendar.SECOND, 0);
		System.out.println(df.format(cal1.getTime()));
		System.out.println(cal1.getTimeInMillis());
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2016);
		cal2.set(Calendar.MONTH, 11);
		cal2.set(Calendar.DATE, 5);
		cal2.set(Calendar.HOUR_OF_DAY, 9);
		cal2.set(Calendar.MINUTE, 30);
		cal2.set(Calendar.SECOND, 0);
		
		// 请计算cal1与cal2相差了多少天
		System.out.println(DateUtil.dayBetweenDate(cal1.getTime(), cal2.getTime()));
		
		// 当前一个时间，请计算出基于当前时间后n天的日期
		cal.add(Calendar.DATE, -500); // 正数是往后推的时间，负数是往前推的时间 
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.HOUR, 1);
		System.out.println(DateUtil.defaultFormat(cal.getTime()));
		
		// 比较时间的先后   a.before(b)  a是否在b的前面  a.after(b)  a是否在b的后面
		if (cal1.before(cal2)) {
			System.out.println("cal1先于cal2");
		} else {
			System.out.println("cal1后于cal2");
		}
		
		if (cal1.after(cal2)) {
			
		}
		
		// 给定一个符合时间格式的字符串，把它转化为时间类型
		String dateStr = "2016/11/10 11:18:30";
		String dateStr1 = "2016年11月10日 11时18分30秒";
		try {
			DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date d = df1.parse(dateStr);
			System.out.println(DateUtil.defaultFormat(d));
			DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
			Date d1 = df2.parse(dateStr1);
			System.out.println(DateUtil.defaultFormat(d1));
		} catch (ParseException e) { // 格式解析异常
			e.printStackTrace();
		}
	}

}
