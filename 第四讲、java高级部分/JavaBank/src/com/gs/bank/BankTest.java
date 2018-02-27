package com.gs.bank;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank(10); // ����һ��bank����
		Account account = bank.open("С��", "123456", 1000);
		// Account��һ����������,account��һ������bank.open�����ı���
		if (account != null) {
			System.out.println(account);
			System.out.println(bank.getCount()); // 10
			System.out.println(bank.getCurrentCount()); // 1
		}

		Account account1 = bank.open("С��", "123456", 500.0);
		if (account1 != null) {
			System.out.println(account1);
			System.out.println(bank.getCount()); // 10
			System.out.println(bank.getCurrentCount()); // 2
		}

		bank.printAllAccounts();

	}

}
