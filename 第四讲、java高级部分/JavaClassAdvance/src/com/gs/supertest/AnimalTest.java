package com.gs.supertest;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setName("动物");
		a1.setKind("动物");
		a1.eat();
		a1.sleep();
		Dog dog = new Dog(); // Dog类的默认的构造方法调用了父类的构造方法
		dog.setName("狗");
		dog.setKind("狗");
		dog.setOwner("小明");
		dog.eat();
		dog.sleep();
		dog.run();
		Dog dog1 = new Dog("狗1", "狗", "小亮");
		dog1.eat();
		Animal a2 = dog; // 直接把一个小范围类型的值赋值给一个大范围类型的对象
		// Dog dog2 = (Dog) a1; // 不能把小范围类型的数据转换成大范围类型的数据
		Animal a3 = new Dog("狗2", "狗", "小华"); // a3实际上是一个Dog类的对象
		// a3.run(); // a3不能调用子类Dog的run方法
		Dog d = (Dog) a3; // 可以强制转换
		d.run();
	}

}
