package com.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.xml.stream.events.StartDocument;

/**
 * 红绿灯
 * */
public class Main4 extends JFrame{
	public Main4(){
		this.setLayout(null);
		
		JTextArea jTextArea = new JTextArea();//定义控件
		jTextArea.setText("红灯，禁止通行");
		jTextArea.setBackground(Color.red);
		jTextArea.setOpaque(true);
		jTextArea.setBounds(65, 40, 150, 20);//设置控件的位置
		this.add(jTextArea);//将其放到窗口中
		
		JButton jButton = new JButton();//定义控件
		jButton.setText("开始");//设置实现
		jButton.setBounds(65, 100, 150, 20);//设置控件的位置
		this.add(jButton);//将其放到窗口中
		
		this.setBounds(300,200,300,200);//定义窗口大小
		this.setVisible(true);//定义窗口是否可见
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i = jTextArea.getText();
				new Thread(new Runnable() {
					public void run() {
						while(true){
							try {
								Thread.sleep(3000);
								jTextArea.setText("绿灯，可以通行");
								jTextArea.setBackground(Color.green);
								Thread.sleep(5000);
								jTextArea.setText("黄灯，等待通行");
								jTextArea.setBackground(Color.yellow);
								Thread.sleep(2000);
								jTextArea.setText("红灯，禁止通行");
								jTextArea.setBackground(Color.red);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
					
				}).start();
			}
		});
	}
	public static void main(String[] args) {
		new Main4();
	}

}
