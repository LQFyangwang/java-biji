package ht;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack(); //ջ�����ݽṹ
		
		//������ѹ��ջ��
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		
		//����ջ��Ԫ��
		Integer i1 = (Integer)stack.pop();
		System.out.println(stack.size());
		
		Integer i2 = (Integer)stack.pop();
		Integer i3 = (Integer)stack.pop();
		
		System.out.println(i1+"  "+i2+"  "+i3);
	}
}
