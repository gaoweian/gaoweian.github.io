package com.bcd;

public class Demo {
	
	public static void main(String[] args) {
		 int p=50;
		/**
		 * ������������
		 * */
		CkDemo ck1 = new CkDemo(p,"����һ");
		CkDemo ck2 = new CkDemo(p,"���ڶ�");
		CkDemo ck3 = new CkDemo(p,"������");
		/**
		 * ʵ����������
		 * */
		CkDemoThread c1 = new CkDemoThread(ck1);
		CkDemoThread c2 = new CkDemoThread(ck2);
		CkDemoThread c3 = new CkDemoThread(ck3);
		/**
		 * �����������
		 * */
		c1.start();
		c2.start();
		c3.start();
	}
}
