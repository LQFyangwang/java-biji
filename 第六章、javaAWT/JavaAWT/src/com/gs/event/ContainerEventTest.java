package com.gs.event;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class ContainerEventTest extends Frame implements ContainerListener {

	private static final long serialVersionUID = -5065093428187054524L;

	public ContainerEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		addContainerListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ContainerEventTest.this.dispose();
			}
		});
		add(new Button("��ť"));
		Button btn = new Button("��ť1");
		add(btn); // �������ӵ�����
		remove(btn); // �������Ƴ����
		setVisible(true);
	}
	
	/**
	 * ������������ 
	 */
	@Override
	public void componentAdded(ContainerEvent e) {
		System.out.println("�����һ�����");
		@SuppressWarnings("unused")//���棬δʹ��
		Object obj = e.getSource(); // ��ȡ�¼�Դ�����������һ��Frame
		Component c = e.getChild(); // ��ȡ��ʲô�����ӵ���������
		if (c instanceof Button) {
			System.out.println("�����һ����ť");
		}
	}

	/**
	 * ����������Ƴ�
	 */
	@Override
	public void componentRemoved(ContainerEvent e) {
		System.out.println("�Ƴ���һ�����");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ContainerEventTest();
			}
			
		});
	}

}
