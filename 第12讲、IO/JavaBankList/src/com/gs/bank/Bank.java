package com.gs.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {

	private List<Account> accounts;
	// ��Bank�������аѴ��˺Ŵ洢������account�������Account���������ԣ����Խ���Account�����Ե�ֵ
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
	 * ���ڿ������� ����Ҫ����name��pwd����
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	public Account open(String name, String pwd, double money) {
		// �������������һ���˺�
		Account account = new Account(); // ���д����˻�
		String no = randomAccountNo();
		account.setNo(no);
		account.setMoney(money); // ��ʼ�������ԪǮ
		account.setName(name);
		account.setPwd(pwd);
		accounts.add(account);
		return account; // ������Կ������ɹ�����account������account���������Ե�ֵ

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
		for (Account a : accounts) {
			System.out.println(a);
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
		for (Account a : accounts) {
			if (a.getNo().equals(no) && a.getPwd().equals(pwd)) {
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
		for (Account a : accounts) {
			if (a.getNo().equals(no)) {
				return a;
			}
		}
		return null;
	}

}
