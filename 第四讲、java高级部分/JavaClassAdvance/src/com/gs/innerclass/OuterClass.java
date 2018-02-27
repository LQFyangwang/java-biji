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
		final int y = 20; // ����˱�����Ҫ�ھֲ��ڲ�����ʹ�ã�����ʹ��final�ؼ��������Σ������ֲ��ڲ��಻����Щ����
		System.out.println("OuterClass test...");
		class InnerClass6 {
			public void testA() {
				a = 10; // �ֲ���������ʹ���ⲿ��ı���
				System.out.println(y);
				test();
			}
		}
		InnerClass6 innerClass = new InnerClass6(); // ֻ���ڴ˷����ڲ�ʹ��
	}
	
	public static void test1() {
		
	}
	
	public class InnerClass1 {
		private int d;
		
		public void test() {
			a = 10; // �ڲ�����ʹ���ⲿ��ĳ�Ա����
			c = "abc";
		}
	}
	
	protected class InnerClass2 {
		
	}
	
	class InnerClass3 {
		
	}
	
	/**
	 * �����private���ε��ڲ��࣬��ֻ���ڱ�����ʹ��
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
