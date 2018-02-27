package com.gs.car;

/**
 * 所有车的父类
 *
 */
public class Auto {
	
	public static final String TYPE_A = "A";
	public static final String TYPE_B = "B";
	public static final String TYPE_C = "C";
	public static final String TYPE_D = "D";
	
	public static final int DRIVER_2 = 2;
	public static final int DRIVER_4 = 4;

	private String name;
	private String brand;
	private String color;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
