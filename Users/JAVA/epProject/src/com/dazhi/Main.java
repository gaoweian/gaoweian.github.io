package com.dazhi;

public class Main {

	public static void main(String[] args) {
		int s=0;
		int a = 2;
		int sum=0;
		for(int i=1;i<10;i++){
			s=s*10+a;
			sum = sum+s;
			System.out.print(s+"\t");
		}
		System.out.println("��Ϊ"+sum);
	}

}
