package com.gs.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Bank {

	private Map<String, Account> accounts;
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
		accounts.put(no, account);
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
	 * ͨ���û��ṩ���˺ż��������ж��Ƿ��д��˺Ų��ҵ�¼
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
