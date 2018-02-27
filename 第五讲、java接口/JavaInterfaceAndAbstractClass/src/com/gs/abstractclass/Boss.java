package com.gs.abstractclass;

public class Boss extends Job {

	@Override
	public void sign() {
		System.out.println("不打卡，早上11点到了");
	}

	@Override
	public void checkComputer() {
		System.out.println("请秘书来检查一下");
	}

	@Override
	public void work() {
		System.out.println("喝喝茶，聊聊天");
	}

	@Override
	public void getOff() {
		System.out.println("下午三点有个约会，跑啦...");
	}

}
