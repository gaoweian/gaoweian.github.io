package com.qw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[]) {
		ServerSocket s = null;
		Socket t = null;
		try{
			//创建服务端，并开通注册端口
			System.out.println("创建成功，正在等待客户端连接");
			s = new ServerSocket(9977);  
			//监听对应端口 阻塞
			System.out.println("等待客户端发送数据");
			t = s.accept();
			while(true){
				System.out.println("正在接收客户端发送数据");
				
				//服务端输入流
				ObjectInputStream in = new ObjectInputStream(t.getInputStream()); 
				Student ss = (Student)in.readObject();
				
				System.out.println(ss);
				//服务端输出流
				ObjectOutputStream out = new ObjectOutputStream(t.getOutputStream());
				out.writeObject(ss);
				out.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
