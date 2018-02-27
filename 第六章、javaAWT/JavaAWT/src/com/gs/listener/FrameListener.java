package com.gs.listener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;				
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter {

	private Frame frame;

	public FrameListener() {
	}

	public FrameListener(Frame frame) {
		this.frame = frame;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		frame.dispose();
	}

}
