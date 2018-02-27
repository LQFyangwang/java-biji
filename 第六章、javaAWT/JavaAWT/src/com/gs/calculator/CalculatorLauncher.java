package com.gs.calculator;

import javax.swing.SwingUtilities;

public class CalculatorLauncher {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new CalculatorFrame();
			}
			
		});
	}

}
