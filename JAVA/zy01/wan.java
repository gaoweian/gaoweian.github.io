//1000内的完数
public class wan{
	public static void main (String[] args){
		int i,j,k,m;
    for(i=1;i<=1000;i++){
        k=0;
        for(j=1;j<=i-1;j++){
        	 if(i%j==0) {
        	 	k=k+j;
			 }
		}
        if(k==i) {
        	System.out.printf(i+"是完数,因子是");
        	 for(k=1;k<i;k++){       
		       if(i%k==0) 
			   	System.out.printf("\t"+k);  
			}  
			System.out.printf("\n");  
		
	    }
    }	
  }
}
