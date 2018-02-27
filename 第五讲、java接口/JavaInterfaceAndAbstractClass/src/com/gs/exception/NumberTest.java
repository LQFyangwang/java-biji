package com.gs.exception;

public class NumberTest {
	
	public static void main(String[] args) {
		int a = Integer.valueOf("abc");
		// Exception in thread "main" java.lang.NumberFormatException: For 
		//input string: "abc"
	}

}
