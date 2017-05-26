import java.util.Scanner;
public class YcDemo{
	Scanner sc = new Scanner(System.in);
	int[] a = new int[5];
	public static void main(String[] args) throws Exception{
		try{
            new YcDemo().show();
        }catch (MyException e){
            e.printStackTrace();
			System.out.println("异常信息"+e.toString());
        }  
	}
	public void show() throws MyException{
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if(a[i] != a[i++]){
				throw new MyException("输入有误！请输入整数");
			}else if(a.length<=5){
				throw new MyException("输入有误！请输入至少五个整数");
			}else{
				 System.out.println(a[i]);
			 }
		}	
	}
}
 class MyException extends Exception{
    public MyException() {
        super();
    }    
    public MyException(String message){
        super(message);
    }
}