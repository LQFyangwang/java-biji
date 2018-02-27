package com.gs.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final  class ReflectTest {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.a = 100;
		
		Class clazz = myClass.getClass(); // ����һ����Ķ�������ȡ������������Class��
		
		System.out.println(clazz.getName()); // ��ȡClass���������Ǹ��������
		
		Car car = new Car();
		
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		
		Class clazz2 = MyClass.class; // ͨ����ľ�̬������ȡ��Class
		
		System.out.println(clazz2.getName());
		System.out.println(MyClass.class);
		
		
		Class clazz3 = Car.class;
		System.out.println(clazz3.getName());
		
		try {
			Class clazz4 = Class.forName("com.gs.reflect.MyClass");// ��ָ��������ص���װ�����У����һ�ȡ��ָ��������Ӧ��Class
			System.out.println(clazz4.getName());
			Class clazz5 = Class.forName("com.gs.reflect.Car");
			System.out.println(clazz5.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("********************************");
		System.out.println(clazz.getSuperclass().getName()); // ��ȡ����
		try {
			Field field = clazz.getDeclaredField("a"); // ������������ȡ����
			System.out.println(field.get(myClass)); // ��ȡָ�������ϵ�ָ������ֵ
			
			Field[] fields = clazz.getDeclaredFields(); // ��ȡ�����Ѿ�����������
			for (Field f : fields) {
				System.out.println(f.getName()); // ��ȡ���Ե�����
				System.out.println(f.getModifiers()); // ��ȡ���Ե����η�
				System.out.println(f.getType()); // ��ȡ���Ե���������
			}
			Method m = clazz.getDeclaredMethod("a"); // ��ȡָ�����Ƶķ���
			System.out.println(m.getName());
			System.out.println(m.getModifiers());
			
			Method[] methods = clazz.getDeclaredMethods(); // ��ȡ���еķ���
			for (Method me : methods) {
				System.out.println(me.getName()); // ��ȡ������
				System.out.println(me.getModifiers()); // ��ȡ���������η�
				System.out.println(me.getReturnType()); // ��ȡ�����ķ���ֵ����
				System.out.println(me.getParameterTypes()); // ��ȡ�����Ĳ���������
			}
			
			Constructor[] cs = clazz.getConstructors(); // �������еĹ��췽��
			for (Constructor c : cs) {
				System.out.println(c.getName()); // ��ȡ���췽��������
				System.out.println(c.getModifiers()); // ��ȡ���췽�������η�
				System.out.println(c.getParameterTypes());
				System.out.println(c.getParameterCount()); // �����ĸ���
			}
		} catch (NoSuchFieldException e) { // û��ָ�����Ե��쳣
			e.printStackTrace();
		} catch (SecurityException e) { // ��ȫ�쳣
			e.printStackTrace();
		} catch (IllegalArgumentException e) { // �Ƿ������쳣
			e.printStackTrace();
		} catch (IllegalAccessException e) { // �Ƿ������쳣
			e.printStackTrace();
		} catch (NoSuchMethodException e) { // ����δ�ҵ��쳣
			e.printStackTrace();
		}
		
	}
}
interface A{
	int a=10;
}