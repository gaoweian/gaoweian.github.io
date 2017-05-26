import java.util.Arrays;
public class Bx{
	public static void main(String[] args){
		int [] a=new int []{1,4,2,5,3};
		int b,c,min;
		for(int i=0;i<5;i++){
			b=a[i];//假设最小值
			min=i;
			for(int j=i+1;j<5;j++){
				if(a[j]<b){
					min=j;//最小下标
					b=a[j];
				}
			}
			if(min!=i){
				c=a[i];
				a[i]=a[min];
				a[min]=c;
			}
		}
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
	}
}