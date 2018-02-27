package com.gs.abstractclass;

public class Developer extends Job {

	@Override
	public void sign() {
		System.out.println("在9点钟网上直接打卡");
	}

	@Override
	public void checkComputer() {
		System.out.println("程序员的电脑不用检查");
	}

	@Override
	public void work() {
		System.out.println("写了1000行代码");
	}

	@Override
	public void getOff() {
		System.out.println("很不幸，加班到19点才下班");
	}

}
