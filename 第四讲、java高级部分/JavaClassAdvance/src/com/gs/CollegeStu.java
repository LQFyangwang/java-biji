package com.gs;

public class CollegeStu extends Stu {
	
	private boolean hasInternship;

	public boolean isHasInternship() {
		return hasInternship;
	}

	public void setHasInternship(boolean hasInternship) {
		this.hasInternship = hasInternship;
	}
	
	@Override
	public void eat() {
		System.out.println("college stu eat 3 bowls...");
	}
	
	public void practice() {
		System.out.println("college stu practice...");
	}
	
}
