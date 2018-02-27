package com.gs.interfacetest;

public abstract class Employee implements IJob {

	@Override
	public void sign() {
		System.out.println("全部员工9点前指纹打卡");
	}

}
