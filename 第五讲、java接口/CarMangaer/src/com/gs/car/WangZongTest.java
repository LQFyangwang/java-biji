package com.gs.car;

public class WangZongTest {
	
	public static void main(String[] args) {
		WangZong wangZong = new WangZong(); // 开了一个汽车销售店
		Car car = new Car();
		car.setName("bmw 535li");
		car.setBrand("bmw");
		car.setColor("white");
		car.setPrice(1000000.0);
		car.setType(Auto.TYPE_C);
		wangZong.inCar(car); // 进了一辆车
		SUV suv = new SUV();
		suv.setName("H6");
		suv.setBrand("Haval");
		suv.setColor("black");
		suv.setDriverType(Auto.DRIVER_4);
		wangZong.inSUV(suv); // 进了一辆suv
		Seller seller = new Seller();
		seller.setName("seller1");
		seller.setAge(20);
		seller.setGender("male");
		seller.setNo("1001");
		wangZong.hireSeller(seller); // 雇佣一个销售员
		
		Buyer buyer = new Buyer();
		buyer.setName("土豪");
		buyer.setMoney(2000000.0);
		buyer.setAge(19);
		buyer.setGender("male");
		buyer.buyCar(wangZong, 1000000.0); // 有了店面，有了车，有了销售员，买家来买车了
		
		buyer.buySUV(wangZong, 120000.0);
	}

}
