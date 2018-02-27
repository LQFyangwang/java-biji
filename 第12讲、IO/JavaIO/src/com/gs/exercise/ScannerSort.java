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
		System.out.println("������һ�����֣��Կո�ָ�");
		String str = scanner.nextLine();
		String[] strs = str.split(" ");
		// 1�������㷨
		// 2�����ϴ洢������
		List<Integer> numbers = new ArrayList<Integer>();
		for (String s : strs) {
			Integer a = Integer.valueOf(s);
			numbers.add(a);
		}
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2; // �������ֵΪ0����������ȣ��������ֵ < 0�� o1��С���������ֵ����0����o2��С
			}
		});
		for (Integer num : numbers) {
			System.out.println(num);
		}
		scanner.close();
	}

}
