import java.util.Scanner;
public class YcDemo2{
	public static void main(String[] args) throws Exception{
		try{
            new YcDemo2().sanjiao();
        }catch(MyException e){
            e.printStackTrace();
			System.out.println("�쳣��Ϣ"+e.toString());
        }  
	}
	public void sanjiao() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		int a = sc.nextInt();
		System.out.println("������ڶ�����");
		int b = sc.nextInt();
		System.out.println("�������������");
		int c = sc.nextInt();
		if(a+b>c&&b+c>a&&a+c>b){
			System.out.println("�ɹ���������");
		}else{
			throw new MyException("���ɹ���������");
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


