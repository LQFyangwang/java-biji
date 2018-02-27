package com.gs.awt.layout;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.SwingUtilities;

import com.gs.listener.FrameListener;

public class FlowLayoutTest extends Frame {

	private static final long serialVersionUID = 1083882883055884214L;

	public FlowLayoutTest() {
		setSize(600, 600);
		setTitle("����");
		setLocationRelativeTo(null);
		FrameListener ltn = new FrameListener(this);
		addWindowListener(ltn);
		setLayout(new FlowLayout());
		initWidgets();
		setVisible(true);
	}
	
	private void initWidgets() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Button btn = new Button();
				// btn.setSize(60, 60); 
				// ����ʹ���˲��ֹ������Ĵ��ڣ�������õ�size��������
				btn.setPreferredSize(new Dimension(60, 60));
				// ���setSize�������ã���ʹ��setPreferredSize����
				add(btn);
			}
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new FlowLayoutTest();
			}
			
		});
	}
	
}
