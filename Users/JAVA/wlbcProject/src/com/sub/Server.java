package com.sub;

import java.net.*;
import java.io.*;

public class Server {        
   public static void main(String args[]) {
	   ServerSocket s = null;
	   Socket t = null;
	 
	   try{
		   
			//��������ˣ�����ͨע��˿�
			System.out.println("�����ɹ������ڵȴ��ͻ�������");
			s = new ServerSocket(9977);  
			//������Ӧ�˿� ����
			System.out.println("�ȴ��ͻ��˷�������");
			t = s.accept();
			//�����������
			System.out.println("���ڽ��տͻ��˷�������");
			BufferedReader bf = new BufferedReader(new InputStreamReader(t.getInputStream()));
			String ss = bf.readLine(); 
			System.out.println("������:����");
			System.out.println("�ͻ���:"+ss);//.toString()
			String cc = new String(t.getInetAddress().getHostAddress());
			System.out.println("��ַ�ǣ�"+cc); 
			//����������
			System.out.println("�������������������");
			PrintWriter w = new PrintWriter(t.getOutputStream());
			String sss= "�ѽ�����Ϣ"+ss;
			w.write(sss+"\n");
			w.flush();
			bf.close();
			w.close();         
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("���ս���");
			if(t != null){
				try {
					t.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�ر�����");
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