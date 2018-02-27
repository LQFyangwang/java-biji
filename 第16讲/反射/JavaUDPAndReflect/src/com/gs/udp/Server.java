package com.gs.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
	
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(8898);
			byte[] bytes = new byte[1024];
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length); // ��ȡ�������ݷ������涨���bytes���飨��һ��������
			socket.receive(packet);
			System.out.println(new String(bytes, "utf-8"));
			byte[] data = "���".getBytes("utf-8");
			InetAddress server = InetAddress.getByName("127.0.0.1");
			DatagramPacket sendPacket = new DatagramPacket(data, data.length, server, 8888);
			socket.send(sendPacket);
			socket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
