package com.GUI;

import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client2 extends JFrame{ 
	public Client2(Socket t){
		this.setLayout(null);
		this.setTitle("客户端");
		
		JTextArea jTextArea = new JTextArea();
		jTextArea.setBounds(30,20,420,300);
		this.add(jTextArea);
		
		JTextField jTextField = new JTextField();
		jTextField.setBounds(30,340,330,30);
		this.add(jTextField);
		
		JButton jButton = new JButton();
		jButton.setText("发送");
		jButton.setBounds(380,340,70,30);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = jTextField.getText();
				if(!"".equals(s)){
					try {
						PrintWriter printWriter = new PrintWriter(t.getOutputStream());
						printWriter.write(s+"\n");
						printWriter.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				jTextField.setText("");
			}
		});
		this.add(jButton);	
		new Thread(new ClientRunnable(t, jTextArea)).start();
		
		this.setBounds(200,200,500,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);
	}
	public static void main(String[] args){
		Socket t = null;
		try {
			System.out.println("正在连接服务器");
			t = new Socket("127.0.0.1",9999 ); 
			PrintWriter printWriter = new PrintWriter(t.getOutputStream());
			printWriter.write("高维安\n");
			printWriter.flush();
			new Client2(t);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	

	}
}


