package com.gs.exercise;

public class Truck extends Vehicles{
	private float load;
	
	public Truck() {
		
	}
	public Truck(float load) {
		this.load=load;
	}
	public float getLoad() {
		return load;
	}
	public void setLoad(float load) {
		this.load = load;
	}
	
	@Override
	public String toString() {
		return "Truck [load=" + load + "]";
	}
	public void showTruck() {
		System.out.println("商标："+this.getBrand()+",颜色："+this.getColor()
		+",载重"+this.load);
	}
}
