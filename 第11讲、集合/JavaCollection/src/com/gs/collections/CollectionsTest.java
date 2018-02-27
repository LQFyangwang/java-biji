package com.gs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * �����㷨
 * �����㷨
 * Ѱ���㷨
 * 
 * �㷨����
 *
 */
public class CollectionsTest {
	
	@Test
	public void testCollections() {
		List<String> strs = new ArrayList<String>();
		strs.add("item1");
		Collections.addAll(strs, new String[]{"item3", "item2"}); // String... args��ʾargs�ǿɱ䳤�ȵĲ�����"a",     {"a", "b"}
		for (String s : strs) {
			System.out.println(s);
		}
		// ���ֲ����㷨
		int idx = Collections.binarySearch(strs, "item2");
		System.out.println(idx);
		
		Collections.sort(strs); // ����Ĭ�ϵ��������Ϊ��������
		for (String s : strs) {
			System.out.println(s);
		}
		
		System.out.println("*********************");
		System.out.println(Collections.max(strs));
		System.out.println(Collections.min(strs));
		
		System.out.println("*********************");
		Collections.shuffle(strs); // �Ѽ����ڵ�Ԫ��ȫ������
		for (String s : strs) {
			System.out.println(s);
		}
	
	}

}
