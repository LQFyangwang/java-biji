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
		// myClass1.b = 100; // private修饰的不能直接赋值，也不能直接获取。之前是要用getter与setter方法。
		@SuppressWarnings("unchecked")
		Class<MyClass> clazz = (Class<MyClass>) Class.forName("com.gs.reflect.MyClass");
		Field aField = clazz.getDeclaredField("a");
		System.out.println(aField.get(myClass)); // 在哪个对象上获取属性值
		System.out.println(aField.get(myClass1));
		aField.set(myClass, 101); // 在myClass对象上设置a属性的值为101
		System.out.println(aField.get(myClass)); // 在哪个对象上获取属性值
		
		Field bField = clazz.getDeclaredField("b"); // private
		bField.setAccessible(true); // 如果一个属性是private修饰的，则在设置或者获取这个属性之前，需要把此属性设置成可访问的。默认为不可访问
		bField.set(myClass, 300); // 第一个参数表示在哪个对象上设置属性的值，第二个参数值
		System.out.println(bField.get(myClass));
		
		Method aMethod = clazz.getDeclaredMethod("a"); // 获取到a方法
		aMethod.invoke(myClass); // 第一个参数表示在哪个对象上调用方法，第二个可变长度的参数就是调用此方法需要的参数
	
		Method bMethod = clazz.getDeclaredMethod("b");
		bMethod.setAccessible(true); // 设置成可访问，默认为不可访问
		bMethod.invoke(myClass);
		
		Method cMethod = clazz.getDeclaredMethod("c", int.class, String.class);
		cMethod.invoke(myClass, 100, "hello");
	}

}
