package com.gs.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class FocusEventTest extends Frame implements FocusListener {

	private static final long serialVersionUID = 6363849719758869217L;

	public FocusEventTest() {
		setSize(400, 400);
		setLayout(new FlowLayout());
		TextField txt = new TextField("默认文本");
		txt.addFocusListener(this);
		add(txt);
		add(new TextField("其他"));
		Button btn = new Button("按钮");
		btn.addFocusListener(this);
		add(btn);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				FocusEventTest.this.dispose();
			}
		});
		setVisible(true);
	}
	
	/**
	 * 获得焦点
	 */
	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("获得焦点");
		System.out.println(FocusEvent.FOCUS_FIRST); // 1004
		System.out.println(FocusEvent.FOCUS_GAINED); // 1004
		System.out.println(FocusEvent.FOCUS_LAST); // 1005
		System.out.println(FocusEvent.FOCUS_LOST); // 1005
	}

	/**
	 * 失去焦点
	 */
	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("失去焦点");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new FocusEventTest();
			}
			
		});
	}

}
