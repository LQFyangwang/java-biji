package com.gs.test;

import org.junit.Test;

import com.gs.bean.User;
import com.gs.service.UserService;
import com.gs.service.UserServiceImpl;

import junit.framework.TestCase;

public class UserSerivceTest extends TestCase {

	private UserService userService;
	
	@Override
	protected void setUp() throws Exception {
		userService = new UserServiceImpl();
	}
	
	@Test
	public void testQueryEmailPwd() {
		User user = userService.queryEmailPwd("abc@126.com", "123456");
		if (user != null) {
			System.out.println(user);
		}
	}

}
