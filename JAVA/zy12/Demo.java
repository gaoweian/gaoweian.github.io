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
			System.out.println("��ѧ�������");
			System.out.println(s.toString());//�����쳣�������쳣��Ϣ
			s.printStackTrace();//�����쳣��ջ������Ϣ
			System.out.println(s.getMessage());//�����쳣��Ϣ
		}
		System.out.println(c);
	}
}
*/
class ExceptionDemo  {  
    int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{ //�ڹ�����ͨ��throws�Ĺؼ��������ù��ܿ��ܳ�������    
        int []arr = new int [a];  
  
        System.out.println(arr[4]);//����ĵ�һ���쳣  
  
        return a/b;//����ĵڶ����쳣  
    }  
}  
  
  
class Demo  {  
    public static void main(String[]args){ //throws Exception   
        ExceptionDemo d = new ExceptionDemo();  
        try{  
                int x = d.div(4,0);//�������н�ͼ�е�����ʾ�� �ֱ��Ӧ�˴������д���  
                //int x = d.div(5,0);  
               // int x = d.div(4,1);  
                System.out.println("x="+x);   
        }catch (ArithmeticException e){  
            System.out.println(e.toString());  
        }catch (ArrayIndexOutOfBoundsException e){  
            System.out.println(e.toString());  
        }  
        catch (Exception e){ //���� д�ڴ˴���Ϊ�˲�׽����ûԤ�ϵ����쳣 ֻ��д�������쳣�Ĵ������  
                            //����һ��������ǲ�д��   
            System.out.println(e.toString());  
        }  
        System.out.println("Over");  
    }  
  
}
