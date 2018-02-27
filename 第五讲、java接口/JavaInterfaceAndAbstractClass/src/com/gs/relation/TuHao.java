package com.gs.relation;

public class TuHao {
	
	private Car car;
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void buyCar(Car car) {
		setCar(car);
		System.out.println("全民老公买了一部新车，价格：" + car.getPrice());
	}
	
	public static void main(String[] args) {
		TuHao wangSiCong = new TuHao();
		Car car = new Car();
		Engine engine = new Engine();
		engine.setBrand("NB");
		engine.setCount(12);
		engine.setPi(600);
		car.setEngine(engine); // 给车设置引擎
		Wheel[] wheels = new Wheel[5];
		Wheel wheel = new Wheel();
		wheel.setBrand("NB");
		wheel.setPrice(100000.f);
		wheels[0] = wheel;
		car.setWheels(wheels); // 给车设置轮胎
		Seat[] seats = new Seat[4];
		Seat seat = new Seat();
		seat.setBrand("NB");
		seat.setPrice(200000.f);
		seats[0] = seat;
		car.setSeats(seats);
		car.setPrice(100000000.f);
		wangSiCong.buyCar(car);
	}

}
