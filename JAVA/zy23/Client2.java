import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client2 { 
	public static void main(String[] args){
		Socket t = null;
		try {
			System.out.println("�������ӷ�����");
			t = new Socket("127.0.0.1",9923); 

			PrintWriter printWriter = new PrintWriter(t.getOutputStream());
			printWriter.write("��ά��\n");
			printWriter.flush();

			//��
			new Thread(new InRunnable(t)).start();
			//��
			new Thread(new OutRunnable(t)).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


