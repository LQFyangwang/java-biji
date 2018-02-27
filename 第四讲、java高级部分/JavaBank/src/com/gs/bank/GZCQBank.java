package com.gs.bank;

import java.util.Scanner;

public class GZCQBank {
	
	public static void main(String[] args) {
		Bank bank = new Bank(10);
		bank.setName("赣州坑钱银行");
		Scanner scanner = new Scanner(System.in);
		String operation = "";
		do {
			System.out.println("欢迎来到赣州坑钱银行，请选择操作：1、开户，2、存款，3、取钱，4、查询，5、转账，6、退出");
			operation = scanner.next();
			if (operation.equals("1")) {
				System.out.println("请分别输入姓名，密码，数字余额（用回车隔开）");
				String name = scanner.next();
				String pwd = scanner.next();
				double money = scanner.nextDouble();
				Account account = bank.open(name, pwd, money);
				if (account != null) {
					System.out.println("成功开设账号，请牢记密码，账号为：" + account.getNo() + ", 余额为： " + account.getMoney());
				} else {
					System.out.println("坑钱银行不能再开户了");
				}
			} else if (operation.equals("2")) {
				System.out.println("请输入账号和密码：");
				String no = scanner.next();
				String pwd = scanner.next();
				Account account = bank.login(no, pwd); // 登录成功，返回登录账号
				if (account != null) { // 有此账号存在
					System.out.println("请输入存款额");
					double money = scanner.nextDouble();
					if (money < 0) {
						System.out.println("请输入正确的存款额，大于0");
					} else {
						bank.saveMoney(account, money);// 对当前登录的账户进行增加余额的操作
						System.out.println("存款成功，账户信息如下：" + account);
					}
				} else {
					System.out.println("不存在此账号，请重新操作");
				}
			} else if (operation.equals("3")) {
				System.out.println("请输入账号和密码：");
				String no = scanner.next();
				String pwd = scanner.next();
				Account account = bank.login(no, pwd); // 登录成功，返回登录账号
				if (account != null) {
					System.out.println("请输入取款额");
					double money = scanner.nextDouble();
					if (money < 0) {
						System.out.println("请输入正确的取款额，大于0");
					} else {
						if (bank.getMoney(account, money)) {
							System.out.println("取钱成功，账户信息如下：" + account);
						} else {
							System.out.println("余额不足");
						}
					}
				} else {
					System.out.println("不存在此账号，请重新操作");
				}
			} else if (operation.equals("4")) {
				System.out.println("请输入账号和密码：");
				String no = scanner.next();
				String pwd = scanner.next();
				Account account = bank.login(no, pwd); // 登录成功，返回登录账号
				System.out.println("查询的账号信息如下：" + account);
			} else if (operation.equals("5")) {
				System.out.println("请输入账号和密码：");
				String no = scanner.next();
				String pwd = scanner.next();
				Account account = bank.login(no, pwd); // 登录成功，返回登录账号
				if (account != null) {
					System.out.println("请输入对方账号");
					String toNo = scanner.next();
					Account toAccount = bank.searchAccount(toNo); // 搜索对方账号
					if (toAccount != null) {
						System.out.println("请输入转账金额");
						double m = scanner.nextDouble();
						if (bank.transfer(account, toAccount, m)) {
							System.out.println("转账成功");
						} else {
							System.out.println("转账失败，余额不足");
						}
					} else {
						System.out.println("对方账号不存在");
					}
				} else {
					System.out.println("不存在此账号，请重新操作");
				}
			}
	
		} while(!operation.equals("6"));
		scanner.close();
		System.out.println("退出银行了");
	}

}
