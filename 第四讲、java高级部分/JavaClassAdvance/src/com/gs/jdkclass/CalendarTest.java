package com.gs.jdkclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	
	public static void main(String[] args) {
		// ����ģʽ
		Calendar cal = Calendar.getInstance(); // Calendar.getInstance()
		//������ȡCalendar��Ķ��󣬴˶���������ʾʱ�����ڵ�ֵ
		Date date = cal.getTime();// getTime()��ȡһ��Date����
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(df.format(date));
		
		
		int year = cal.get(Calendar.YEAR); // ����ָ�����ֶ�����ȡ��ֵ
		int month = cal.get(Calendar.MONTH) + 1; // �·ݴ�0��ʼ����
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millis = cal.get(Calendar.MILLISECOND);
		System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second + ":" + millis);
		System.out.println(cal.getTimeZone()); // offset�Ժ���Ϊ��λ 
		
		System.out.println("weekOfMonth: " + cal.get(Calendar.WEEK_OF_MONTH)); // ����ĵڼ���
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
		
		// �����cal1��cal2����˶�����
		System.out.println(DateUtil.dayBetweenDate(cal1.getTime(), cal2.getTime()));
		
		// ��ǰһ��ʱ�䣬���������ڵ�ǰʱ���n�������
		cal.add(Calendar.DATE, -500); // �����������Ƶ�ʱ�䣬��������ǰ�Ƶ�ʱ�� 
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.HOUR, 1);
		System.out.println(DateUtil.defaultFormat(cal.getTime()));
		
		// �Ƚ�ʱ����Ⱥ�   a.before(b)  a�Ƿ���b��ǰ��  a.after(b)  a�Ƿ���b�ĺ���
		if (cal1.before(cal2)) {
			System.out.println("cal1����cal2");
		} else {
			System.out.println("cal1����cal2");
		}
		
		if (cal1.after(cal2)) {
			
		}
		
		// ����һ������ʱ���ʽ���ַ���������ת��Ϊʱ������
		String dateStr = "2016/11/10 11:18:30";
		String dateStr1 = "2016��11��10�� 11ʱ18��30��";
		try {
			DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date d = df1.parse(dateStr);
			System.out.println(DateUtil.defaultFormat(d));
			DateFormat df2 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
			Date d1 = df2.parse(dateStr1);
			System.out.println(DateUtil.defaultFormat(d1));
		} catch (ParseException e) { // ��ʽ�����쳣
			e.printStackTrace();
		}
	}

}
