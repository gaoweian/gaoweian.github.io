/*public class Demo{
	public static void main(String[] args){
		new Demo().yc();
	}
	public void yc(){
		int a = 0;
		int b = 1;
		int c = -1;
		try{
			c = b/a;
		}catch(ArithmeticException s){
			System.out.println("数学运算错误");
			System.out.println(s.toString());//返回异常类名和异常信息
			s.printStackTrace();//返回异常在栈区的信息
			System.out.println(s.getMessage());//返回异常信息
		}
		System.out.println(c);
	}
}
*/
class ExceptionDemo  {  
    int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{ //在功能上通过throws的关键字声明该功能可能出现问题    
        int []arr = new int [a];  
  
        System.out.println(arr[4]);//制造的第一处异常  
  
        return a/b;//制造的第二处异常  
    }  
}  
  
  
class Demo  {  
    public static void main(String[]args){ //throws Exception   
        ExceptionDemo d = new ExceptionDemo();  
        try{  
                int x = d.div(4,0);//程序运行截图中的三组示例 分别对应此处的三行代码  
                //int x = d.div(5,0);  
               // int x = d.div(4,1);  
                System.out.println("x="+x);   
        }catch (ArithmeticException e){  
            System.out.println(e.toString());  
        }catch (ArrayIndexOutOfBoundsException e){  
            System.out.println(e.toString());  
        }  
        catch (Exception e){ //父类 写在此处是为了捕捉其他没预料到的异常 只能写在子类异常的代码后面  
                            //不过一般情况下是不写的   
            System.out.println(e.toString());  
        }  
        System.out.println("Over");  
    }  
  
}
