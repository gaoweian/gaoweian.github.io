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
		System.out.println("-----欢迎进入租车系统-----");
		System.out.println("-----1.租车------");
		System.out.println("-----2.退出-----------");
		System.out.println("---------------------");
		int p = sc.nextInt();
		double sum = 0;
		int w = 0;
		int x = 0;
		switch(p){
		case 1:  
				System.out.println("---------------------------------------------");
		        System.out.println("----------------下面是所有车的信息：---------------");  
		        System.out.println("序号\t" + "汽车名称\t" +"载人\t" + "载货\t"+"租金\t" );
		        a[0] = new SjCar( "奥迪A4", 4, 0,500.0);  
			    a[1] = new SjCar( "马自达6", 4,0, 400.0);  
			    a[2] = new KeCar( "皮卡雪6", 4, 2, 450.0);  
			    a[3] = new KCar("金龙",20,0, 800.0);  
			    a[4] = new KCar("松花江",0 , 4,400.0);  
			    a[5] = new KCar("依维柯", 0, 20,1000.0); 
		        for(int i = 0; i < a.length; i++){  
		        	//System.out.println(a[i]);
		        	System.out.println((i+1) +  "\t" +a[i].name + "\t" + a[i].number + "人\t" + a[i].weight + "吨\t" +a[i].price + "元/天\t" );
		        }
		        System.out.println("---------------------------------------------");
		        System.out.print("请输入你要租几辆车：");  
		        int b = sc.nextInt();
		        int[] s = new int[6];  
		        for (int i = 1; i <= b; i++){  
		            System.out.println("请输入您要选择的车辆的序列号：" );  
		            int f = sc.nextInt() - 1;  
		            System.out.println("总共需要多少辆：");  
		            int q = sc.nextInt();  
		            s[f] = q;  
		        } 
		        System.out.println("请输入租车天数：");  
		        int t = sc.nextInt();  
		        System.out.println("账单如下：");  
		        System.out.println("载人车："); 
		        for (int f = 0; f < a.length; f++){  
					if (s[f] !=0 ){  
		                if(a[f].getnumber() != 0){
							System.out.println(a[f].name);
						}
		            }  
		        } 
		        System.out.println("载货车："); 
		        for (int f = 0; f < a.length; f++){  
		        	if (s[f] !=0 ){  
		                if(a[f].getweight() != 0){
							System.out.println(a[f].name);
						}
		            }  
		        } 
		        for (int f = 0; f < a.length; f++){  
					if (s[f] !=0 ){  
		                System.out.println(a[f].name+"   "+s[f] + "辆,"  + "可载客:"+s[f]*a[f].getnumber()+"人，"+"总共载货量:"+s[f]*a[f].getweight()+"吨,"+t+"天费用是:"+s[f]*a[f].getprice()*t+"元");  
		                w += s[f]*a[f].number;
		                x += s[f]*a[f].weight;
		                sum += s[f]*a[f].getprice()*t;  
		            }  
		        }  			
		        System.out.println("总人数是："+w+"人");
		        System.out.println("总载货量是："+x+"吨");
		        System.out.println("总租金是："+sum+"元");  
		        break;	       
		case 2:
				System.out.println("慢走不送");
				System.exit(0);
				default:System.out.println("输入有误,请重新输入");
		Welcome();
		}
	}
}
