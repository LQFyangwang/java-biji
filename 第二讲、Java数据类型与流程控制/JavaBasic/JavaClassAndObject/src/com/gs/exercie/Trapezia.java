package com.gs.exercie;

public class Trapezia {
	
	int up;
	int down;
	int height;
	
	public Trapezia() {
		
	}
	
	public Trapezia(int up, int down, int height) {
		this.up = up;
		this.down = down;
		this.height = height;
	}
	
	float getArea() {
		return (up + down) * height / 2.0f;
	}

}
