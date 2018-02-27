package com.gs.innerclass;

public class OuterClass {
	
	private int a;
	private String b;
	private static String c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	public void test() {
		final int y = 20; // 如果此变量需要在局部内部类中使用，则请使用final关键字来修饰，表明局部内部类不能修些变量
		System.out.println("OuterClass test...");
		class InnerClass6 {
			public void testA() {
				a = 10; // 局部方法可以使用外部类的变量
				System.out.println(y);
				test();
			}
		}
		InnerClass6 innerClass = new InnerClass6(); // 只能在此方法内部使用
	}
	
	public static void test1() {
		
	}
	
	public class InnerClass1 {
		private int d;
		
		public void test() {
			a = 10; // 内部类能使用外部类的成员变量
			c = "abc";
		}
	}
	
	protected class InnerClass2 {
		
	}
	
	class InnerClass3 {
		
	}
	
	/**
	 * 如果是private修饰的内部类，则只能在本类中使用
	 *
	 */
	private class InnerClass4 {
		
	}
	
	public static class InnerClass5 {
		
		public void testA() {
			c = "c";
			test1();
		}
		
	}
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		InnerClass4 privateInnerClass = out.new InnerClass4();
	}

}
