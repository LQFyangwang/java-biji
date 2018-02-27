package com.gs.component;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class CheckboxAndEventTest extends Frame implements ItemListener {

	private static final long serialVersionUID = 1246714942408413327L;

	public CheckboxAndEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		initCheckbox();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				CheckboxAndEventTest.this.dispose();
			}
		});
		setVisible(true);
	}
	
	private void initCheckbox() {
		Checkbox cb = new Checkbox("One");
		cb.setName("one");
		cb.addItemListener(this);
		Checkbox cb1 = new Checkbox("two");
		cb1.setName("two");
		cb1.addItemListener(this);
		Checkbox cb2 = new Checkbox("three");
		cb2.setName("three");
		cb2.addItemListener(this);
		add(cb);
		add(cb1);
		add(cb2);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		String index = (String) e.getItem(); // 对于Checkbox，getItem返回的是选项的内容，而不是选项的索引
		System.out.println(index);
		if (obj instanceof Checkbox) {
			Checkbox cb = (Checkbox) obj;
			String name = cb.getName();
			if (name.equals("one")) {
				System.out.println("one");
			}
		}
		System.out.println("statge change: " + e.getStateChange()); // 选中状态为1，非选中状态为2
	} 

	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new CheckboxAndEventTest();
			}
			
		});
	}

}
