package com.gs.qq;

import javax.swing.SwingUtilities;

public class QQ {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ChatFrame();
			}
			
		});
	}

}
