package com.GUI4;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CreateRoom extends JComponent{
	boolean color;
	public CreateRoom(){
		JFrame f1 = new JFrame("���������Ծ�");
		f1.setLayout(null);
		JLabel jLabel = new JLabel("��������Ϸ����ţ�");
		jLabel.setFont(new Font("΢���ź�", 0, 20));
		JTextField field = new JTextField();
		JButton f2button_2 = new JButton("����");
		jLabel.setBounds(60, 20, 200, 30);
		field.setBounds(60, 65, 200, 30);
		f2button_2.setBounds(180,110,80,25);
		f1.add(jLabel);
		f1.add(field);
		f1.add(f2button_2);
		f1.setBounds(0,0,340,230);
		f1.setVisible(true);
		//����
		f2button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//���ӷ�����
				try {
					Main.socket = new Socket("192.168.199.120", 20000);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				//�жϿ�ֵ
				if(field.getText().equals(null)||field.getText().equals("")){
					JOptionPane.showMessageDialog(null, "����Ų���Ϊ�գ�", "��ʾ",0);
					return;
				}
				PrintWriter printWriter;
				try {
					//������ŷ��͸�������
					printWriter = new PrintWriter(Main.socket.getOutputStream());
					printWriter.write(field.getText()+"\n");
					printWriter.flush();
					//������������Ϣ
					int a = 2;
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Main.socket.getInputStream()));
					a = bufferedReader.read();
					//��ʾ��Ϣ
					if(a==2){
						JOptionPane.showMessageDialog(null, "�÷��䲻���ڣ���Ϊ���½�����ʼ��Ϸ�ɣ�", "��ʾ",1);
						color = true;//����
//						zhuangTai = false;
					}else if(a==1){
						JOptionPane.showMessageDialog(null, "�ɹ����뷿�䣬��ʼ��Ϸ�ɣ�", "��ʾ",1);
						color = false;//����
//						zhuangTai = true;
					}else if(a==0){
						JOptionPane.showMessageDialog(null, "�÷��������ˣ����������뷿��ţ�", "��ʾ",0);
						return;
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				//������Ϸ��
				new GameWindow(color);
				new Thread(new Acceptor()).start();
				//�رս��뷿�䴰��
				f1.dispose();
			}
		});
	}
}
