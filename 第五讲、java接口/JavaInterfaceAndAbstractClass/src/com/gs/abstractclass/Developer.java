package com.gs.abstractclass;

public class Developer extends Job {

	@Override
	public void sign() {
		System.out.println("��9��������ֱ�Ӵ�");
	}

	@Override
	public void checkComputer() {
		System.out.println("����Ա�ĵ��Բ��ü��");
	}

	@Override
	public void work() {
		System.out.println("д��1000�д���");
	}

	@Override
	public void getOff() {
		System.out.println("�ܲ��ң��Ӱൽ19����°�");
	}

}
