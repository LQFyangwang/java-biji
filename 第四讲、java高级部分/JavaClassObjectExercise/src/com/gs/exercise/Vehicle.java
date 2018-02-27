package com.gs.exercise;

public class Vehicle {
	
	private float speed;
	private float size;
	
	public Vehicle() {
		
	}
	
	public Vehicle(float speed, float size) {
		this.speed = speed;
		this.size = size;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	public void move() {
		System.out.println("vehicle is moving, speed is: " + this.speed);
	}
	
	public void speedUp(float speedToAdd) {
		this.speed += speedToAdd;
	}
	
	public void speedDown(float speedToDown) {
		this.speed -= speedToDown;
	}

	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", size=" + size + "]";
	}

}
