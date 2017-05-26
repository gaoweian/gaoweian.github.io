package com.bcd;

public class Demo {
	
	public static void main(String[] args) {
		 int p=50;
		/**
		 * 创建三个窗口
		 * */
		CkDemo ck1 = new CkDemo(p,"窗口一");
		CkDemo ck2 = new CkDemo(p,"窗口二");
		CkDemo ck3 = new CkDemo(p,"窗口三");
		/**
		 * 实现三个窗口
		 * */
		CkDemoThread c1 = new CkDemoThread(ck1);
		CkDemoThread c2 = new CkDemoThread(ck2);
		CkDemoThread c3 = new CkDemoThread(ck3);
		/**
		 * 输出三个窗口
		 * */
		c1.start();
		c2.start();
		c3.start();
	}
}
