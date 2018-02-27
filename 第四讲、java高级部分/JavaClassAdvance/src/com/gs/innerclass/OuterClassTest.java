package com.gs.innerclass;

import com.gs.innerclass.OuterClass.InnerClass1; // 导入内部类
import com.gs.innerclass.OuterClass.InnerClass2;
import com.gs.innerclass.OuterClass.InnerClass3;
import com.gs.innerclass.OuterClass.InnerClass5;

public class OuterClassTest {

	public static void main(String[] args) {
		OuterClass out = new OuterClass(); // 创建外部内的实例
		InnerClass1 publicInnerClass = out.new InnerClass1();
		InnerClass2 protectedInnerClass = out.new InnerClass2();
		InnerClass3 innerClass = out.new InnerClass3();
		InnerClass5 innerClass5 = new OuterClass.InnerClass5(); // 创建静态内部类的实例
	}
	
}
