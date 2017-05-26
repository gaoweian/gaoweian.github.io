//密码强度
import java.util.Scanner;
public class Mima{
	public static void main(String[] args){
		int i,z,x,c;
		System.out.print("请输入密码：");
		Scanner p = new Scanner(System.in);
		String a=p.next();
		char[] k = new char[a.length()];
		System.out.println("密码长度："+a.length());
		for(i=0;i<a.length();i++){
			k[i]=a.charAt(i);
		}
		z=0;
		x=0;
		c=0;
		for(i=0;i<a.length();i++){
			if(k[i]>=48 &&k [i]<=57){
				z=1;
			}else if((k[i]>=65 && k[i]<=90)||(k[i]>=97&&k[i]<=122)){
				x=1;
			}else{
				c=1;
			}
		}
		System.out.print("密码强度:");
		if(z==1 && x==1 && c==1){
			System.out.println("强");
		}else if((z==1 && x==1)||(z==1 && c==1)||(c==1 && x==1)){
			System.out.println("中");
		}else if(z==1 || x==1 || c==1){
			System.out.println("弱");
		}
		
	}
}