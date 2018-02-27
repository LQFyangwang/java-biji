package com.gs.awt.login;

import javax.swing.SwingUtilities;

public class LoginFrameTest {
	
	public static void main(String[] args) {
		// new LoginFrame();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LoginFrame();
			}
		});
	}

}
