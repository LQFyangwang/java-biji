package com.gs.exception;

public class DivideTest {
	
	public static void main(String[] args) {
		/**
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
			at com.gs.exception.DivideTest.main(DivideTest.java:6)
		 */
		System.out.println("before");
		System.out.println(1 / 0);
		System.out.println("after");
	}

}
