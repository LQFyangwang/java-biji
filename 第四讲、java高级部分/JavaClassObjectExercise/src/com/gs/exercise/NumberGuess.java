package com.gs.exercise;

import java.util.Random;

public class NumberGuess {
	
	private int v = 100;

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}
	
	public void randomV() {
		Random ran = new Random();
		this.v = ran.nextInt(100);
	}
	
}
