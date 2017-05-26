package com.sub;

import java.io.*;
import java.net.*;
public class Client { 
	public static void main(String[] args){
		Socket t = null;
		try {
			System.out.println("正在连接服务器");
			t = new Socket("192.168.199.231",9977);  
			//客户端输出流
			System.out.println("正在向服务器发送数据");
			PrintWriter w = new PrintWriter(t.getOutputStream());
			String s = "我是高维安";
			w.write(s+"\n");
			w.flush();
			//t.shutdownOutput();
			//客户端输入流
			System.out.println("接收服务器返回信息");
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(t.getInputStream()));
			String ss = bf.readLine();
			System.out.println("服务器:" + ss); 
			w.close();
			bf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(t != null){
				try {
					t.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

