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
			//建立连接
			serversocket = new ServerSocket(9999);
			//接收客户端发来的消息
			while(true){
			socket = serversocket.accept();
			//读取客户端传来的消息
			BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String s = read.readLine();
			String[] ss = s.split(" ");
			
			FileInputStream in = new FileInputStream(new File("src/test.html"));
			PrintWriter write = new PrintWriter(socket.getOutputStream());
			write.println("HTTP/1.1 200 OK");
			write.println("Content-Type:test/html");
			//byte[] b = new byte[in.available()];
            //读取文件内容到buf1数组当中。
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
