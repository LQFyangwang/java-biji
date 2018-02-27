package com.gs.car;

/**
 * 买家类，实现买家买车的方法
 *
 */
public class Buyer extends Person implements IBuyer {
	
	private double money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public void buyCar(WangZong wangZong, double money) {
		Seller[] sellers = wangZong.getSellers();
		if (sellers != null && sellers.length > 0) {
			sellers[0].sellCar(wangZong, this); // this也可以作为方法的实参
			System.out.println("名字叫：" + getName() + "花了" + money + "买了一部车");
		}
	}

	@Override
	public void buySUV(WangZong wangZong, double money) {
		Seller[] sellers = wangZong.getSellers();
		if (sellers != null && sellers.length > 0) {
			sellers[0].sellSUV(wangZong, this); // this也可以作为方法的实参
			System.out.println("名字叫：" + getName() + "花了" + money + "买了一部suv");
		}
	}

}
