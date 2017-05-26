public class Jswhile{
	public static void main(String[] args){
		int sum=0,i=101;
		System.out.print("100到200之间的奇数和:");
		while(i<=200){
			sum=sum+i;
			i=i+2;
		}	
			System.out.print(sum+"\n");
	}
}