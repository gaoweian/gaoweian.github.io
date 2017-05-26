package com.GUI;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class ServerRunnable implements Runnable{
	Socket t =null;
	List<Socket> li = null;
	Map<String,Socket> map = null;
	public ServerRunnable(Socket t,List<Socket> li,Map<String, Socket> map){
		this.t = t;
		this.li = li;
		this.map = map;
	}
	public void run(){
		while(true){
			try{
				//�����������
				System.out.println("���ڽ��տͻ��˷�������");
				BufferedReader bf = new BufferedReader(new InputStreamReader(t.getInputStream()));
				String ss = null;
				ss = bf.readLine() ;
				Set<String> keys = map.keySet();
				String name = "";
				for(String s:keys){
					Socket so = map.get(s);
					if(t==so){
						name = s;
					}
				}
				System.out.println("������:����");
				System.out.println("�ͻ���:����"+name);
				String cc = new String(t.getInetAddress().getHostAddress());
				System.out.println("��ַ�ǣ�"+cc); 
				//����������
				System.out.println("���ڿͻ��˷�������");
				String sss = name+":"+ss;
				for(Socket l:li ){
					PrintWriter w = new PrintWriter(l.getOutputStream());
					w.write(sss+"\n");
					w.flush();
				}		
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
