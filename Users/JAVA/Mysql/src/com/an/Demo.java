package com.an;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			//��������
			serversocket = new ServerSocket(9999);
			//���տͻ��˷�������Ϣ
			while(true){
			socket = serversocket.accept();
			//��ȡ�ͻ��˴�������Ϣ
			BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String s = read.readLine();
			String[] ss = s.split(" ");
			
			FileInputStream in = new FileInputStream(new File("src/test.html"));
			PrintWriter write = new PrintWriter(socket.getOutputStream());
			write.println("HTTP/1.1 200 OK");
			write.println("Content-Type:test/html");
			//byte[] b = new byte[in.available()];
            //��ȡ�ļ����ݵ�buf1���鵱�С�
            //in.read(b);
			
			write.println();
			write.flush();
			write.close();	
			socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
