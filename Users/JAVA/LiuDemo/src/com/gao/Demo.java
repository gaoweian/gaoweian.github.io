package com.gao;


import java.io.*;


public class Demo {
	
	public static void main(String[] args) {
		File file = new File("F:/JAVA/text.txt");//文件
		if(!file.exists()){//判断
			try {	
				file.createNewFile();//如果没有创建
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int a=(int)file.length();
		new Thread(new Xc(0,a*1/3,file)).start();//第一次读取
		new Thread(new Xc(a*1/3,a*1/3,file)).start();//第二次读取
		new Thread(new Xc(a*2/3,a,file)).start();//第三次读取
	}
}

