import java.io.*;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class OutRunnable implements Runnable{
	Socket t =null;
	public OutRunnable(Socket t){
		this.t = t;
	}
	public void run() {
		while(true){
			try {
				while(true){
					Scanner sc = new Scanner(System.in);
					try{
						System.out.println("����������:");
						String s = sc.next();
						System.out.println("�û������������"+s);
						PrintWriter printWriter = new PrintWriter(t.getOutputStream());
						printWriter.write(s+"\n");
						printWriter.flush();
					}catch(Exception e){

					}
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
