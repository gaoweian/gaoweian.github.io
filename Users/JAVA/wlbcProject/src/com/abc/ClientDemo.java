package com.abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
//客户端
public class ClientDemo {

	public static void main(String[] args) {
		Socket socket = null;
			try {
				socket = new Socket("192.168.199.215",8988);
				System.out.println("是否连接成功"+socket.isConnected());
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
			
		File file = new File("client.txt");
		//输入
		try {
			InputStream in = new FileInputStream(file);
			byte[] b = new byte[1024];
			int len = 0;
			int temp = 0;
			StringBuffer sb = new StringBuffer();
			while((temp=in.read(b))!=-1){
				b[len]=(byte)temp;
				len++;
			}
			in.close();
			
		//输出
			OutputStream out = socket.getOutputStream();
			out.write(b);
			out.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
