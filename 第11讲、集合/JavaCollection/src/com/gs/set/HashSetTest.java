package com.gs.set;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.gs.bean.User;

public class HashSetTest {
	
	@Test
	public void testSet() {
		Set<User> users = new HashSet<User>();
		User u1 = new User();
		u1.setId(1);
		users.add(u1); // u1的id为1
		u1.setId(3);
		users.add(u1); // u1的id为3，所以与前面那个u1已经是不一样的对象了
		User u2 = new User();
		u2.setId(2);
		users.add(u2);
		System.out.println(users.size());
		for (User u : users) {
			System.out.println(u);
		}
		users.remove(u1);
		users.contains(u1);
		users.isEmpty(); // 判断是否为空
		users.clear();
	}

}
