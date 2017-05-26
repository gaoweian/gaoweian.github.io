package com.GUI2; 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame{
	public Main(){
		this.setLayout(null);
		this.setTitle("������ ");
		
		TestPaint test = new TestPaint();
		test.setBounds(20,10,660,660);
		this.add(test);
		
		JButton jButton = new JButton();
		jButton.setText("���¿�ʼ");
		jButton.setBounds(670,50,90,30);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test.kk=true;
				test.isWinNow=false;
				test.qzlist.clear();
				test.repaint();
			}
		});
		this.add(jButton);
		
		JButton jButton2 = new JButton("����");	
		jButton2.setBounds(670,100,90,30);
		jButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(test.kk==true){ //ֻ�ܻ���һ��,���ٴε�����ʱ���Ի���
					if(test.tt==true){	//��û��ʤ��ʱ,���Ի���;��ʤ��ʱ,�����Ի���
						test.kk=false;//ֻ�ܻ�һ����
						int a = test.qzlist.size();//���ؼ����б��е�Ԫ����
						test.qzlist.remove(a-1);//�Ƴ�������ָ��λ�õ�Ԫ��(Ԫ�ش�0��ʼ)
						//����������Ǻ���ʱ,����һ�λ��Ƶ��Ǻ���
						if(test.isHei==false){
							test.isHei=true;
						}else if(test.isHei==true){
								test.isHei=false;
						}
						test.repaint();
					}
				}
			}
		});
		this.add(jButton2);
		
		JButton jButton3 = new JButton();
		jButton3.setText("�˳�");
		jButton3.setBounds(670,150,90,30);
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.add(jButton3);
		
		this.setBounds(300,20,800,700);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("127.0.0.1",9999);
			new Main();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
