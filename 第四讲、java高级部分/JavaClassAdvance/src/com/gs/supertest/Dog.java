package com.gs.supertest;

public class Dog extends Animal {
	
	private String owner;
	
	public Dog() {
		super(); // ��������û����ʽ�ص���super();JDK�ڴ�������ʱ��Ҳ����ø�����޲ι��췽��
		System.out.println("����Dog���ʵ��");
	}
	
	public Dog(String owner) {
		super();
		this.owner = owner;
	}
		
	public Dog(String name, String kind, String owner) {
		// setName(name); // ���Ե��ø����set�ķ�����Ϊ�����е����Ը�ֵ
		// setKind(kind);
		super(name, kind); // ���ø���Ĺ��췽����ͨ��������ȷ��ʵ��ʹ���ĸ����췽��
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
		a = "dog test"; // ���¸�ֵ�󣬺��������this.a�Ǵ�ֵ
		super.sleep(); // ͨ��super�����ø���ķ���
		System.out.println(this.getName() + " dog sleep...");
		System.out.println("**************" + this.a); // ���a��˭�� 
	}

	public void run() {
		System.out.println(this.getName()+ " dog is running...");
	}

}
