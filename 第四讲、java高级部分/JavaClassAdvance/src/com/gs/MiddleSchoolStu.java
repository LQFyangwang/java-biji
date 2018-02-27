package com.gs;

public class MiddleSchoolStu extends Stu {

	private boolean hasPhone;

	public boolean isHasPhone() {
		return hasPhone;
	}

	public void setHasPhone(boolean hasPhone) {
		this.hasPhone = hasPhone;
	}
	
	@Override
	public void eat() {
		System.out.println("middle school stu eat 2 bowls");
	}
	
	public void doMorningExercise() {
		System.out.println("do morning exercise....");
	}
	
}
