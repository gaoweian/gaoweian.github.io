package com.bcd;

public class CkDemo{
	
	private static Piao piao = new Piao("临沂到济南",50);
	private String name;
	public CkDemo(int number,String name){
		this.name=name;
	} 
	public synchronized void show(){ 
		int i=0,s=0,a=0;
		while(true){
			int number = piao.getNumber();				 
			number--;
			piao.setNumber(number);
			if(number>=0){
				System.out.println(name+"正在售出第"+(number+1)+"张票");	 
			}else{
				System.out.println(name+"已售空");
	        	 break;	 
	        }
			if(name.equals("窗口一")){
				i++;
			}else if(name.equals("窗口二")){
				s++;
			}else if(name.equals("窗口三")){
				a++;
			}
		}
		System.out.println("窗口一售"+i+"张"+"窗口二售"+s+"张"+"窗口三售"+a+"张");
	}
}
