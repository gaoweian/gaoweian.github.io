package com.sub;

import java.io.*;
import java.net.*;
public class Client { 
	public static void main(String[] args){
		Socket t = null;
		try {
			System.out.println("�������ӷ�����");
			t = new Socket("192.168.199.231",9977);  
			//�ͻ��������
			System.out.println("�������������������");
			PrintWriter w = new PrintWriter(t.getOutputStream());
			String s = "���Ǹ�ά��";
			w.write(s+"\n");
			w.flush();
			//t.shutdownOutput();
			//�ͻ���������
			System.out.println("���շ�����������Ϣ");
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(t.getInputStream()));
			String ss = bf.readLine();
			System.out.println("������:" + ss); 
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

