package com.gs.car;

public class WangZongTest {
	
	public static void main(String[] args) {
		WangZong wangZong = new WangZong(); // ����һ���������۵�
		Car car = new Car();
		car.setName("bmw 535li");
		car.setBrand("bmw");
		car.setColor("white");
		car.setPrice(1000000.0);
		car.setType(Auto.TYPE_C);
		wangZong.inCar(car); // ����һ����
		SUV suv = new SUV();
		suv.setName("H6");
		suv.setBrand("Haval");
		suv.setColor("black");
		suv.setDriverType(Auto.DRIVER_4);
		wangZong.inSUV(suv); // ����һ��suv
		Seller seller = new Seller();
		seller.setName("seller1");
		seller.setAge(20);
		seller.setGender("male");
		seller.setNo("1001");
		wangZong.hireSeller(seller); // ��Ӷһ������Ա
		
		Buyer buyer = new Buyer();
		buyer.setName("����");
		buyer.setMoney(2000000.0);
		buyer.setAge(19);
		buyer.setGender("male");
		buyer.buyCar(wangZong, 1000000.0); // ���˵��棬���˳�����������Ա�����������
		
		buyer.buySUV(wangZong, 120000.0);
	}

}
