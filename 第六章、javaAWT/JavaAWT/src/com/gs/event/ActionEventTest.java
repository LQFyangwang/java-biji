package com.gs.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class ActionEventTest extends Frame implements ActionListener {

	private static final long serialVersionUID = -7397478920850766916L;
	
	public ActionEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		Button btn = new Button("点击");
		btn.addActionListener(this);
		btn.setActionCommand("dj");
		add(btn);
		Button btn1 = new Button("再点击");
		btn1.addActionListener(this);
		btn1.setActionCommand("zdj");
		add(btn1);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ActionEventTest.this.dispose();
			}
		});
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 如何知道点击的是哪一个按钮
		// 1、通过按钮的Label文本
		Object obj = e.getSource();
		if (obj instanceof Button) {
			Button btn = (Button) obj;
			String lbl = btn.getLabel();
			if (lbl.equals("点击")) {
				System.out.println("点击");
			} else if (lbl.equals("再点击")) {
				System.out.println("再点击");
			}
		}
		// 使用ActionCommand来判断不同的按钮
		String actionCommand = e.getActionCommand();
		if (actionCommand != null) {
			if (actionCommand.equals("dj")) {
				System.out.println("dj");
			} else if (actionCommand.equals("zdj")) {
				System.out.println("zdj");
			}
		}
		System.out.println("button clicked...");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ActionEventTest();
			}
			
		});
	}
	
}
