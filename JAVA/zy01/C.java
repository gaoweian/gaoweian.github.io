public class C{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.printf(j+"*"+i+"="+i*j+"\t");
			}
			System.out.printf("\n");
		}
	}	
}