package com.gs.supertest;

public class Animal {

	private String name;
	private String kind;
	String a;
	
	public Animal() {
		System.out.println("构造Animal类的实例");
	}
	
	public Animal(String a,String b) {
		System.out.println("构造Animal类的实例");
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void eat() {
		System.out.println(this.name + " animal eat...");
	}
	
	public void sleep() {
		System.out.println(this.name + " animal sleep...");
	}
	
}
