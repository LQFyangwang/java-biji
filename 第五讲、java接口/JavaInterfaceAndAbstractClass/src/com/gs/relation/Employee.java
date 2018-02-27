package com.gs.relation;

/**
 * 员工类
 *
 */
public class Employee {

	private String name;
	private String no;
	private String job;
	
	private Company company; // 员工属于某个公司 
	
	private Card bocBank; // 员工有一张中国银行的卡
	private Card boccBank;
	private Card abcBank;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Card getBocBank() {
		return bocBank;
	}
	public void setBocBank(Card bocBank) {
		this.bocBank = bocBank;
	}
	public Card getBoccBank() {
		return boccBank;
	}
	public void setBoccBank(Card boccBank) {
		this.boccBank = boccBank;
	}
	public Card getAbcBank() {
		return abcBank;
	}
	public void setAbcBank(Card abcBank) {
		this.abcBank = abcBank;
	}
	
}
