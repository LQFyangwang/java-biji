package com.gs.interfacetest;

/**
 * 抽象类SubUSB实现了USB接口，则此类就拥有的USB接口中定义的所有抽象方法，
 * 继承自SubUSB类的普通子类就必须实现类中的所有抽象方法
 * 因为该类是抽象类，可以不用重写USB接口中的所有方法
 *
 */
public abstract class SubUSB implements USB {//inplements实现
	//抽象方法中可以有成员方法和变量
	public void newMethod() {
		// 此方法是新增的一个普通方法，则在普通子类中可以不实现。
	}
}
