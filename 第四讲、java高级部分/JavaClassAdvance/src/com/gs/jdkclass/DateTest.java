package com.gs.jdkclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	// ����ѹ�ƣ�@SuppressWarnings("")   deprecation��ʾ�����á������ѱ����õľ���ѹ����ȥ
	// ���Ը�ĳ�������ľ������ѹ�ƣ�Ҳ���Զ԰����ж������ķ�������ѹ�ƣ�Ҳ���Զ�������κ�һ���������ѹ��
	@SuppressWarnings({ "unused", "deprecation"})
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()); // �����1970��1��1�� 0:0:0���һ������ֵ��
		
		Date date = new Date();
		System.out.println(date.getTime()); // �����1900��1��1�� 0:0:0���һ������ֵ��
		//����ʾ�˷����Ѿ��������ˣ���ò�Ҫȥ�������ķ���������ʹ��JDK�ṩ������ķ���
		
		int a = 10;
		int b = 20;
		
		int year = date.getYear() + 1900; // year�����1900�꣬����Ҫ����1900
		int month = date.getMonth() + 1; // ��ȡ���·ݴ�0��ʼ
		int day = date.getDate();
		int hour = date.getHours();
		int minute = date.getMinutes();
		int second = date.getSeconds();
		int weekend = date.getDay(); // ��ȡ����
		String weekendStr = "";
		switch (weekend) {
		case 1: weekendStr = "����һ"; break;
		case 2: weekendStr = "���ڶ�"; break;
		case 3: weekendStr = "������"; break;
		case 4: weekendStr = "������"; break;
		case 5: weekendStr = "������"; break;
		case 6: weekendStr = "������"; break;
		case 0: weekendStr = "������"; break;
		}
		System.out.println(year + "-" + month + "-" + day + " "  + weekendStr + " " + hour + ":" + minute + ":" + second);
		// ʱ�����ڵĸ�ʽ�� yyyy/MM/dd HH:mm:ss
		Date date1 = new Date();
		DateFormat df = new SimpleDateFormat(); //����Ĭ�ϸ�ʽ yy-MM-dd h:mm    16-11-9 ����9:44
		System.out.println(df.format(date1));
		DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(df1.format(date1));
		DateFormat df2 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��S");
		System.out.println(df2.format(date1));
		System.out.println(date1.getTimezoneOffset()); // �Է���Ϊ��λ
		/**
		 * ��ĸ  ���ڻ�ʱ��Ԫ��  ��ʾ  ʾ��  
G  Era ��־��  Text  AD  
y  ��  Year  1996; 96  
M  ���е��·�  Month  July; Jul; 07  
w  ���е�����  Number  27  
W  �·��е�����  Number  2  
D  ���е�����  Number  189  
d  �·��е�����  Number  10  
F  �·��е�����  Number  2  
E  �����е�����  Text  Tuesday; Tue  
a  Am/pm ���  Text  PM  
H  һ���е�Сʱ����0-23��  Number  0  
k  һ���е�Сʱ����1-24��  Number  24  
K  am/pm �е�Сʱ����0-11��  Number  0  
h  am/pm �е�Сʱ����1-12��  Number  12  
m  Сʱ�еķ�����  Number  30  
s  �����е�����  Number  55  
S  ������  Number  978  
z  ʱ��  General time zone  Pacific Standard Time; PST; GMT-08:00  
Z  ʱ��  RFC 822 time zone  -0800  

		 */
	}

}
