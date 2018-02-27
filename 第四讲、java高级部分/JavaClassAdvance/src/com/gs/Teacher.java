package com.gs;

public class Teacher extends Person {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void eat() {
		System.out.println("teacher eat 3 bowls...");
	}
	
	@Override
	protected void run() {
		System.out.println("teacher is running...");
	}
	
	public void teach() {
		System.out.println("teacher teach....");
	}
	
	public void checkHomework() {
		System.out.println("teacher check homework");
	}

}
