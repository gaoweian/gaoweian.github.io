public class Jsdowhile{
	public static void main(String[] args){
		int sum=0,i=101;
		System.out.print("100到200之间的奇数和:");
		do{
			sum=sum+i;
			i=i+2;
		}while(i<=200);
			System.out.print(sum+"\n");
	}
}