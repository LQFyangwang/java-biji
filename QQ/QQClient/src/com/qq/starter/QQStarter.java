package com.qq.starter;

import javax.swing.SwingUtilities;

import com.qq.frame.LoginFrame;

public class QQStarter {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new LoginFrame();
			}
			
		});
	}
}
