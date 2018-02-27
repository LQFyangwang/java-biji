package com.ht.test;

public class TestArea {

	//默认的构造方法
	public TestArea() {
	/*
		1.无参数，无返回值
		2.方法名与类名一致
		3.必须定义为公共的（public）	
		4.可以被重载
	*/
	}
	//用来计算正方形的面积
	public TestArea(int a){
	/*
	 	默认构造方法的重载
	 	1.有参数，无返回值
	 	2.方法名与类名一致
	 	3.必须定义为公共的（public）	
		4.可以被重载
	 * */	
		System.out.println("正方形的面积="+a*a);
	}
	public static void main(String[] args) {
		new TestArea(10);
		
	}
	
}
