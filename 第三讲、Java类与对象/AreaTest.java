package com.ht.test;

import java.awt.geom.Area;

public class AreaTest {

	//��ͨ����
	public void testarea(){
		
	}

	void testareas(){
		
		
	}
	void testareas(int a){
		
		
	}
	
	//����
	public void testarea(int a){
		//������
		System.out.println("�����ε����="+a*a);
	}
	//����
	public void testarea(int a,int b){
		//���Σ������Σ�
		System.out.println("�����ε����="+a*b);
	}
	//����
	public void testarea(int a,float b){
		//Բ��
		System.out.println("Բ�ε����Ϊ="+a*a*b);
		
	}
	public static void main(String[] args) {

		AreaTest at = new AreaTest();
		at.testarea(10);
		at.testarea(10, 20);
		at.testarea(5, 3.14f);
		
	}
}
