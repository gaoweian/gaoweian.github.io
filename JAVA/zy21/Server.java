import java.net.*;
import java.io.*;

public class Server {        
   public static void main(String args[]) {
	   ServerSocket s = null;
	   Socket t = null;
	   InputStream i = null;
	   OutputStream w = null;
	   try{
		   
			//��������ˣ�����ͨע��˿�
			System.out.println("�����ɹ������ڵȴ��ͻ�������");
			s = new ServerSocket(9989);  
			//������Ӧ�˿� ����
			System.out.println("�ȴ��ͻ��˷�������");
			t = s.accept();
			//�����������
			System.out.println("���ڽ��տͻ��˷�������");
			i =  t.getInputStream();	
			byte[] b = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = i.read(b))!=-1){
				sb.append(new String(b,0,len));
			}
			System.out.println("������:����");
			System.out.println("�ͻ���:"+sb);//.toString()
			String cc = new String(t.getInetAddress().getHostAddress());
			System.out.println("��ַ�ǣ�"+cc); 
			//����������
			System.out.println("��ͻ��˷�����Ϣ");
			w = t.getOutputStream(); 
			String ss = "�ѽ�����Ϣ"+sb;
			w.write(ss.getBytes());
			w.flush();
			//w.close();        
			//t .close(); 
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
