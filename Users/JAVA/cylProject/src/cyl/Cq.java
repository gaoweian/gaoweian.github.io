package cyl;
import java.util.Scanner;
public class Cq {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("猜拳-----1.石头，2.剪刀，3.布");
		System.out.print("请输入\n我方=");
		//while(true){
		int a=sc.nextInt();
		int b=(int)((Math.random()*3)+1);
		if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)){
			System.out.println("对方="+b+"\n我方输");
		}else if((a==1&&b==1)||(a==2&&b==2)||(a==3&&b==3)){
			System.out.println("对方="+b+"\n双方平");
		}else{
			System.out.println("对方="+b+"\n我方赢");
		}
		//}
	}	
}
