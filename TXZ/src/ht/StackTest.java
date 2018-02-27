package ht;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack(); //栈的数据结构
		
		//将数据压到栈顶
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		
		//弹出栈顶元素
		Integer i1 = (Integer)stack.pop();
		System.out.println(stack.size());
		
		Integer i2 = (Integer)stack.pop();
		Integer i3 = (Integer)stack.pop();
		
		System.out.println(i1+"  "+i2+"  "+i3);
	}
}
