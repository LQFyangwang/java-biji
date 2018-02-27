package com.gs.exercise;

public class Car extends Vehicles {
	private int seats;
	
	public Car() {
		
	}
	public Car(int seats) {
		this.seats=seats;
	}
	
	@Override
	public String toString() {
		return "Car [seats=" + seats + "]";
	}
	public void showCar() {
		System.out.println("商标："+this.getBrand()+",颜色："+this.getColor()
		+",座位"+this.seats);
	}
}
