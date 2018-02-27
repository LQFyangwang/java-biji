package com.gs.awt.login;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginFrameListener extends WindowAdapter {
	
	private Frame frame;
	
	public LoginFrameListener() {
	}
	
	public LoginFrameListener(Frame frame) {
		this.frame = frame;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		frame.dispose();
	}
	

}
