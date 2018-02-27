package com.gs.panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.SwingUtilities;

import com.gs.listener.FrameListener;

public class LoginFrame extends Frame {

	private static final long serialVersionUID = 9204133502919552718L;
	
	public LoginFrame() {
		setSize(400, 400);
		setTitle("登录");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		initTop();
		initBottom();
		addWindowListener(new FrameListener(this));
		setVisible(true);
	}
	
	private void initTop() {
		Panel panel = new Panel();
		panel.setPreferredSize(new Dimension(400, 150));
		panel.setBackground(Color.GREEN);
		add(panel);
	}
	
	private void initBottom() {
		Panel panel = new Panel();
		panel.setPreferredSize(new Dimension(400, 150));
		panel.setBackground(Color.RED);
		panel.setLayout(new GridLayout(1, 3));
		
		bottomLeft(panel);
		bottomCenter(panel);
		bottomRight(panel);
		add(panel);
	}
	
	private void bottomLeft(Panel panel) {
		Label imgLbl = new Label();
		imgLbl.setPreferredSize(new Dimension(50, 50));
		imgLbl.setBackground(Color.ORANGE);
		panel.add(imgLbl);
	}
	
	private void bottomCenter(Panel panel) {
		Panel loginPanel = new Panel();
		loginPanel.setLayout(new FlowLayout());
		TextField accTxt = new TextField(20); // 20指定文本输入框的列数 
		loginPanel.add(accTxt);
		TextField pwdTxt = new TextField(20);
		loginPanel.add(pwdTxt);
		Button loginBtn = new Button("登录");
		loginBtn.setPreferredSize(new Dimension(100, 20));
		loginBtn.setBackground(Color.BLUE);
		loginPanel.add(loginBtn);
		panel.add(loginPanel);
	}
	
	private void bottomRight(Panel panel) {
		Label imgLbl = new Label();
		imgLbl.setPreferredSize(new Dimension(50, 50));
		imgLbl.setBackground(Color.ORANGE);
		panel.add(imgLbl);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new LoginFrame();
			}
			
		});
	}

}
