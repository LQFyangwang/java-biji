package com.gs.exception;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] a = new int[5];
		a[5] = 100; 
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	}

}
