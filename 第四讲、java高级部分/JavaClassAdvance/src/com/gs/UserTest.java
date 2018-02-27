package com.gs;

public class UserTest {
	public static void main(String[] args) {
		User user = new User();
		System.out.println(user);
		user.setName("Ğ¡Ã÷");
		user.setAge(20);
		user.setGender("ÄĞ");
		System.out.println(user);
		System.out.println(user.getName() + user.getAge() + user.getGender());
	}

}
