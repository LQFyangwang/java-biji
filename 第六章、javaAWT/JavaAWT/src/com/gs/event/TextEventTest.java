package com.gs.event;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class TextEventTest extends Frame implements TextListener {

	private static final long serialVersionUID = -4357507529572395198L;
	
	private TextField txt;
	private String orinigalStr;
	private String newStr;
	
	public TextEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		txt = new TextField(20);
		txt.addTextListener(this);
		add(txt);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				TextEventTest.this.dispose();
			}
		});
		setVisible(true);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		System.out.println("text changed...");
		System.out.println(e.paramString());
		newStr = txt.getText();
		orinigalStr = newStr.substring(0, newStr.length() - 1);
		System.out.println("改变前的值：" + orinigalStr);
		System.out.println("改变后的值： " + newStr);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new TextEventTest();
			}
			
		});
	}

}
