package com.gs.car;

/**
 * ����࣬ʵ������򳵵ķ���
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
			sellers[0].sellCar(wangZong, this); // thisҲ������Ϊ������ʵ��
			System.out.println("���ֽУ�" + getName() + "����" + money + "����һ����");
		}
	}

	@Override
	public void buySUV(WangZong wangZong, double money) {
		Seller[] sellers = wangZong.getSellers();
		if (sellers != null && sellers.length > 0) {
			sellers[0].sellSUV(wangZong, this); // thisҲ������Ϊ������ʵ��
			System.out.println("���ֽУ�" + getName() + "����" + money + "����һ��suv");
		}
	}

}
