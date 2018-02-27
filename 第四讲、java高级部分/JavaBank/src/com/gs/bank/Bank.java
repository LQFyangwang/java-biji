package com.gs.bank;

import java.util.Random;

public class Bank {

	private Account[] accounts;  
	// 在Bank银行内中把此账号存储起来，account数组具有Account的所有属性，可以接收Account类属性的值
	private int count; // 用来存储整个银行可以创建的总账户数
	private int currentCount; // 当前已经开设的账户数
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
		this.count = count; // 初始化能够存储多少个账户数
		accounts = new Account[count]; // 初始存储count账户的数组的长度
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCurrentCount() {
		return currentCount;
	}

	public void setCurrentCount(int currentCount) {
		this.currentCount = currentCount;
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
		if (currentCount < count) { // 当当前总账户数小于能够开设的最大账户数时，才可以开户
			// 开户，随机生成一个账号
			Account account = new Account(); // 银行创建账户
			String no = randomAccountNo();
			account.setNo(no);
			account.setMoney(money); // 初始存入多少元钱
			account.setName(name);
			account.setPwd(pwd);
			accounts[currentCount] = account; 
			// 把account属性的所有值传到accounts[currentCount]中，account表示所有属性值
			//account是一个对象，把account对象的值村道一个具有相同属性的数组中，对象一对应ccounts[0]
			//对象2对应ccounts[1]
			//当开设第一个账户的时候，currentCount =
			// 0, 开设完毕，currentCount加1操作，所以开设第二个账户的时候，currentCount是1
			currentCount++;
			return account; // 如果可以开户，成功返回account，返回account的所有属性的值
		} else {
			return null; // 不能再开户了，则返回null
		}
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
		for (int i = 0; i < currentCount; i++) {
			System.out.println(accounts[i]);
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
		for (int i = 0; i < currentCount; i++) {
			Account a = accounts[i];
			if (a.getNo().equals(no) && a.getPwd().equals(pwd)) { // 如果用户输入的账号和密码存在于银行系统中，则返回用户账户信息
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
		for (int i = 0; i < currentCount; i++) {
			Account a = accounts[i];
			if (a.getNo().equals(no)) {
				return a;
			}
		}
		return null;
	}

}
