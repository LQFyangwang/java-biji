package com.qq.common;

import java.util.Random;

public class RandomAccount {
	/**
	 * ��ȡһ����10000-999999999��һ������˺�
	 * @return
	 */
	public static int randomAccount() {
		return new Random().nextInt((999999999 - 10000))  + 10000;
	}
	
}
