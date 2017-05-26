//Ë®ÏÉ»¨
public class shui{
	public static void main (String[] args){
		 int a=0,b=0,c=0,d;
		 for(d=100;d<1000;d++){
  			a=d/100;
			b=d/10%10;
			c=d%10;
			if(d==a*a*a+b*b*b+c*c*c){
				System.out.print(d+"\n"); 	
			}
		 }
	}
}
