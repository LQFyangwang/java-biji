package com.gs.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class ScannerSort {
	
	@Test
	public void testSort() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一串数字，以空格分割");
		String str = scanner.nextLine();
		String[] strs = str.split(" ");
		// 1、排序算法
		// 2、集合存储并排序
		List<Integer> numbers = new ArrayList<Integer>();
		for (String s : strs) {
			Integer a = Integer.valueOf(s);
			numbers.add(a);
		}
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2; // 如果返回值为0，则两个相等，如果返回值 < 0， o1更小，如果返回值大于0，则o2更小
			}
		});
		for (Integer num : numbers) {
			System.out.println(num);
		}
		scanner.close();
	}

}
