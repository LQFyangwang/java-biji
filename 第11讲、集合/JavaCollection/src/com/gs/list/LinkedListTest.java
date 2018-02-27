package com.gs.list;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.gs.bean.User;

public class LinkedListTest {
	
	@Test
	public void testLinkedList() {
		List<User> users = new LinkedList<User>();
		User u1 = new User();
		u1.setId(1);
		users.add(u1);
		User u2 = new User();
		u2.setId(1);
		users.add(u2);
		System.out.println(users.size());
		System.out.println(users.isEmpty());
		users.get(1);
		users.get(0);
		users.contains(u1);
		users.remove(u2);
		users.add(0, new User());
		users.clear();
	}

}
