package com.gs.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.gs.bean.User;

public class ArrayListTest {
	
	@Test
	public void testList() {
		List<String> list = new ArrayList<String>();
		list.add("item7");
		list.add("item5");
		list.add("item1");
		list.add("item2");
		list.add("item1");
		list.add("itme3");
		list.add(1, "item4");
		List<String> subList = new ArrayList<String>();
		subList.add("item5");
		subList.add("item6");
		list.addAll(subList); // 添加子集合
		System.out.println(list.get(0)); // 根据索引获取元素
		System.out.println(list.get(5));
		// System.out.println(list.get(10)); // 超出索引则数组越界
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.remove(0)); // 根据索引来移除元素
		System.out.println(list.remove("item3")); // 根据对象来移除元素
		System.out.println(list.removeAll(subList)); // 根据指定的子集合来移除元素
		System.out.println(list.indexOf("item2")); // 根据元素来判断是否包含此元素，并返回此元素的索引
		System.out.println(list.lastIndexOf("item2")); // 从最后面开始检索
		list.contains("item2"); // 判断是否包含某个元素，包含返回true，否则返回false
		// 获取子集合
		List<String> subList1 = list.subList(2, 4); // 包含开始索引，不包含结束索引
		for (int i = 0, size = list.size(); i < size; i++) {
			System.out.println(i + ", " + list.get(i));
		}
		System.out.println("*******************");
		for (int i = 0, size = subList1.size(); i < size; i++) {
			System.out.println(i + ", " + subList1.get(i));
		}
		System.out.println("*******************");
		for (String str : list) { // foreach遍历
			System.out.println(str);
		}
		
		String[] strArray = new String[]{"a", "b", "c"};
		for (String str : strArray) {
			System.out.println(str);
		}
		
		// list.clear(); // 清空整个集合
		
		List<User> users = new ArrayList<User>();
		User u = new User();
		u.setId(1);
		users.add(u);
		User u1 = new User();
		u1.setId(1);
		System.out.println(users.contains(u1));
		System.out.println(u1);
		System.out.println(u);
	}

}
