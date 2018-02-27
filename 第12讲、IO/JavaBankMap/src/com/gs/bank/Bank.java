package com.gs.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Bank {

	private Map<String, Account> accounts;
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
		accounts = new HashMap<String, Account>();
	}

	public Map<String, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, Account> accounts) {
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
		accounts.put(no, account);
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
		Set<String> keySet = accounts.keySet();
		for (String key : keySet) {
			System.out.println(accounts.get(key));
		}
//		Set<Entry<String, Account>> entrySet = accounts.entrySet();
//		for (Entry<String, Account> entry : entrySet) {
//			System.out.println(entry.getValue());
//		}
//		Set<Entry<String, Account>> entrySet1 = accounts.entrySet();
//		Iterator<Entry<String, Account>> entryIte = entrySet1.iterator();
//		while (entryIte.hasNext()) {
//			Entry<String, Account> entry = entryIte.next();
//			System.out.println(entry.getValue());
//		}
	}

	/**
	 * 通过用户提供的账号及密码来判断是否有此账号并且登录
	 * 
	 * @param no
	 * @param pwd
	 * @return Account
	 */
	public Account login(String no, String pwd) {
		Set<String> keySet = accounts.keySet();
		for (String key : keySet) {
			Account a = accounts.get(key);
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
		Set<String> keySet = accounts.keySet();
		for (String key : keySet) {
			Account a = accounts.get(key);
			if (a.getNo().equals(no)) {
				return a;
			}
		}
		return null;
	}

}
