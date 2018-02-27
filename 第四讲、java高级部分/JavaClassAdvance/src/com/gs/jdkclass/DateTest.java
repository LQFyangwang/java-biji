package com.gs.jdkclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	// 警告压制，@SuppressWarnings("")   deprecation表示被弃用。。。把被弃用的警告压制下去
	// 可以给某个单独的警告进行压制，也可以对包含有多个警告的方法进行压制，也可以对类里的任何一个警告进行压制
	@SuppressWarnings({ "unused", "deprecation"})
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()); // 相对于1970年1月1日 0:0:0秒的一个毫秒值差
		
		Date date = new Date();
		System.out.println(date.getTime()); // 相对于1900年1月1日 0:0:0秒的一个毫秒值差
		//　表示此方法已经被弃用了，最好不要去用这样的方法，可以使用JDK提供的替代的方案
		
		int a = 10;
		int b = 20;
		
		int year = date.getYear() + 1900; // year相对于1900年，所以要加上1900
		int month = date.getMonth() + 1; // 获取的月份从0开始
		int day = date.getDate();
		int hour = date.getHours();
		int minute = date.getMinutes();
		int second = date.getSeconds();
		int weekend = date.getDay(); // 获取星期
		String weekendStr = "";
		switch (weekend) {
		case 1: weekendStr = "星期一"; break;
		case 2: weekendStr = "星期二"; break;
		case 3: weekendStr = "星期三"; break;
		case 4: weekendStr = "星期四"; break;
		case 5: weekendStr = "星期五"; break;
		case 6: weekendStr = "星期六"; break;
		case 0: weekendStr = "星期日"; break;
		}
		System.out.println(year + "-" + month + "-" + day + " "  + weekendStr + " " + hour + ":" + minute + ":" + second);
		// 时间日期的格式化 yyyy/MM/dd HH:mm:ss
		Date date1 = new Date();
		DateFormat df = new SimpleDateFormat(); //采用默认格式 yy-MM-dd h:mm    16-11-9 上午9:44
		System.out.println(df.format(date1));
		DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(df1.format(date1));
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒S");
		System.out.println(df2.format(date1));
		System.out.println(date1.getTimezoneOffset()); // 以分钟为单位
		/**
		 * 字母  日期或时间元素  表示  示例  
G  Era 标志符  Text  AD  
y  年  Year  1996; 96  
M  年中的月份  Month  July; Jul; 07  
w  年中的周数  Number  27  
W  月份中的周数  Number  2  
D  年中的天数  Number  189  
d  月份中的天数  Number  10  
F  月份中的星期  Number  2  
E  星期中的天数  Text  Tuesday; Tue  
a  Am/pm 标记  Text  PM  
H  一天中的小时数（0-23）  Number  0  
k  一天中的小时数（1-24）  Number  24  
K  am/pm 中的小时数（0-11）  Number  0  
h  am/pm 中的小时数（1-12）  Number  12  
m  小时中的分钟数  Number  30  
s  分钟中的秒数  Number  55  
S  毫秒数  Number  978  
z  时区  General time zone  Pacific Standard Time; PST; GMT-08:00  
Z  时区  RFC 822 time zone  -0800  

		 */
	}

}
