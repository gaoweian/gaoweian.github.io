public class Xzgs2{
	public static void main(String[] args){
		int a=0;
		System.out.println("前五个被3整除的有");
		for(i=1;i<=100;i++){
			if(i%3==0){
				a++;
				if(a<=5){
					System.out.println(i);
				}
			}
		}
	}
}