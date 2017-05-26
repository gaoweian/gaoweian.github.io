package cyl;

public class Cyc {
	public static void main(String[] args){
		say();
		
	}
	public static void show(){
		 int a=0,b=1;
		 int c=b/a;
	}
	public static int say(){
		try{
			show();
			return 0 ;
		}catch(Exception e){
			System.out.println("Òì³£");
		}finally{
			System.out.println("Êä³ö");
		}
		return 0;	
	}

}
