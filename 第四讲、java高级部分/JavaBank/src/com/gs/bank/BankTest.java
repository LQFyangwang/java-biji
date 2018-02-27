package com.gs.bank;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank(10); // 创建一个bank对象
		Account account = bank.open("小明", "123456", 1000);
		// Account是一个数据类型,account是一个接受bank.open方法的变量
		if (account != null) {
			System.out.println(account);
			System.out.println(bank.getCount()); // 10
			System.out.println(bank.getCurrentCount()); // 1
		}

		Account account1 = bank.open("小张", "123456", 500.0);
		if (account1 != null) {
			System.out.println(account1);
			System.out.println(bank.getCount()); // 10
			System.out.println(bank.getCurrentCount()); // 2
		}

		bank.printAllAccounts();

	}

}
