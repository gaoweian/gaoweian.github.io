package com.abc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//�����
public class ServerDemo {

	public static void main(String[] args) {
		try {
			//��������ˣ�����ͨע��˿�
			ServerSocket serversocket = new ServerSocket(8988);
			while(true){
				System.out.println("�������˴����ɹ�");
				//������Ӧ�˿� ����
				Socket socket = serversocket.accept();
				System.out.println("���ڼ����˿�");
				InputStream in = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int len = 0;
				StringBuffer sb = new StringBuffer();
				while((len = in.read(bytes))!=-1){
					sb.append(new String(bytes,0,len));
				}
				System.out.println("������:����");
				System.out.println("�ͻ���:"+sb.toString());
				in.close();
				String cc = new String(socket.getInetAddress().getHostAddress());
				System.out.println("��ַ�ǣ�"+cc);
				//����������
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

