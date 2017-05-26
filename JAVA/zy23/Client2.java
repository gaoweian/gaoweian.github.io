import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client2 { 
	public static void main(String[] args){
		Socket t = null;
		try {
			System.out.println("正在连接服务器");
			t = new Socket("127.0.0.1",9923); 

			PrintWriter printWriter = new PrintWriter(t.getOutputStream());
			printWriter.write("高维安\n");
			printWriter.flush();

			//收
			new Thread(new InRunnable(t)).start();
			//发
			new Thread(new OutRunnable(t)).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


