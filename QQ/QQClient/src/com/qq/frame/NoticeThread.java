package com.qq.frame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class NoticeThread implements Runnable {
	
	private JLabel noticeLbl;
	private boolean change = true;
	
	public JLabel getNoticeLbl() {
		return noticeLbl;
	}

	public void setNoticeLbl(JLabel noticeLbl) {
		this.noticeLbl = noticeLbl;
	}

	public boolean isChange() {
		return change;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	@Override
	public void run() {
		while (change) {
			try {
				noticeLbl.setIcon(new ImageIcon("src/images/dont.png"));
				Thread.sleep(1 * 1000);
				noticeLbl.setIcon(new ImageIcon("src/images/busy.png"));
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
