package com.gs.calculator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorWindowListener extends WindowAdapter {
	
	private CalculatorFrame frame;
	
	public CalculatorWindowListener(CalculatorFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		frame.dispose();
	}

}
