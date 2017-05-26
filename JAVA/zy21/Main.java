//package com.dazhi;

import java.io.*;
//import java.net.ServerSocket;
import java.net.*;

public class Main {

	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(1237);
			System.out.println("创建服务器端");
			while(true){
				Socket t = s.accept();
				System.out.println("监听");
				InputStream i =  t.getInputStream();	
				 //Reader reader = new InputStreamReader(t.getInputStream()); 
				byte[] b = new byte[1024];
				int len = 0;
				StringBuffer sb = new StringBuffer();
				while((len = i.read(b))!=-1){
					sb.append(new String(b,0,len));
				}
					
				System.out.println("服务器:你是");
				System.out.println("客户端:"+sb.toString());
				String cc = new String(t.getInetAddress().getHostAddress());
				System.out.println("地址是："+cc);
				Writer writer = new OutputStreamWriter(socket.getOutputStream());    
				writer.write("Hello Client.");
				writer.flush();    
				writer.close();
				i.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
