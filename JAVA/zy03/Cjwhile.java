//1µ½10µÄ½×³ËºÍ
public class Cjwhile{
	public static void main(String[] args){
		int i=1,j=1,sum=0;
		while(i<=10){
			j=j*i;
			sum=sum+j;
			i++;
		}
		System.out.println(sum);
	}
}