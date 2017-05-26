package com.GUI2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class FwqRunnable implements Runnable{
	Socket s = null;
	List<Socket> list;
	public FwqRunnable(Socket s,List<Socket> list){
		this.s = s;
		this.list = list;
	}
	public void run() {
		while(true){
			try{
				//服务器读入
				ObjectInputStream inputStream = new ObjectInputStream(s.getInputStream());
				Object xiaoxi = null;
				xiaoxi = inputStream.readObject();
				
				
				//服务器输出
				for(Socket s1:list){
					ObjectOutputStream objectInputStream = new ObjectOutputStream(s1.getOutputStream());
					objectInputStream.writeObject(xiaoxi);
					objectInputStream.flush();
				}
			}catch(Exception e){
				
			}
		}
	
	}

}
