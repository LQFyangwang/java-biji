package com.gs.exercie;

public class Shape {
	
	/**
	 * ����ε���� 
	 * @param down
	 * @param height
	 * @return
	 */
	static float getArea(int down, int height) {
		return down * height;
	}
	
	/**
	 * �����ε����
	 * @param up
	 * @param down
	 * @param height
	 * @return
	 */
	static float getArea(int up, int down, int height) {
		return (up + down) * height / 2.0f;
	}
	
	

}
