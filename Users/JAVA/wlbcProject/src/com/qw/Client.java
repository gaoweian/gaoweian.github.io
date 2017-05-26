package com.qw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Client extends JFrame{
	public Client(Socket t){
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
							//客户端输出流
							System.out.println("正在向服务器发送数据");
							OutputStream o = t.getOutputStream();
							ObjectOutputStream out = new ObjectOutputStream(o);
							out.writeObject(new Student("李四",s));
							out.flush();
							
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					jTextField.setText("");
				}
		});
		this.add(jButton);	
		new Thread(new InRunnable(t, jTextArea)).start();
		this.setBounds(200,200,500,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);
	}
	public static void main(String[] args){
		Socket t = null;
		try {
			System.out.println("正在连接服务器");
			t = new Socket("127.0.0.1",9977); 
			new Client(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
