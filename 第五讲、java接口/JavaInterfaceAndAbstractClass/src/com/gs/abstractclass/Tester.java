package com.gs.abstractclass;

public class Tester extends Job {

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
		System.out.println("����15��bug���Ͻ����߳���Ա");
	}

	@Override
	public void getOff() {
		System.out.println("�����°࣬6������");
	}

}
