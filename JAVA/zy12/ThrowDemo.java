import java.util.Scanner;
class ThrowDemo
{
	public static void main(String[] args){
		try{
			System.out.println(add());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("�쳣��Ϣ"+e.toString());
			
		}
		
		
	}
	
	public static int add()throws Exception{
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("�������һ����");
			int num1 = input.nextInt();
			System.out.println("�������er����");
			int num2 = input.nextInt();
			return num1+num2;
		}catch(Exception e){
			throw e;
			//throw new Exception("�������ʧ��");
			
		}
	}
  
class Super{
     public void show() throws Exception{}
}
class Sub extends Super{
    public void show() throws Exception{}
}

}

