package com.dazhi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Properties;
import java.util.Scanner;

public class Demo2 {
	static File file = new File("F:/Text.txt");
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		if(!file.exists()){
			try {	
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	//用户输入的内容
		String userInput="";
		System.out.println("请输入内容:");
		userInput=sc.nextLine()+System.getProperty("line.separator");
		RandomAccessFile randomaccessfile=null;
		try {
			randomaccessfile = new RandomAccessFile(file,"rw");
			randomaccessfile.seek(file.length());
			randomaccessfile.write(userInput.getBytes());
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally{
			if(randomaccessfile!=null){
				try {
					randomaccessfile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
		Properties p = new Properties();
		try{
		p.load(new FileInputStream("F:/Test.txt"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
