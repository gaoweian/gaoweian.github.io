import java.util.Scanner;
class ThrowDemo
{
	public static void main(String[] args){
		try{
			System.out.println(add());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("异常信息"+e.toString());
			
		}
		
		
	}
	
	public static int add()throws Exception{
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("请输入第一个数");
			int num1 = input.nextInt();
			System.out.println("请输入第er个数");
			int num2 = input.nextInt();
			return num1+num2;
		}catch(Exception e){
			throw e;
			//throw new Exception("相加运算失败");
			
		}
	}
  
class Super{
     public void show() throws Exception{}
}
class Sub extends Super{
    public void show() throws Exception{}
}

}


