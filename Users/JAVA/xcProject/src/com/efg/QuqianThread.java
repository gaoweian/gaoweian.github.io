package com.efg;

public class QuqianThread implements Runnable{
	private ZhangHu zhanghu;
	private int money;
	public QuqianThread(ZhangHu zhanghu,int money){
		this.zhanghu = zhanghu;
		this.money = money;
	}
	
	public void run(){
		//ͬ�������
		synchronized(zhanghu){
			if(zhanghu.getNumber()>=money){
				//�˻���
				zhanghu.setNumber(zhanghu.getNumber()-money);
				System.out.println("ȡ��ɹ���ȡ����"+money+"Ԫ�������"+zhanghu.getNumber()+"Ԫ");
			}else{
				System.out.println("���㣬��ǰ��ʣ��"+zhanghu.getNumber()+"Ԫ����"+(money-zhanghu.getNumber())+"Ԫ");
			}
		}
	}
}
