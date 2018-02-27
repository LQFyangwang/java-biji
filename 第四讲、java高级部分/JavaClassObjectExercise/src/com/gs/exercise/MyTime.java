package com.gs.exercise;

/**
 * 在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现一个时间类，来满足程序中的需要。 
定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），
为了保证数据的安全性，这三个成员变量应声明为私有。
 为MyTime类定义构造方法，以方便创建对象时初始化成员变量。 再定义diaplay方法，用于将时间信息打印出来。  
为MyTime类添加以下方法： addSecond(int sec) addMinute(int min) addHour(int hou) subSecond(int sec) subMinute(int min) subHour(int hou) 
 */
public class MyTime {

	private int hour;
	private int minute;
	private int second;
	public MyTime(){
		
	}
	public MyTime(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "MyTime [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	public void display(){
		System.out.println("小时：" +hour + "，分钟：" +minute +",秒钟：" +second);
	}
	public void addSecond(int second){
		this.second += second;
		if (this.second > 59) {
			this.second = 59;
		}
	}
	
	public void addMinute(int minute){
		this.minute += minute;
		if (this.minute > 59) {
			this.minute = 59;
		}
	}
	
	public void addHour(int hour){
		this.hour += hour;
		if (this.hour > 23) {
			this.hour = 23;
		}
	}
	
	public void subSecond(int second){
		this.second -= second;
		if (this.second < 0) {
			this.second = 0;
		}
	}
	
	public void subMinute(int minute){
		this.minute -= minute;
		if (this.minute < 0) {
			this.minute = 0;
		}
	}
	
	public void subHour(int hour){
		this.hour -= hour;
		if (this.hour < 0) {
			this.hour = 0;
		}
	}
	
}
