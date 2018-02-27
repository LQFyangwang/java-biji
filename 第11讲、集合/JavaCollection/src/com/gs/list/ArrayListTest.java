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
		list.addAll(subList); // ����Ӽ���
		System.out.println(list.get(0)); // ����������ȡԪ��
		System.out.println(list.get(5));
		// System.out.println(list.get(10)); // ��������������Խ��
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.remove(0)); // �����������Ƴ�Ԫ��
		System.out.println(list.remove("item3")); // ���ݶ������Ƴ�Ԫ��
		System.out.println(list.removeAll(subList)); // ����ָ�����Ӽ������Ƴ�Ԫ��
		System.out.println(list.indexOf("item2")); // ����Ԫ�����ж��Ƿ������Ԫ�أ������ش�Ԫ�ص�����
		System.out.println(list.lastIndexOf("item2")); // ������濪ʼ����
		list.contains("item2"); // �ж��Ƿ����ĳ��Ԫ�أ���������true�����򷵻�false
		// ��ȡ�Ӽ���
		List<String> subList1 = list.subList(2, 4); // ������ʼ��������������������
		for (int i = 0, size = list.size(); i < size; i++) {
			System.out.println(i + ", " + list.get(i));
		}
		System.out.println("*******************");
		for (int i = 0, size = subList1.size(); i < size; i++) {
			System.out.println(i + ", " + subList1.get(i));
		}
		System.out.println("*******************");
		for (String str : list) { // foreach����
			System.out.println(str);
		}
		
		String[] strArray = new String[]{"a", "b", "c"};
		for (String str : strArray) {
			System.out.println(str);
		}
		
		// list.clear(); // �����������
		
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
