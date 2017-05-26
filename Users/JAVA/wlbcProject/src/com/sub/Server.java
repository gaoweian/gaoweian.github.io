package com.sub;

import java.net.*;
import java.io.*;

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
			//服务端输入流
			System.out.println("正在接收客户端发送数据");
			BufferedReader bf = new BufferedReader(new InputStreamReader(t.getInputStream()));
			String ss = bf.readLine(); 
			System.out.println("服务器:你是");
			System.out.println("客户端:"+ss);//.toString()
			String cc = new String(t.getInetAddress().getHostAddress());
			System.out.println("地址是："+cc); 
			//服务端输出流
			System.out.println("正在向服务器发送数据");
			PrintWriter w = new PrintWriter(t.getOutputStream());
			String sss= "已接收消息"+ss;
			w.write(sss+"\n");
			w.flush();
			bf.close();
			w.close();         
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("接收结束");
			if(t != null){
				try {
					t.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("关闭连接");
			if(s != null){
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}    
}   