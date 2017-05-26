//冒泡法
import java.util.Scanner;
public class Mp{
	public static void main(String[] args){
		//System.out.println("请输入五个数用冒泡法排序");
		int i,j,t;
		int []a = new int[]{1,2,3,4,6};
		//Scanner sc=new Scanner(System.in);
		//for(j=0;j<5;j++){
		//	a[j]=sc.nextInt();
		//}
		for(j=0;j<5;j++){
			for(i=0;i<4-j;i++){
				if(a[i]>a[i+1]){
					t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
				}
			}
		}
		for(i=0;i<5;i++){
			System.out.println(a[i]);
		}
	}
}