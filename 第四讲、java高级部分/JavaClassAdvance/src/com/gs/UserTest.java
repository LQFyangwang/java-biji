package com.gs;

public class UserTest {
	public static void main(String[] args) {
		User user = new User();
		System.out.println(user);
		user.setName("С��");
		user.setAge(20);
		user.setGender("��");
		System.out.println(user);
		System.out.println(user.getName() + user.getAge() + user.getGender());
	}

}
