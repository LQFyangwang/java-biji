package com.gs.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {

	private List<Account> accounts;
	// 在Bank银行内中把此账号存储起来，account数组具有Account的所有属性，可以接收Account类属性的值
	private String name;

	/**
	 * 无参构造方法
	 */
	public Bank() {

	}

	/**
	 * 告诉构造方法需要存储多少个账号
	 * 
	 * 
	 * @param count
	 */
	public Bank(int count) {
		accounts = new ArrayList<Account>();
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 用于开户功能 ，需要接收name和pwd参数
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	public Account open(String name, String pwd, double money) {
		// 开户，随机生成一个账号
		Account account = new Account(); // 银行创建账户
		String no = randomAccountNo();
		account.setNo(no);
		account.setMoney(money); // 初始存入多少元钱
		account.setName(name);
		account.setPwd(pwd);
		accounts.add(account);
		return account; // 如果可以开户，成功返回account，返回account的所有属性的值

	}

	/**
	 * 用于生成一个随机的账号
	 * 
	 * @return
	 */
	private String randomAccountNo() {
		Random random = new Random();
		return String.valueOf(random.nextInt(100000));
	}

	/**
	 * 打印所有已经开设的账户的信息
	 */
	public void printAllAccounts() {
		for (Account a : accounts) {
			System.out.println(a);
		}
	}

	/**
	 * 通过用户提供的账号及密码来判断是否有此账号并且登录
	 * 
	 * @param no
	 * @param pwd
	 * @return Account
	 */
	public Account login(String no, String pwd) {
		for (Account a : accounts) {
			if (a.getNo().equals(no) && a.getPwd().equals(pwd)) {
				return a;
			}
		}
		return null; // 否则返回空
	}

	/**
	 * 在原先余额基础上增加存款额后重新设置给余额
	 * 
	 * @param account
	 * @param money
	 */
	public void saveMoney(Account account, double money) {
		account.setMoney(account.getMoney() + money);
	}

	/**
	 * 取款操作，如果取款额大于余额，则取款不成功，否则可取款
	 * 
	 * @param account
	 * @param money
	 * @return
	 */
	public boolean getMoney(Account account, double money) {
		if (money > account.getMoney()) {
			return false;
		}
		account.setMoney(account.getMoney() - money);
		return true;
	}

	/**
	 * 转账，从fromAccount转账到toAccount
	 * 
	 * @param fromAccount
	 * @param toAccount
	 * @param money
	 * @return
	 */
	public boolean transfer(Account fromAccount, Account toAccount, double money) {
		if (money > fromAccount.getMoney()) {
			return false;
		} else {
			fromAccount.setMoney(fromAccount.getMoney() - money);
			toAccount.setMoney(toAccount.getMoney() + money);
			return true;
		}
	}

	/**
	 * 根据no搜索银行账号
	 * 
	 * @param no
	 * @return
	 */
	public Account searchAccount(String no) {
		for (Account a : accounts) {
			if (a.getNo().equals(no)) {
				return a;
			}
		}
		return null;
	}

}
