package com.gs.list;

import java.util.Stack;

import org.junit.Test;

import com.gs.bean.User;

public class StackTest {

	@Test
	public void testStack() {
		Stack<User> stack = new Stack<User>();
		User user1 = new User();
		user1.setId(1);
		user1.setEmail("abc@qq.com");
		stack.push(user1); // 压栈
		User user2 = new User();
		user2.setId(2);
		user2.setEmail("111@qq.com");
		stack.push(user2);
		User u = stack.pop(); // 出栈，获取栈顶元素并移除
		System.out.println(u);
		User u1 = stack.peek(); // 获取栈顶元素但不移除
		System.out.println(u1);
		System.out.println(stack.size());
		stack.isEmpty(); // stack.empty();   // 判断栈是否为空
		User user3 = new User();
		user3.setId(3);
		user3.setEmail("test@qq.com");
		stack.add(0, user3); // 在指定位置去添加元素
		System.out.println("MMMMMMMMM");
		System.out.println(stack.size());
		int index = stack.indexOf(user3);
		System.out.println(index);
		User user4 = new User();
		user4.setId(3);
		user4.setEmail("test@qq.com");
		System.out.println(stack.indexOf(user4));
		stack.clear();
	}
	
}
