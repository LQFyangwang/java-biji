package com.gs.car;

/**
 * 经销商类，包含有车，suv,销售员，会计
 *
 */
public class WangZong implements IWangZong {
	
	public static final int ALL_CARS = 15;
	public static final int ALL_SUVS = 10;
	public static final int ALL_SELLERS = 5;
	
	private Car[] cars; // 车的库存
	private int totalCars;
	private SUV[] suvs; // suv的库存
	private int totalSuvs;
	
	private Seller[] sellers;
	private int totalSeller;
	@SuppressWarnings("unused")
	private Accountor accountor;
	
	public WangZong() {
		cars = new Car[ALL_CARS];
		suvs = new SUV[ALL_SUVS];
		sellers = new Seller[ALL_SELLERS];
	}
	
	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public SUV[] getSuvs() {
		return suvs;
	}
	
	public void setSuvs(SUV[] suvs) {
		this.suvs = suvs;
	}

	public int getTotalCars() {
		return totalCars;
	}

	public void setTotalCars(int totalCars) {
		this.totalCars = totalCars;
	}

	public int getTotalSuvs() {
		return totalSuvs;
	}

	public void setTotalSuvs(int totalSuvs) {
		this.totalSuvs = totalSuvs;
	}
	
	public Seller[] getSellers() {
		return sellers;
	}

	public void setSellers(Seller[] sellers) {
		this.sellers = sellers;
	}

	public int getTotalSeller() {
		return totalSeller;
	}

	public void setTotalSeller(int totalSeller) {
		this.totalSeller = totalSeller;
	}

	@Override
	public void hireSeller(Seller seller) {
		if (totalSeller < ALL_SELLERS) {
			sellers[totalSeller++] = seller;
			System.out.println("hire a seller: " + seller.getName());
		} 
	}
	
	@Override
	public void hireAccountor(Accountor accountor) {
		this.accountor = accountor;
		System.out.println("hire an account: " + accountor.getName());
	}
	
	@Override
	public void inCar(Car car) {
		if (totalCars < ALL_CARS) {
			cars[totalCars++] = car;
			System.out.println("get a car");
		}
	}
	
	@Override
	public void inSUV(SUV suv) {
		if (totalSuvs < ALL_SUVS) {
			suvs[totalSuvs++] = suv;
			System.out.println("get a suv");
		}
	}

}
