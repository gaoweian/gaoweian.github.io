public class Xzgs2while{
	public static void main(String[] args){
		int a=0,i=1;
		System.out.println("ǰ�����3����");
		while(i<=100){
			if(i%3==0){
				a++;
				if(a<=5){
					System.out.println(i);
				}
			}
			i++;
		}
	}
}