package com.gs.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectAccess {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		MyClass myClass = new MyClass();
		myClass.a = 100;
		MyClass myClass1 = new MyClass();
		myClass1.a = 200;
		// myClass1.b = 100; // private���εĲ���ֱ�Ӹ�ֵ��Ҳ����ֱ�ӻ�ȡ��֮ǰ��Ҫ��getter��setter������
		@SuppressWarnings("unchecked")
		Class<MyClass> clazz = (Class<MyClass>) Class.forName("com.gs.reflect.MyClass");
		Field aField = clazz.getDeclaredField("a");
		System.out.println(aField.get(myClass)); // ���ĸ������ϻ�ȡ����ֵ
		System.out.println(aField.get(myClass1));
		aField.set(myClass, 101); // ��myClass����������a���Ե�ֵΪ101
		System.out.println(aField.get(myClass)); // ���ĸ������ϻ�ȡ����ֵ
		
		Field bField = clazz.getDeclaredField("b"); // private
		bField.setAccessible(true); // ���һ��������private���εģ��������û��߻�ȡ�������֮ǰ����Ҫ�Ѵ��������óɿɷ��ʵġ�Ĭ��Ϊ���ɷ���
		bField.set(myClass, 300); // ��һ��������ʾ���ĸ��������������Ե�ֵ���ڶ�������ֵ
		System.out.println(bField.get(myClass));
		
		Method aMethod = clazz.getDeclaredMethod("a"); // ��ȡ��a����
		aMethod.invoke(myClass); // ��һ��������ʾ���ĸ������ϵ��÷������ڶ����ɱ䳤�ȵĲ������ǵ��ô˷�����Ҫ�Ĳ���
	
		Method bMethod = clazz.getDeclaredMethod("b");
		bMethod.setAccessible(true); // ���óɿɷ��ʣ�Ĭ��Ϊ���ɷ���
		bMethod.invoke(myClass);
		
		Method cMethod = clazz.getDeclaredMethod("c", int.class, String.class);
		cMethod.invoke(myClass, 100, "hello");
	}

}
