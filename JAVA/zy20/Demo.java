public class Demo{
	public static void main(String[] args){
		int a=0,b=2,c;
		try{
			c=a/b;
			return ;
		}catch (Exception e) {
				e.printStackTrace();
		}finally{
			System.out.println("����");
		}
	}
}