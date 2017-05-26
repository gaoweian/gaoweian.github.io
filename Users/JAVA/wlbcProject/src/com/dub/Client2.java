package com.dub;

import java.io.*;
import java.net.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Client2 extends JFrame{ 

	public static void main(String[] args){
		new Client2();
		Socket t = null;
		try {
			System.out.println("正在连接服务器");
			t = new Socket("192.168.199.231",9923 ); 
			PrintWriter printWriter = new PrintWriter(t.getOutputStream());
			printWriter.write("高维安\n");
			printWriter.flush();
			//发
			new Thread(new OutRunnable(t)).start();
			//收
			new Thread(new InRunnable(t)).start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


