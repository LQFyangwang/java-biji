package com.gs.exercie;

public class Shape {
	
	/**
	 * 求矩形的面积 
	 * @param down
	 * @param height
	 * @return
	 */
	static float getArea(int down, int height) {
		return down * height;
	}
	
	/**
	 * 求梯形的面积
	 * @param up
	 * @param down
	 * @param height
	 * @return
	 */
	static float getArea(int up, int down, int height) {
		return (up + down) * height / 2.0f;
	}
	
	

}
