package com.gs.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * ��һ������������ʵ�ּ������ӿ�
 * ����������������Ҫ�Դ��ڽ��в���������Ҫ�Ѵ��ڶ��󴫵ݸ�����
 *
 */
public class MyWindowListener1 implements WindowListener {
	
	private Frame frame; // ��ǰ��������һ��Frame��Ա����
	
	public MyWindowListener1(Frame frame) {
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