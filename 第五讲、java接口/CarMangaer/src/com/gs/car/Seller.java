package com.gs.car;

/**
 * 销售员，实现销售的方法
 *
 */
public class Seller extends Employee implements ISeller {
	
	private int expAge;
	private int sellTotal;
	public int getExpAge() {
		return expAge;
	}
	public void setExpAge(int expAge) {
		this.expAge = expAge;
	}
	public int getSellTotal() {
		return sellTotal;
	}
	public void setSellTotal(int sellTotal) {
		this.sellTotal = sellTotal;
	}
	
	@Override
	public void sellCar(WangZong wangZong, Buyer buyer) {
		wangZong.setTotalCars(wangZong.getTotalCars() - 1);
		System.out.println("员工编号为：" + getNo() + ", 员工姓名： " + getName() + "卖了一部车给：" + buyer.getName());
	}
	@Override
	public void sellSUV(WangZong wangZong, Buyer buyer) {
		wangZong.setTotalSuvs(wangZong.getTotalSuvs() - 1);
		System.out.println("员工编号为：" + getNo() + ", 员工姓名： " + getName() + "卖了一部SUV车给：" + buyer.getName());
	}

}
