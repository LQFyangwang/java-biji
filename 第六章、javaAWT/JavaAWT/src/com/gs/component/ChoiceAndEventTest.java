package com.gs.component;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class ChoiceAndEventTest extends Frame implements ItemListener {

	private static final long serialVersionUID = -3081528556220346590L;
	
	public ChoiceAndEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		initChoice();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ChoiceAndEventTest.this.dispose();
			}
		});
		setVisible(true);
	}
	
	private void initChoice() {
		Choice choice = new Choice();
		choice.add("item 1");
		choice.add("item 2");
		choice.addItemListener(this);
		add(choice);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("item changed...");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ChoiceAndEventTest();
			}
			
		});
	}

}
