package com.dazhi;


import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Car [] a = new Car[6];
	public static void main(String[] args){
		
	
		Welcome(); 
	}
	public static void Welcome(){
		System.out.println("---------------------");
		System.out.println("-----��ӭ�����⳵ϵͳ-----");
		System.out.println("-----1.�⳵------");
		System.out.println("-----2.�˳�-----------");
		System.out.println("---------------------");
		int p = sc.nextInt();
		double sum = 0;
		int w = 0;
		int x = 0;
		switch(p){
		case 1:  
				System.out.println("---------------------------------------------");
		        System.out.println("----------------���������г�����Ϣ��---------------");  
		        System.out.println("���\t" + "��������\t" +"����\t" + "�ػ�\t"+"���\t" );
		        a[0] = new SjCar( "�µ�A4", 4, 0,500.0);  
			    a[1] = new SjCar( "���Դ�6", 4,0, 400.0);  
			    a[2] = new KeCar( "Ƥ��ѩ6", 4, 2, 450.0);  
			    a[3] = new KCar("����",20,0, 800.0);  
			    a[4] = new KCar("�ɻ���",0 , 4,400.0);  
			    a[5] = new KCar("��ά��", 0, 20,1000.0); 
		        for(int i = 0; i < a.length; i++){  
		        	//System.out.println(a[i]);
		        	System.out.println((i+1) +  "\t" +a[i].name + "\t" + a[i].number + "��\t" + a[i].weight + "��\t" +a[i].price + "Ԫ/��\t" );
		        }
		        System.out.println("---------------------------------------------");
		        System.out.print("��������Ҫ�⼸������");  
		        int b = sc.nextInt();
		        int[] s = new int[6];  
		        for (int i = 1; i <= b; i++){  
		            System.out.println("��������Ҫѡ��ĳ��������кţ�" );  
		            int f = sc.nextInt() - 1;  
		            System.out.println("�ܹ���Ҫ��������");  
		            int q = sc.nextInt();  
		            s[f] = q;  
		        } 
		        System.out.println("�������⳵������");  
		        int t = sc.nextInt();  
		        System.out.println("�˵����£�");  
		        System.out.println("���˳���"); 
		        for (int f = 0; f < a.length; f++){  
					if (s[f] !=0 ){  
		                if(a[f].getnumber() != 0){
							System.out.println(a[f].name);
						}
		            }  
		        } 
		        System.out.println("�ػ�����"); 
		        for (int f = 0; f < a.length; f++){  
		        	if (s[f] !=0 ){  
		                if(a[f].getweight() != 0){
							System.out.println(a[f].name);
						}
		            }  
		        } 
		        for (int f = 0; f < a.length; f++){  
					if (s[f] !=0 ){  
		                System.out.println(a[f].name+"   "+s[f] + "��,"  + "���ؿ�:"+s[f]*a[f].getnumber()+"�ˣ�"+"�ܹ��ػ���:"+s[f]*a[f].getweight()+"��,"+t+"�������:"+s[f]*a[f].getprice()*t+"Ԫ");  
		                w += s[f]*a[f].number;
		                x += s[f]*a[f].weight;
		                sum += s[f]*a[f].getprice()*t;  
		            }  
		        }  			
		        System.out.println("�������ǣ�"+w+"��");
		        System.out.println("���ػ����ǣ�"+x+"��");
		        System.out.println("������ǣ�"+sum+"Ԫ");  
		        break;	       
		case 2:
				System.out.println("���߲���");
				System.exit(0);
				default:System.out.println("��������,����������");
		Welcome();
		}
	}
}
