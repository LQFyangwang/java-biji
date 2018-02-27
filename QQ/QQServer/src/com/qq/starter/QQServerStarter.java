package com.qq.starter;

import com.qq.server.QQServer;

public class QQServerStarter {
	
	public static void main(String[] args) {
		new QQServer().connect();
	}

}
