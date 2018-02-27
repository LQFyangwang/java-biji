package com.gs.exercise;
/**
 * 定义一个名为Vehicles（交通工具）的基类，该类中应包含String类型的成员属性brand（商标）和color（颜色），
 * 还应包含成员方法run（行驶，在控制台显示“我已经开动了”）和showInfo（显示信息，在控制台显示商标和颜色），
 * 并编写构造方法初始化其成员属性。 
编写Car（小汽车）类继承于Vehicles类，增加int型成员属性seats（座位），还应增加成员方法showCar
（在控制台显示小汽车的信息），并编写构造方法。 编写Truck（卡车）类继承于Vehicles类，
增加float型成员属性load（载重），还应增加成员方法showTruck（在控制台显示卡车的信息），并编写构造方法。
 * @author ye
 *
 */
public class Vehicles {
	private String brand;
	private String color;
	
	public Vehicles() {
		
	}
	public Vehicles(String brand,String color) {
		this.brand=brand;
		this.color=color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Vehicles [brand=" + brand + ", color=" + color + "]";
	}
	public void run() {
		System.out.println("我已经开动了");
	}
	
	public void showInfo() {
		System.out.println("商标："+this.brand+",颜色："+this.color);
	}
	
	
	public static void main(String[] args) {
		Vehicles v = new Vehicles();
		v.showInfo();
	}
	
}
