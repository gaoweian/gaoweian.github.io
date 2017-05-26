package com.qw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JTextArea;

public class InRunnable implements Runnable{
	Socket t =null;
	JTextArea jTextArea;
	public InRunnable(Socket t,JTextArea jTextArea){
		this.t = t;
		this.jTextArea = jTextArea;
	}
	public void run() {
		while(true){
			try{
				System.out.println("正在接收服务器返回信息");
				ObjectInputStream in = new ObjectInputStream(t.getInputStream()); 
				Student ss = (Student)in.readObject();
				System.out.println(ss);
				jTextArea.setText(jTextArea.getText()+"\n"+ss); 
			}catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
}
