package com.gs.car;

/**
 * ����Ա��ʵ�����۵ķ���
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
		System.out.println("Ա�����Ϊ��" + getNo() + ", Ա�������� " + getName() + "����һ��������" + buyer.getName());
	}
	@Override
	public void sellSUV(WangZong wangZong, Buyer buyer) {
		wangZong.setTotalSuvs(wangZong.getTotalSuvs() - 1);
		System.out.println("Ա�����Ϊ��" + getNo() + ", Ա�������� " + getName() + "����һ��SUV������" + buyer.getName());
	}

}
