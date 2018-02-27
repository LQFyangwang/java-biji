package com.gs.launch;

import javax.swing.SwingUtilities;

import com.gs.frame.SokobanFrame;

public class SokobanLauncher {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new SokobanFrame();
			}
			
		});
	}

}
