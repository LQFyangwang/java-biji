package com.gs.abstractclass;

public class Boss extends Job {

	@Override
	public void sign() {
		System.out.println("���򿨣�����11�㵽��");
	}

	@Override
	public void checkComputer() {
		System.out.println("�����������һ��");
	}

	@Override
	public void work() {
		System.out.println("�ȺȲ裬������");
	}

	@Override
	public void getOff() {
		System.out.println("���������и�Լ�ᣬ����...");
	}

}
