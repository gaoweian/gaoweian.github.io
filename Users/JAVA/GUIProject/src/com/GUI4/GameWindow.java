package com.GUI4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameWindow extends JFrame{
	JButton jButton1 = null;//��ʼ��ť
	JButton jButton2 = null;//���¿�ʼ��ť
	JButton jButton3 = null;//���尴ť
	static TiShi tiShi = null;//��ʾ��Ϣ��
	static QiPan qiPan = null;//����
	static boolean color;//������ɫ
	static boolean b;//����ÿ���ͻ���ֻ����һ�����ӣ�����ȴ������ͻ����������ӣ������ٴ�����
	public GameWindow(){
	}
	public GameWindow(boolean color2){
		this.color = color2;
		this.b = color2;
		JOptionPane.showMessageDialog(null, "����������ɫΪ��"+(color?"��ɫ":"��ɫ"), "�� 99ʾ",1);
		this.setLayout(null);
		/**
		 * ��ʼ
		 */
		jButton1 = new JButton("��ʼ��Ϸ");
		jButton1.setBounds(10, 10, 90, 30);
		this.add(jButton1);
		/**
		 * ��ʼ
		 */
		ActionListener al1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean b = qiPan.startAndEnd(tiShi);
				String label = "";
				if(b){
					label = "��ʼ��Ϸ";
					color = true;
				}else{
					label = "����";
				}
				jButton1.setText(label);
			}
		};
		jButton1.addActionListener(al1);
		/**
		 * ���¿�ʼ
		 */
		jButton2 = new JButton("���¿�ʼ");
		jButton2.setBounds(110, 10, 90, 30);
		this.add(jButton2);
		/**
		 * ���¿�ʼ
		 */
		ActionListener al2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qiPan.resume(tiShi);
				jButton1.setText("����");
			}
		};
		jButton2.addActionListener(al2);
		
		/**
		 * ����
		 */
		jButton3 = new JButton("����");
		jButton3.setBounds(210, 10, 90, 30);
		this.add(jButton3);
		/**
		 * ����
		 */
		ActionListener al3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(qiPan.takeBack()){
					color = true;
				}else{
					color = !color;
				}
			}
		};
		jButton3.addActionListener(al3);
		
		/**
		 * ������ʾ��Ϣ
		 */
		tiShi = new TiShi();
		tiShi.setBounds(310, 0, 540, 50);
		this.add(tiShi);
		
		/**
		 * ��������
		 */
		qiPan = new QiPan();
		qiPan.setBounds(10, 50, 840, 840);
		/**
		 * �������ִ��
		 */
		qiPan.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				if(!b){
					return;
				}
				boolean b1 = qiPan.chuangJian(e, color);
//				if(b1){
//					return;
//				}
//				color = !color;
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		this.add(qiPan);
		this.setBounds(0, 0, 880, 950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {

	}

}
