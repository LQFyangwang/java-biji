package com.gs.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final  class ReflectTest {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.a = 100;
		
		Class clazz = myClass.getClass(); // 根据一个类的对象来获取到与此类关联的Class类
		
		System.out.println(clazz.getName()); // 获取Class所描述的那个类的名称
		
		Car car = new Car();
		
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		
		Class clazz2 = MyClass.class; // 通过类的静态变量获取到Class
		
		System.out.println(clazz2.getName());
		System.out.println(MyClass.class);
		
		
		Class clazz3 = Car.class;
		System.out.println(clazz3.getName());
		
		try {
			Class clazz4 = Class.forName("com.gs.reflect.MyClass");// 把指定的类加载到类装载器中，并且获取到指定类所对应的Class
			System.out.println(clazz4.getName());
			Class clazz5 = Class.forName("com.gs.reflect.Car");
			System.out.println(clazz5.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("********************************");
		System.out.println(clazz.getSuperclass().getName()); // 获取父类
		try {
			Field field = clazz.getDeclaredField("a"); // 根据名称来获取属性
			System.out.println(field.get(myClass)); // 获取指定对象上的指定属性值
			
			Field[] fields = clazz.getDeclaredFields(); // 获取所有已经声明的属性
			for (Field f : fields) {
				System.out.println(f.getName()); // 获取属性的名称
				System.out.println(f.getModifiers()); // 获取属性的修饰符
				System.out.println(f.getType()); // 获取属性的数据类型
			}
			Method m = clazz.getDeclaredMethod("a"); // 获取指定名称的方法
			System.out.println(m.getName());
			System.out.println(m.getModifiers());
			
			Method[] methods = clazz.getDeclaredMethods(); // 获取所有的方法
			for (Method me : methods) {
				System.out.println(me.getName()); // 获取方法名
				System.out.println(me.getModifiers()); // 获取方法的修饰符
				System.out.println(me.getReturnType()); // 获取方法的返回值类型
				System.out.println(me.getParameterTypes()); // 获取方法的参数的类型
			}
			
			Constructor[] cs = clazz.getConstructors(); // 返回所有的构造方法
			for (Constructor c : cs) {
				System.out.println(c.getName()); // 获取构造方法的名称
				System.out.println(c.getModifiers()); // 获取构造方法的修饰符
				System.out.println(c.getParameterTypes());
				System.out.println(c.getParameterCount()); // 参数的个数
			}
		} catch (NoSuchFieldException e) { // 没有指定属性的异常
			e.printStackTrace();
		} catch (SecurityException e) { // 安全异常
			e.printStackTrace();
		} catch (IllegalArgumentException e) { // 非法参数异常
			e.printStackTrace();
		} catch (IllegalAccessException e) { // 非法访问异常
			e.printStackTrace();
		} catch (NoSuchMethodException e) { // 方法未找到异常
			e.printStackTrace();
		}
		
	}
}
interface A{
	int a=10;
}