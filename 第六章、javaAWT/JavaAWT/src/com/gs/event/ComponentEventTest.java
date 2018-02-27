package com.gs.event;

import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class ComponentEventTest extends Frame implements ComponentListener {

	private static final long serialVersionUID = -5409979347922707871L;
	
	public ComponentEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		addComponentListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ComponentEventTest.this.dispose();
			}
		});
		setVisible(true);
	}

	/**
	 * ��������Ĵ�С�仯
	 */
	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("��С�ı���");
		Object obj = e.getSource();  // ��ȡ�¼�Դ����
		int id = e.getID(); // ��ȡ�¼����
		if (obj instanceof Frame) {
			System.out.println("�������һ��frame");
		}
		System.out.println(id);
	}

	/**
	 * ����������ƶ� 
	 */
	@Override
	public void componentMoved(ComponentEvent e) {
		System.out.println("�ƶ���");
	}

	/**
	 * �����������ʾ
	 */
	@Override
	public void componentShown(ComponentEvent e) {
		System.out.println("����ʾ");
	}

	/**
	 * �������������
	 */
	@Override
	public void componentHidden(ComponentEvent e) {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ComponentEventTest();
			}
			
		});
	}
	
	

}
