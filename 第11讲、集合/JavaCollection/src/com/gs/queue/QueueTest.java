package com.gs.queue;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Test;

public class QueueTest {
	
	@Test
	public void testQueue() {
		ArrayDeque<String> queue = new ArrayDeque<String>();
		queue.add("a"); // ����β���Ԫ��
		queue.add("b");
		queue.add("c");
		queue.add("d");
		int size = queue.size();
		System.out.println(size);
		if (!queue.isEmpty()) { // �ж϶����Ƿ�Ϊ�գ����Ϊ�գ�����true�����򷵻�false
			System.out.println(queue.poll()); // �Ӷ��е�ͷ���Ƴ�Ԫ��
			System.out.println(queue.poll());
		}
		System.out.println(queue.size());
		System.out.println(queue.contains("a")); // �ж϶������Ƿ����ĳ�������������������true�����򷵻�false
		System.out.println(queue.contains("c"));
		queue.addFirst("e");
		System.out.println(queue.peek());
		System.out.println(queue.remove()); // ��poll����һ������ȡͷ�����Ƴ�
		System.out.println(queue.remove("d")); // ָ��ɾ��ĳ��Ԫ��
		Queue<String> delQueue = new ArrayDeque<String>();
		delQueue.add("c");
		delQueue.add("d");
		queue.removeAll(delQueue); // ����ָ���Ķ���������ɾ��
		queue.clear(); // �����������
	}
	
}
