package com.qw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

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
			while(true){
				System.out.println("���ڽ��տͻ��˷�������");
				
				//�����������
				ObjectInputStream in = new ObjectInputStream(t.getInputStream()); 
				Student ss = (Student)in.readObject();
				
				System.out.println(ss);
				//����������
				ObjectOutputStream out = new ObjectOutputStream(t.getOutputStream());
				out.writeObject(ss);
				out.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
