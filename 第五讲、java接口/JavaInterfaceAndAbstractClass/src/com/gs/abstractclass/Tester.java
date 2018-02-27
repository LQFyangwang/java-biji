package com.gs.abstractclass;

public class Tester extends Job {

	@Override
	public void sign() {
		System.out.println("在9点钟网上直接打卡");
	}

	@Override
	public void checkComputer() {
		System.out.println("测试员的电脑不用检查");
	}

	@Override
	public void work() {
		System.out.println("发现15个bug，赶紧告诉程序员");
	}

	@Override
	public void getOff() {
		System.out.println("正常下班，6点跑了");
	}

}
