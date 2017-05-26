package com.java;
import java.io.* ;
import java.util.*;
public class IoDemo {
	public static void main(String[] args) {
		File f = new File("F:/abx.txt");
		
		//Scanner sc = new Scanner(System.in);
		//String in = sc.next();
		while(true){
			try{
				f.createNewFile();
				FileWriter w = new FileWriter(f,true);
				Scanner sc = new Scanner(System.in);
				String c = sc.next();
				w.write(c,0,c.length());
				w.close();
				 FileReader fi = new FileReader(f);
				char [] b = new char[10];
				fi.read(b);
				int len=0;
				while((len = fi.read(b))!=-1){
					String cc=(new String(b,0,len));
					System.out.println(cc);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
