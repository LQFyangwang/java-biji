package com.gs.bank;

import java.util.Scanner;

public class GZCQBank {
	
	public static void main(String[] args) {
		Bank bank = new Bank(10);
		bank.setName("���ݿ�Ǯ����");
		Scanner scanner = new Scanner(System.in);
		String operation = "";
		do {
			System.out.println("��ӭ�������ݿ�Ǯ���У���ѡ�������1��������2����3��ȡǮ��4����ѯ��5��ת�ˣ�6���˳�");
			operation = scanner.next();
			if (operation.equals("1")) {
				System.out.println("��ֱ��������������룬�������ûس�������");
				String name = scanner.next();
				String pwd = scanner.next();
				double money = scanner.nextDouble();
				Account account = bank.open(name, pwd, money);
				if (account != null) {
					System.out.println("�ɹ������˺ţ����μ����룬�˺�Ϊ��" + account.getNo() + ", ���Ϊ�� " + account.getMoney());
				} else {
					System.out.println("��Ǯ���в����ٿ�����");
				}
			} else if (operation.equals("2")) {
				System.out.println("�������˺ź����룺");
				String no = scanner.next();
				String pwd = scanner.next();
				Account account = bank.login(no, pwd); // ��¼�ɹ������ص�¼�˺�
				if (account != null) { // �д��˺Ŵ���
					System.out.println("���������");
					double money = scanner.nextDouble();
					if (money < 0) {
						System.out.println("��������ȷ�Ĵ������0");
					} else {
						bank.saveMoney(account, money);// �Ե�ǰ��¼���˻������������Ĳ���
						System.out.println("���ɹ����˻���Ϣ���£�" + account);
					}
				} else {
					System.out.println("�����ڴ��˺ţ������²���");
				}
			} else if (operation.equals("3")) {
				System.out.println("�������˺ź����룺");
				String no = scanner.next();
				String pwd = scanner.next();
				Account account = bank.login(no, pwd); // ��¼�ɹ������ص�¼�˺�
				if (account != null) {
					System.out.println("������ȡ���");
					double money = scanner.nextDouble();
					if (money < 0) {
						System.out.println("��������ȷ��ȡ������0");
					} else {
						if (bank.getMoney(account, money)) {
							System.out.println("ȡǮ�ɹ����˻���Ϣ���£�" + account);
						} else {
							System.out.println("����");
						}
					}
				} else {
					System.out.println("�����ڴ��˺ţ������²���");
				}
			} else if (operation.equals("4")) {
				System.out.println("�������˺ź����룺");
				String no = scanner.next();
				String pwd = scanner.next();
				Account account = bank.login(no, pwd); // ��¼�ɹ������ص�¼�˺�
				System.out.println("��ѯ���˺���Ϣ���£�" + account);
			} else if (operation.equals("5")) {
				System.out.println("�������˺ź����룺");
				String no = scanner.next();
				String pwd = scanner.next();
				Account account = bank.login(no, pwd); // ��¼�ɹ������ص�¼�˺�
				if (account != null) {
					System.out.println("������Է��˺�");
					String toNo = scanner.next();
					Account toAccount = bank.searchAccount(toNo); // �����Է��˺�
					if (toAccount != null) {
						System.out.println("������ת�˽��");
						double m = scanner.nextDouble();
						if (bank.transfer(account, toAccount, m)) {
							System.out.println("ת�˳ɹ�");
						} else {
							System.out.println("ת��ʧ�ܣ�����");
						}
					} else {
						System.out.println("�Է��˺Ų�����");
					}
				} else {
					System.out.println("�����ڴ��˺ţ������²���");
				}
			}
	
		} while(!operation.equals("6"));
		scanner.close();
		System.out.println("�˳�������");
	}

}
