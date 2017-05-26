public class Xzgs{
	public static void main(String[] args){
		int a=0;
		System.out.print("可以被3整除的有\t");
		for(int i=101;i<=200;i++){
			if(i%3==0){
				System.out.print(i+"\t");
				a++;
			}
		}
				System.out.println("共有"+a+"个");
	}
}