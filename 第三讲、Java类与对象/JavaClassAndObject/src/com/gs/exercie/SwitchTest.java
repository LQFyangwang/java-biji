package com.gs.exercie;

public class SwitchTest {
	
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
			case 10: break;
		}
		byte b = 10;
		switch (b) {
			case 10: break;
		}
		long c = 10;
//		switch(c) { // JDK��ʵ����ֻ�ܶ�int, byte,short, char, String(JDK1.7),ö�����ͽ���switch... case�ж�
//		case 10: break;
//		}
		String d = "abc";
		switch(d) {
		case "abc": break;
		}
	}

}
