package cyl;

import java.util.Scanner;
public class Cp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("0--10�������ѡȡ�������");
		int a[] = new int[5];
		int b[] = new int[5];
		int c=0;
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				b[j]=(int)(Math.random()*10);
				if(a[i]==(b[j])){
					c++;	 
				}
			}
		}
		System.out.println("��ѡȡ�������������"+c+"�����н�����");
		if(c==5){
			System.out.println("��һ�Ƚ����޻���һ��");
		}else if(c==4){
			System.out.println("�ж��Ƚ���������һ��");
		}else if(c==3){
			System.out.println("�����Ƚ����ǿ�һ��");
		}else{
			System.out.println("��Ҫ���ģ��ٽ��������󽱵����ûؼ�");
		}
	}	
}
