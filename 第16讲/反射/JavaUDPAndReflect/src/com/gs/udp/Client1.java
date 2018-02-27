package com.gs.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client1 {
	
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			byte[] bytes = "ÄãºÃ".getBytes("utf-8");
			InetAddress server = InetAddress.getByName("localhost");
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length, server, 8898);
			socket.send(packet);
			byte[] data = new byte[1024];
			DatagramPacket revPack = new DatagramPacket(data, data.length);
			socket.receive(revPack);
			System.out.println(new String(data, "utf-8"));
			socket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
