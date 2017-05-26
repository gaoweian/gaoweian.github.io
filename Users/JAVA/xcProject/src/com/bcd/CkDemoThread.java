package com.bcd;

public class CkDemoThread extends Thread{
	CkDemo ck;
	public CkDemoThread(CkDemo ck){
		this.ck=ck;
	}
	public void run(){	
		ck.show();
	}
}
