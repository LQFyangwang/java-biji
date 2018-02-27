package com.gs;

public class BooleanTest {

	public static void main(String[] args) {
		Boolean a = false;
		Boolean b = Boolean.FALSE; // Boolean.TRUE
		Boolean c = new Boolean(true);
		Boolean d = new Boolean("jjjj"); // "true" true,  "false" false,   只要不是"true"，就表示false
		System.out.println(d);
	}
	
}
