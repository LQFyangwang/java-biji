package com.gs.exercie;

public class Rectangle {
	
	int width;
	int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return this.width * this.height;
	}
	
	int getPerimeter() {
		return (width + height) * 2;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 10);
		System.out.println(rect.getArea());
		System.out.println(rect.getPerimeter());
	}

}
