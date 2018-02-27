package com.ht.test;

import java.awt.geom.Area;

public class AreaTest {

	//普通方法
	public void testarea(){
		
	}

	void testareas(){
		
		
	}
	void testareas(int a){
		
		
	}
	
	//重载
	public void testarea(int a){
		//正方形
		System.out.println("正方形的面积="+a*a);
	}
	//重载
	public void testarea(int a,int b){
		//矩形（长方形）
		System.out.println("长方形的面积="+a*b);
	}
	//重载
	public void testarea(int a,float b){
		//圆形
		System.out.println("圆形的面积为="+a*a*b);
		
	}
	public static void main(String[] args) {

		AreaTest at = new AreaTest();
		at.testarea(10);
		at.testarea(10, 20);
		at.testarea(5, 3.14f);
		
	}
}
