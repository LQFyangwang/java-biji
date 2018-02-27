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
		users.put("user2", u3); // 一个Map结构里出现的key只能对应一个value，如果两个一样的key指向不同的value，则后面put进去的value才是可用的
		System.out.println(users.size());
		System.out.println(users.get("user1")); // 通过key查找对应的value
		System.out.println(users.get("user2"));
		System.out.println(users.containsKey("user1")); // 判断是否包含某个键
		User u4 = new User();
		u4.setId(1);
		System.out.println(u4);
		System.out.println(users.containsValue(u4)); // 判断是否包含某个值（对象的equals方法来判断）
		users.remove("user2");
		System.out.println(users.size()); // 根据键删除对象
		users.remove("user1", u2); // 第一个参数是key，第二个参数是value，只有当key确实与value映射在一起的时候，才能删除
		System.out.println(users.size());
		User u5 = new User();
		u5.setId(5);
		users.put("user5", u5);
		Collection<User> userValues = users.values(); // 返回值所组成的集合，可以对此集合使用foreach遍历获取值
		for (User u : userValues) {
			System.out.println(u);
		}
		users.isEmpty(); // 判断是否为空
		users.replace("user5", new User()); // 把指定key的值替换掉，第一个参数是key, 第二个参数是新的值
		System.out.println("LLLLLLLLL");
		
		Set<Entry<String, User>> entrySet = users.entrySet();
		System.out.println(users.entrySet());
		Iterator<Entry<String, User>> ite = entrySet.iterator();
		while (ite.hasNext()) {
			Entry<String, User> entry = ite.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("************************");
		Set<String> keySet = users.keySet();//获取key
		System.out.println(users.keySet());
		for (String s : keySet) {
			System.out.println(s);
			System.out.println(users.get(s));
		}
		
	}

}
