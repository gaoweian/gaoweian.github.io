package cyl;

import java.util.Scanner;
public class Cp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("0--10，请从中选取五个号码");
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
		System.out.println("您选取的五个号码中有"+c+"个是中奖号码");
		if(c==5){
			System.out.println("中一等奖，棉花糖一个");
		}else if(c==4){
			System.out.println("中二等奖，棒棒糖一个");
		}else if(c==3){
			System.out.println("中三等奖，糖块一个");
		}else{
			System.out.println("不要灰心，再接再厉，大奖等你拿回家");
		}
	}	
}

