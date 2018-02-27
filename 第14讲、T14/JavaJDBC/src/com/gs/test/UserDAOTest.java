package com.gs.test;

import org.junit.Test;

import com.gs.bean.User;
import com.gs.dao.UserDAO;
import com.gs.dao.UserDAOImpl;

import junit.framework.TestCase;

public class UserDAOTest extends TestCase {

	private UserDAO userDAO;
	
	@Override
	public void setUp() {
		userDAO = new UserDAOImpl();
	}
	
	@Test
	public void testQueryEmailPwd() {
		User user = userDAO.queryEmailPwd("abac@126.com", "123456");
		if (user != null) {
			System.out.println(user);
		}
	}
	
}
