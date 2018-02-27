package com.gs.relation;

/**
 * 小轿车类
 *
 */
public class Car {
	
	private Engine engine; // 车的发动机
	private Wheel[] wheels; // 由多少个轮胎组成
	private Seat[] seats;
	
	private double price;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel[] getWheels() {
		return wheels;
	}
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
	public Seat[] getSeats() {
		return seats;
	}
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
