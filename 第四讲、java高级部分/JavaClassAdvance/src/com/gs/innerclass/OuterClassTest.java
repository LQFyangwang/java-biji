package com.gs.innerclass;

import com.gs.innerclass.OuterClass.InnerClass1; // �����ڲ���
import com.gs.innerclass.OuterClass.InnerClass2;
import com.gs.innerclass.OuterClass.InnerClass3;
import com.gs.innerclass.OuterClass.InnerClass5;

public class OuterClassTest {

	public static void main(String[] args) {
		OuterClass out = new OuterClass(); // �����ⲿ�ڵ�ʵ��
		InnerClass1 publicInnerClass = out.new InnerClass1();
		InnerClass2 protectedInnerClass = out.new InnerClass2();
		InnerClass3 innerClass = out.new InnerClass3();
		InnerClass5 innerClass5 = new OuterClass.InnerClass5(); // ������̬�ڲ����ʵ��
	}
	
}
