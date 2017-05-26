public class Cjdowhile{
	public static void main(String[] args){
		int i=1,j=1,sum=0;
		do{
			j=j*i;
			sum=sum+j;
			i++;
		}while(i<=10);
		System.out.println(sum);
	}
}