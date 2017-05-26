public class Xzgs2dowhile{
	public static void main(String[] args){
		int a=0,i=1;
		System.out.println("前五个被3整除的有");
		do{
			if(i%3==0){
				a++;
				if(a<=5){
					System.out.println(i);
				}
			}
			i++;
		}while(i<=100);
	}
}