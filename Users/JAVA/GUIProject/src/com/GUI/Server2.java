package com.GUI;

import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;

public class Server2 {        
   public static void main(String args[]) {
	   ServerSocket s = null;
	   Socket t = null;
	   List<Socket> list = new ArrayList<Socket>();
	   Map<String,Socket> map = new HashMap<String,Socket>();
	   try{
		   //��������ˣ�����ͨע��˿�
			System.out.println("�����ɹ������ڵȴ��ͻ�������");
			s = new ServerSocket(9999);  
			//������Ӧ�˿� ����
			while(true){
				System.out.println("�ȴ��ͻ��˷�������");
				t = s.accept();
				BufferedReader bf = new BufferedReader(new InputStreamReader(t.getInputStream()));
				String name = bf.readLine();
				map.put(name,t);
				list.add(t);
				new Thread(new ServerRunnable(t,list,map)).start();	
			}       
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}    
}   
