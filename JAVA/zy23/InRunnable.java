import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class InRunnable implements Runnable{
	Socket t =null;
	public InRunnable(Socket t){
		this.t = t;
	}
	public void run() {
		while(true){
			try{
				BufferedReader bf = new BufferedReader(new InputStreamReader(t.getInputStream()));
				String ss = bf.readLine();
				System.out.println(ss); 
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
