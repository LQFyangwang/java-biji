package com.gs.exercise;

public class VehicleTest {
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle(20.f, 20.5f);
		car.move();
		car.speedUp(5.0f);
		car.move();
		car.speedDown(10.f);
		car.move();
	}

}
