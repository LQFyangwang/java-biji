package com.qq.frame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LoginFrameBackThread implements Runnable {

	private JLabel backLbl;
	
	private boolean stopChange = false;
	
	public JLabel getBackLbl() {
		return backLbl;
	}

	public void setBackLbl(JLabel backLbl) {
		this.backLbl = backLbl;
	}

	public boolean isStopChange() {
		return stopChange;
	}

	public void setStopChange(boolean stopChange) {
		this.stopChange = stopChange;
	}

	@Override
	public void run() {
		while (!stopChange) {
			for (int i = 1; i <=3; i++) {
				try {
					Thread.sleep(3 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				backLbl.setIcon(new ImageIcon("src/images/back" + i + ".png"));
				if (i == 3) {
					i = 1;
				}
			}
		}
	}

}
