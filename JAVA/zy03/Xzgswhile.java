public class Xzgswhile{
	public static void main(String[] args){
		int a=0,i=1;
		System.out.print("可以被3整除的有");
		while(i<=100){
			if(i%3==0){
				System.out.print(i+"\t");
				a++;	
			}
				i++;
		}
				System.out.println("共有"+a+"个");
	}
}