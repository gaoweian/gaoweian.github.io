package com.gao;


import java.io.*;


public class Demo {
	
	public static void main(String[] args) {
		File file = new File("F:/JAVA/text.txt");//�ļ�
		if(!file.exists()){//�ж�
			try {	
				file.createNewFile();//���û�д���
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int a=(int)file.length();
		new Thread(new Xc(0,a*1/3,file)).start();//��һ�ζ�ȡ
		new Thread(new Xc(a*1/3,a*1/3,file)).start();//�ڶ��ζ�ȡ
		new Thread(new Xc(a*2/3,a,file)).start();//�����ζ�ȡ
	}
}

