 package com.gs.awt;

import java.awt.Frame;

public class FirstFrame2 extends Frame {

	private static final long serialVersionUID = -7190221901009802329L; // ���л��汾��

	public FirstFrame2() {
		setSize(400, 200); // ���Զ��崰�����ô�С
		// setLocation(300, 200); // ���ô��ڵ�λ��
		setLocationRelativeTo(null); // ����һ�����λ�ã������ĳ�������һ��λ�ã��������һ��������������
		setTitle("��һ�����ڳ���"); // ���ô��ڵı���
		MyWindowListener1 ltn = new MyWindowListener1(this);
		addWindowListener(ltn); // ����ǰ�����¼�Դ�������һ�����ڼ�������ͨ���������WindowListener�ӿڵ�ʵ�������
		setVisible(true); // ���ô���Ϊ�ɼ���
	}
	
	public static void main(String[] args) {
		new FirstFrame2();
	}

}
