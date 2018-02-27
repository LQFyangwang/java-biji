package com.gs.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FirstFrame1 extends Frame {

	private static final long serialVersionUID = -7190221901009802329L; // ���л��汾��

	public FirstFrame1() {
		setSize(400, 200); // ���Զ��崰�����ô�С
		// setLocation(300, 200); // ���ô��ڵ�λ��
		setLocationRelativeTo(null); // ����һ�����λ�ã������ĳ�������һ��λ�ã��������һ��������������
		setTitle("��һ�����ڳ���"); // ���ô��ڵı���
		MyWindowListener ltn = new MyWindowListener(this);
		addWindowListener(ltn); 
		// ����ǰ�����¼�Դ�������һ�����ڼ�������ͨ���������WindowListener�ӿڵ�ʵ�������
		setVisible(true); // ���ô���Ϊ�ɼ���
	}
	
	/**
	 * ��һ������������ʵ�ּ������ӿ�
	 * ����������������Ҫ�Դ��ڽ��в���������Ҫ�Ѵ��ڶ��󴫵ݸ�����
	 *
	 */
	private class MyWindowListener implements WindowListener {
		
		private Frame frame; // ��ǰ��������һ��Frame��Ա����
		
		public MyWindowListener(Frame frame) {
			this.frame = frame;
		}
		
		/**
		 * �����Ѿ����¼�
		 */
		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("�����Ѿ���");
		}

		/**
		 * �������ڹرյ��¼�
		 */
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("window closing");
			frame.dispose();
		}

		/**
		 * �����Ѿ��رյ��¼�
		 */
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("window closed");
		}

		/**
		 * ���ڵ���С���¼�
		 */
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * �ɴ�����С��״̬��Ϊ�ɼ�״̬���¼�
		 */
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * �����ѿɼ�����Ϊ���㴰��
		 */
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * �Ǽ���״̬
		 */
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
		new FirstFrame1();
	}

}
