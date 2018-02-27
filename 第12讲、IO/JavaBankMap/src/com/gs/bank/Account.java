package com.gs.bank;

public class Account {
	
	private String no; // ’À∫≈
	private String name; // –’√˚ 
	private String pwd; // √‹¬Î
	private double money; // ”‡∂Ó
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [no=" + no + ", name=" + name + ", pwd=" + pwd + ", money=" + money + "]";
	}
	
}
