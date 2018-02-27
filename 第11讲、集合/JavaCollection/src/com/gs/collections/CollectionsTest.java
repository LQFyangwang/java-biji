package com.gs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * 排序算法
 * 查找算法
 * 寻径算法
 * 
 * 算法导论
 *
 */
public class CollectionsTest {
	
	@Test
	public void testCollections() {
		List<String> strs = new ArrayList<String>();
		strs.add("item1");
		Collections.addAll(strs, new String[]{"item3", "item2"}); // String... args表示args是可变长度的参数，"a",     {"a", "b"}
		for (String s : strs) {
			System.out.println(s);
		}
		// 二分查找算法
		int idx = Collections.binarySearch(strs, "item2");
		System.out.println(idx);
		
		Collections.sort(strs); // 排序，默认的排序规则为升序排序
		for (String s : strs) {
			System.out.println(s);
		}
		
		System.out.println("*********************");
		System.out.println(Collections.max(strs));
		System.out.println(Collections.min(strs));
		
		System.out.println("*********************");
		Collections.shuffle(strs); // 把集合内的元素全部打乱
		for (String s : strs) {
			System.out.println(s);
		}
	
	}

}
