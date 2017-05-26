package com.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * 登陆比较
 * */
public class Main extends JFrame{
	public Main(){
		this.setLayout(null);
		this.setTitle("QQ登陆");
		JLabel jLabel = new JLabel();
		jLabel.setText("QQ");//要实现的内容
		jLabel.setFont(new java.awt.Font("Dialog",1,15));
		
		jLabel.setBounds(10,5,30,30);//设置控件的位置
		this.add(jLabel);//将其放到窗口中
		
		JLabel jlabel = new JLabel();
		jlabel.setText("账号");//要实现的内容
		jlabel.setBounds(25, 40, 150, 20);//设置控件的位置
		this.add(jlabel);//将其放到窗口中
		//文本框
		JTextArea jTextArea = new JTextArea();//定义控件
		jTextArea.setBounds(65, 40, 150, 20);//设置控件的位置
		this.add(jTextArea);//将其放到窗口中
		
		JLabel label = new JLabel();
		label.setText("密码");//要实现的内容
		label.setBounds(25, 70, 150, 20);//设置控件的位置
		this.add(label);//将其放到窗口中
		//密码框
		JPasswordField jPasswordField = new JPasswordField (); 
		jPasswordField.setBounds(65, 70, 150, 20);
		jPasswordField.setEchoChar('*');
		this.add(jPasswordField);

		JButton jButton = new JButton();//定义控件
		jButton.setText("登录");//设置实现
		jButton.setBounds(65, 100, 150, 20);//设置控件的位置
		this.add(jButton);//将其放到窗口中
		
		JTextArea jTextArea2 = new JTextArea();//定义控件
		jTextArea2.setText("");
		jTextArea2.setVisible(false);
		jTextArea2.setOpaque(false);
		jTextArea2.setBounds(65, 130, 200, 20);//设置控件的位置
		this.add(jTextArea2);//将其放到窗口中
		
		this.setBounds(300,200,300,200);//定义窗口大小
		this.setVisible(true);//定义窗口是否可见
		
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = jTextArea.getText();
				String b = jPasswordField.getText();
				if(a.equals("717560182") && b.equals("123")){
					jTextArea2.setVisible(true);
					jTextArea2.setText("登陆成功");
				}else if(!a.equals("717560182") && b.equals("123")){
					jTextArea2.setVisible(true);
					jTextArea2.setText("登录失败,账号有误");
				}else if(a.equals("717560182") && !b.equals("123")){
					jTextArea2.setVisible(true);
					jTextArea2.setText("登录失败,密码有误");
				}else{
					jTextArea2.setVisible(true);
					jTextArea2.setText("登录失败,请检查账号与密码是否有误");
				}
			}
		});
	}
	public static void main(String[] args) {
		new Main();
	}
}
