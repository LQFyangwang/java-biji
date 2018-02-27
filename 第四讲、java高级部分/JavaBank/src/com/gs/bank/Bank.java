package com.gs.bank;

import java.util.Random;

public class Bank {

	private Account[] accounts;  
	// ��Bank�������аѴ��˺Ŵ洢������account�������Account���������ԣ����Խ���Account�����Ե�ֵ
	private int count; // �����洢�������п��Դ��������˻���
	private int currentCount; // ��ǰ�Ѿ�������˻���
	private String name;

	/**
	 * �޲ι��췽��
	 */
	public Bank() {

	}

	/**
	 * ���߹��췽����Ҫ�洢���ٸ��˺�
	 * 
	 * 
	 * @param count
	 */
	public Bank(int count) {
		this.count = count; // ��ʼ���ܹ��洢���ٸ��˻���
		accounts = new Account[count]; // ��ʼ�洢count�˻�������ĳ���
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
	 * ���ڿ������� ����Ҫ����name��pwd����
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	public Account open(String name, String pwd, double money) {
		if (currentCount < count) { // ����ǰ���˻���С���ܹ����������˻���ʱ���ſ��Կ���
			// �������������һ���˺�
			Account account = new Account(); // ���д����˻�
			String no = randomAccountNo();
			account.setNo(no);
			account.setMoney(money); // ��ʼ�������ԪǮ
			account.setName(name);
			account.setPwd(pwd);
			accounts[currentCount] = account; 
			// ��account���Ե�����ֵ����accounts[currentCount]�У�account��ʾ��������ֵ
			//account��һ�����󣬰�account�����ֵ���һ��������ͬ���Ե������У�����һ��Ӧccounts[0]
			//����2��Ӧccounts[1]
			//�������һ���˻���ʱ��currentCount =
			// 0, ������ϣ�currentCount��1���������Կ���ڶ����˻���ʱ��currentCount��1
			currentCount++;
			return account; // ������Կ������ɹ�����account������account���������Ե�ֵ
		} else {
			return null; // �����ٿ����ˣ��򷵻�null
		}
	}

	/**
	 * ��������һ��������˺�
	 * 
	 * @return
	 */
	private String randomAccountNo() {
		Random random = new Random();
		return String.valueOf(random.nextInt(100000));
	}

	/**
	 * ��ӡ�����Ѿ�������˻�����Ϣ
	 */
	public void printAllAccounts() {
		for (int i = 0; i < currentCount; i++) {
			System.out.println(accounts[i]);
		}
	}

	/**
	 * ͨ���û��ṩ���˺ż��������ж��Ƿ��д��˺Ų��ҵ�¼
	 * 
	 * @param no
	 * @param pwd
	 * @return Account
	 */
	public Account login(String no, String pwd) {
		for (int i = 0; i < currentCount; i++) {
			Account a = accounts[i];
			if (a.getNo().equals(no) && a.getPwd().equals(pwd)) { // ����û�������˺ź��������������ϵͳ�У��򷵻��û��˻���Ϣ
				return a;
			}
		}
		return null; // ���򷵻ؿ�
	}

	/**
	 * ��ԭ�������������Ӵ�����������ø����
	 * 
	 * @param account
	 * @param money
	 */
	public void saveMoney(Account account, double money) {
		account.setMoney(account.getMoney() + money);
	}

	/**
	 * ȡ����������ȡ����������ȡ��ɹ��������ȡ��
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
	 * ת�ˣ���fromAccountת�˵�toAccount
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
	 * ����no���������˺�
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
