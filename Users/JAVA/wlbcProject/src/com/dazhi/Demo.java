package com.dazhi;

import java.io.*;
import java.net.Socket;

public class Demo {
	public static void main(String[] args){
		Socket t = null;
		OutputStream w = null;
		InputStream i = null;
		try {
			System.out.println("�������ӷ�����");
			t = new Socket("192.168.199.231",9989);  
			//�ͻ��������
			System.out.println("�������������������");
			w = t.getOutputStream();  
			String s = "���Ǹ�ά��";
			//byte[] v = s.getBytes();
			w.write(s.getBytes());
			w.flush(); 
			t.shutdownOutput();
			//�ͻ���������
			System.out.println("���շ�����������Ϣ");
			i =  t.getInputStream();	
			byte[] b = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = i.read(b))!=-1){
				sb.append(new String(b,0,len));
			}   
			System.out.println("������:" + sb.toString());    
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("�ر������");
			if(w != null){
				try {
					w.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�ر�������");
			if(i != null){
				try {
					i.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�ر�����");
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