//package com.dazhi;

import java.io.*;
import java.net.Socket;

public class Demo {
	public static void main(String[] args){
		try {
			Socket socket = new Socket("192.168.199.231",1237);
			OutputStream o = socket.getOutputStream();
			o.write("���Ǹ�ά��".getBytes());
			o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
