package com.gs.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

import org.junit.Test;

import com.gs.bean.User;

public class IteratorTest {
	
	@Test
	public void testIterator() {
		/**
		 * �����ڴ��ʹ���������ʹ��ϻ��ж��������͹���
		 */
		List<String> list = new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		for (int i = 0, size = list.size(); i < size; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("list index***********************");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("list foreach***********************");
		Iterator<String> listIterator = list.iterator(); // ��ȡ���˰������ַ����ĵ�����
		while (listIterator.hasNext()) { // �жϵ��������Ƿ�����һ��Ԫ�أ����������뵽ѭ����
			String str = listIterator.next(); // ����һ��Ԫ���ó���
			System.out.println(str);
		}
		System.out.println("list iterator***********************");
		Vector<User> userVector = new Vector<User>();
		User u1 = new User();
		u1.setId(1);
		User u2 = new User();
		u2.setId(2);
		userVector.add(u1);
		userVector.add(u2);
		for (int i = 0, size = userVector.size(); i < size; i++) {
			System.out.println(userVector.get(i));
		}
		System.out.println("vector index************************");
		for (User u : userVector) {
			System.out.println(u);
		}
		System.out.println("vector foreach***********************");
		Iterator<User> userIterator = userVector.iterator();
		while (userIterator.hasNext()) {
			User user = userIterator.next();
			System.out.println(user);
		}
		System.out.println("vector iterator***********************");
		Set<User> userSet = new HashSet<User>();
		userSet.add(u1);
		userSet.add(u2);
		for (User u : userSet) {
			System.out.println(u);
		}
		System.out.println("set foreach***************************");
		Iterator<User> setIterator = userSet.iterator();
		while (setIterator.hasNext()) {
			User u = setIterator.next();
			System.out.println(u);
		}
		System.out.println("set iterator*********************");
		Map<String, User> userMap = new HashMap<String, User>();
		userMap.put("u1", u1);
		userMap.put("u2", u2);
		// Entry
		// Entry<String, User>��ʾһ��key-value��ӳ��
		// �ɶ��Entry<String, User>���Էŵ�һ��Set����
		Set<Entry<String, User>> entrySet = userMap.entrySet(); // ��ȡ��Map��Entry����ɵ�Set
		Iterator<Entry<String, User>> entryIte = entrySet.iterator();
		while (entryIte.hasNext()) {
			Entry<String, User> entry = entryIte.next();
			System.out.println(entry.getKey() + ": " + entry.getValue()); // ��ȡ��Ŀ���key // ��ȡ��Ŀ���value
		}
	}

}
