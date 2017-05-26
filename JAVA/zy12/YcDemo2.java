import java.util.Scanner;
public class YcDemo2{
	public static void main(String[] args) throws Exception{
		try{
            new YcDemo2().sanjiao();
        }catch(MyException e){
            e.printStackTrace();
			System.out.println("异常信息"+e.toString());
        }  
	}
	public void sanjiao() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		System.out.println("请输入第三个数");
		int c = sc.nextInt();
		if(a+b>c&&b+c>a&&a+c>b){
			System.out.println("可构成三角形");
		}else{
			throw new MyException("不可构成三角形");
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


