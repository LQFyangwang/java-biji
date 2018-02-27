package com.gs.exercie;

public class User {
	
	String name;
	String pwd;
	static int count; // һ����ÿ��ʵ����User�����ʱ�򣬶�Ӧ�ý��м�1���������ж������������
	
	public User() {
		count++;
	}
	
	public User(String name) {
		this.name = name;
		count++;
	}
	
	public User(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
		count++;
	}
	
	void set(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	
	void print() {
		System.out.println("name: " + this.name + ", pwd: " + this.pwd + ", ��" + count + "��");
	}
	
	@Override
	public String toString() {
		return "name: " + this.name + ", pwd: " + this.pwd + ", ��" + count + "��";
	}
	
	public static void main(String[] args) {
		User u =new User();
		u.set("СS", "123456");
		u.print();
		User u1 = new User("С��");
		u1.print();
		User u2 = new User("С��", "123456");
		u2.print();
		System.out.println(u2.toString());
	}

}
