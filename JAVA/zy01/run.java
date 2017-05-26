public class run{
	public static void main (String[] args){
		for(int i=2000;i<=2500;i++){
			if(i%4==0&&1%100!=0||i%400==0){
				System.out.printf(i+"ÊÇÈòÄê\n");
			}
		}
	}
}
