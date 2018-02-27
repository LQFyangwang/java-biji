package com.gs;

public class Stu extends Person {
	
	private String clazz;

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	
	@Override
	public void eat() {
		System.out.println("stu eat, 3 bowls...");
	}
	
	public void study() {
		System.out.println("student study...");
	}
	
	public void read() {
		System.out.println("student read...");
	}

	@Override
	public String toString() {
		return "Stu [clazz=" + clazz + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getAge()="
				+ getAge() + "]";
	}

	

}
