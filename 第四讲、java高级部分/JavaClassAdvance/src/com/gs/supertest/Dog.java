package com.gs.supertest;

public class Dog extends Animal {
	
	private String owner;
	
	public Dog() {
		super(); // 哪怕这里没有显式地调用super();JDK在创建子类时候，也会调用父类的无参构造方法
		System.out.println("构造Dog类的实例");
	}
	
	public Dog(String owner) {
		super();
		this.owner = owner;
	}
		
	public Dog(String name, String kind, String owner) {
		// setName(name); // 可以调用父类的set的方法来为子类中的属性赋值
		// setKind(kind);
		super(name, kind); // 引用父类的构造方法，通过参数来确定实际使用哪个构造方法
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public void sleep() {
		super.a = "animal test";
		a = "dog test"; // 重新赋值后，后面输出的this.a是此值
		super.sleep(); // 通过super来调用父类的方法
		System.out.println(this.getName() + " dog sleep...");
		System.out.println("**************" + this.a); // 这个a是谁？ 
	}

	public void run() {
		System.out.println(this.getName()+ " dog is running...");
	}

}
