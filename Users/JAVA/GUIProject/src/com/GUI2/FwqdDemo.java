package com.GUI2;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class FwqdDemo {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		List<Socket> list = null;
		try {
			System.out.println("创建服务器");
			ss = new ServerSocket(9999);
			System.out.println("等待连接");
			while(true){
				s = ss.accept();
				ObjectInputStream objectInputStream = new ObjectInputStream(s.getInputStream());
				Object name = objectInputStream.readObject();
				list.add(s);
				new Thread(new FwqRunnable(s,list)).start();;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
