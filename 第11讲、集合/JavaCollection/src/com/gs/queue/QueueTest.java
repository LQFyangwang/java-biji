package com.gs.queue;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Test;

public class QueueTest {
	
	@Test
	public void testQueue() {
		ArrayDeque<String> queue = new ArrayDeque<String>();
		queue.add("a"); // 往队尾添加元素
		queue.add("b");
		queue.add("c");
		queue.add("d");
		int size = queue.size();
		System.out.println(size);
		if (!queue.isEmpty()) { // 判断队列是否为空，如果为空，返回true，否则返回false
			System.out.println(queue.poll()); // 从队列的头部移除元素
			System.out.println(queue.poll());
		}
		System.out.println(queue.size());
		System.out.println(queue.contains("a")); // 判断队列中是否包含某个对象，如果包含，返回true，否则返回false
		System.out.println(queue.contains("c"));
		queue.addFirst("e");
		System.out.println(queue.peek());
		System.out.println(queue.remove()); // 与poll方法一样，获取头部并移除
		System.out.println(queue.remove("d")); // 指定删除某个元素
		Queue<String> delQueue = new ArrayDeque<String>();
		delQueue.add("c");
		delQueue.add("d");
		queue.removeAll(delQueue); // 根据指定的队列数据来删除
		queue.clear(); // 清空整个队列
	}
	
}
