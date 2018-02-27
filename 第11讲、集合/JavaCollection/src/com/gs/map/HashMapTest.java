package com.gs.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.gs.bean.User;

public class HashMapTest {
	
	@Test
	public void testMap() {
		Map<String, User> users = new HashMap<String, User>();
		User u1 = new User();
		u1.setId(1);
		users.put("user1", u1);
		User u2 = new User();
		u2.setId(2);
		users.put("user2", u2);
		System.out.println(users.size());
		User u3 = new User();
		u3.setId(3);
		users.put("user2", u3); // һ��Map�ṹ����ֵ�keyֻ�ܶ�Ӧһ��value���������һ����keyָ��ͬ��value�������put��ȥ��value���ǿ��õ�
		System.out.println(users.size());
		System.out.println(users.get("user1")); // ͨ��key���Ҷ�Ӧ��value
		System.out.println(users.get("user2"));
		System.out.println(users.containsKey("user1")); // �ж��Ƿ����ĳ����
		User u4 = new User();
		u4.setId(1);
		System.out.println(u4);
		System.out.println(users.containsValue(u4)); // �ж��Ƿ����ĳ��ֵ�������equals�������жϣ�
		users.remove("user2");
		System.out.println(users.size()); // ���ݼ�ɾ������
		users.remove("user1", u2); // ��һ��������key���ڶ���������value��ֻ�е�keyȷʵ��valueӳ����һ���ʱ�򣬲���ɾ��
		System.out.println(users.size());
		User u5 = new User();
		u5.setId(5);
		users.put("user5", u5);
		Collection<User> userValues = users.values(); // ����ֵ����ɵļ��ϣ����ԶԴ˼���ʹ��foreach������ȡֵ
		for (User u : userValues) {
			System.out.println(u);
		}
		users.isEmpty(); // �ж��Ƿ�Ϊ��
		users.replace("user5", new User()); // ��ָ��key��ֵ�滻������һ��������key, �ڶ����������µ�ֵ
		System.out.println("LLLLLLLLL");
		
		Set<Entry<String, User>> entrySet = users.entrySet();
		System.out.println(users.entrySet());
		Iterator<Entry<String, User>> ite = entrySet.iterator();
		while (ite.hasNext()) {
			Entry<String, User> entry = ite.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("************************");
		Set<String> keySet = users.keySet();//��ȡkey
		System.out.println(users.keySet());
		for (String s : keySet) {
			System.out.println(s);
			System.out.println(users.get(s));
		}
		
	}

}
