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
		this.setTitle("五子棋 ");
		
		TestPaint test = new TestPaint();
		test.setBounds(20,10,660,660);
		this.add(test);
		
		JButton jButton = new JButton();
		jButton.setText("重新开始");
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
		
		JButton jButton2 = new JButton("悔棋");	
		jButton2.setBounds(670,100,90,30);
		jButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(test.kk==true){ //只能悔棋一次,当再次点击鼠标时可以悔棋
					if(test.tt==true){	//当没有胜方时,可以悔棋;有胜方时,不可以悔棋
						test.kk=false;//只能悔一次棋
						int a = test.qzlist.size();//返回集合列表中的元素数
						test.qzlist.remove(a-1);//移除集合中指定位置的元素(元素从0开始)
						//悔棋的棋子是黑子时,让下一次绘制的是黑子
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
		jButton3.setText("退出");
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
