package com.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.xml.stream.events.StartDocument;

/**
 * ���̵�
 * */
public class Main4 extends JFrame{
	public Main4(){
		this.setLayout(null);
		
		JTextArea jTextArea = new JTextArea();//����ؼ�
		jTextArea.setText("��ƣ���ֹͨ��");
		jTextArea.setBackground(Color.red);
		jTextArea.setOpaque(true);
		jTextArea.setBounds(65, 40, 150, 20);//���ÿؼ���λ��
		this.add(jTextArea);//����ŵ�������
		
		JButton jButton = new JButton();//����ؼ�
		jButton.setText("��ʼ");//����ʵ��
		jButton.setBounds(65, 100, 150, 20);//���ÿؼ���λ��
		this.add(jButton);//����ŵ�������
		
		this.setBounds(300,200,300,200);//���崰�ڴ�С
		this.setVisible(true);//���崰���Ƿ�ɼ�
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i = jTextArea.getText();
				new Thread(new Runnable() {
					public void run() {
						while(true){
							try {
								Thread.sleep(3000);
								jTextArea.setText("�̵ƣ�����ͨ��");
								jTextArea.setBackground(Color.green);
								Thread.sleep(5000);
								jTextArea.setText("�Ƶƣ��ȴ�ͨ��");
								jTextArea.setBackground(Color.yellow);
								Thread.sleep(2000);
								jTextArea.setText("��ƣ���ֹͨ��");
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
