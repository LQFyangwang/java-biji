package com.gs.set;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.gs.bean.User;

public class TreeSetTest {
	
	@Test
	public void testTree() {
		Set<User> users = new TreeSet<User>();
		User u1 = new User();
		u1.setId(1);
		users.add(u1);
		User u2 = new User();
		u2.setId(2);
		users.add(u2);
		System.out.println(users.size());
		users.contains(u1); // true
		// users.remove(u1);
		for (User u : users) {
			System.out.println(u);
		}
		users.isEmpty();
		users.clear();
		
	}

}
