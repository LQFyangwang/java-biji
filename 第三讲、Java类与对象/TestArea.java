package com.ht.test;

public class TestArea {

	//Ĭ�ϵĹ��췽��
	public TestArea() {
	/*
		1.�޲������޷���ֵ
		2.������������һ��
		3.���붨��Ϊ�����ģ�public��	
		4.���Ա�����
	*/
	}
	//�������������ε����
	public TestArea(int a){
	/*
	 	Ĭ�Ϲ��췽��������
	 	1.�в������޷���ֵ
	 	2.������������һ��
	 	3.���붨��Ϊ�����ģ�public��	
		4.���Ա�����
	 * */	
		System.out.println("�����ε����="+a*a);
	}
	public static void main(String[] args) {
		new TestArea(10);
		
	}
	
}
