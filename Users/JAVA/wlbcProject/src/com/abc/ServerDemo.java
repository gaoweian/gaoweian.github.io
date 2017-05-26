package com.abc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//服务端
public class ServerDemo {

	public static void main(String[] args) {
		try {
			//创建服务端，并开通注册端口
			ServerSocket serversocket = new ServerSocket(8988);
			while(true){
				System.out.println("服务器端创建成功");
				//监听对应端口 阻塞
				Socket socket = serversocket.accept();
				System.out.println("正在监听端口");
				InputStream in = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int len = 0;
				StringBuffer sb = new StringBuffer();
				while((len = in.read(bytes))!=-1){
					sb.append(new String(bytes,0,len));
				}
				System.out.println("服务器:你是");
				System.out.println("客户端:"+sb.toString());
				in.close();
				String cc = new String(socket.getInetAddress().getHostAddress());
				System.out.println("地址是："+cc);
				//服务端输出流
				File file = new File("socket.txt");
				OutputStream out = new FileOutputStream(file,true);
				String ss = sb.toString();
				byte[] g = ss.getBytes();
				for(int i=0;i<g.length;i++){
					out.write(g[i]);
				}
				out.close();
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

