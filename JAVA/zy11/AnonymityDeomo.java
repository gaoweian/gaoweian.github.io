abstract class AbstractSuper{
	public abstract void show();
}
interface Inner{
	void show();
}
public class AnonymityDeomo{
	public static void test1(AbstractSuper as){
		as.show();
	}
	public static void test2(Inner in){
		in.show();
	} 
	public static void main(String[] args){
		final String finalProp = "局部变量";
		test1(new AbstractSuper(){
			public void show(){
				System.out.println(finalProp);
				System.out.println("抽象类匿名内部类");
			}
		});
		test2(new Inner(){
			public void show(){
				System.out.println("接口匿名内部类");
			}
		});
	}
}