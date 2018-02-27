package com.gs.reflect;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyClass {
	
	int a;
	private int b;
	protected float c;
	
	public MyClass() {
		
	}
	
	public MyClass(int a, int b) {
		
	}
	
	public static void a() {
		System.out.println("a method");
	}
	
	private void b() {
		System.out.println("private b method");
	}
	
	public void c(int a, String b) {
		System.out.println(b);
	}

}
