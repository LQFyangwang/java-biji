package com.gs;

public class ParentSonTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.a = "abc";
		parent.setB(10);
		parent.test(); // parent test abc, 10
		
		Son son = new Son();
		son.a = 10;
		son.setB(20);
		son.test(); // parent test def, 20
	}
	
}
