package com.bcd;

public class CkDemo{
	
	private static Piao piao = new Piao("���ʵ�����",50);
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
				System.out.println(name+"�����۳���"+(number+1)+"��Ʊ");	 
			}else{
				System.out.println(name+"���ۿ�");
	        	 break;	 
	        }
			if(name.equals("����һ")){
				i++;
			}else if(name.equals("���ڶ�")){
				s++;
			}else if(name.equals("������")){
				a++;
			}
		}
		System.out.println("����һ��"+i+"��"+"���ڶ���"+s+"��"+"��������"+a+"��");
	}
}
