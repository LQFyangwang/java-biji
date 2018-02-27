package com.qq.common;

import java.util.Random;

public class RandomAccount {
	/**
	 * 获取一个从10000-999999999的一个随机账号
	 * @return
	 */
	public static int randomAccount() {
		return new Random().nextInt((999999999 - 10000))  + 10000;
	}
	
}
