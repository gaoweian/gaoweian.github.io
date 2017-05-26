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
		final String finalProp = "�ֲ�����";
		test1(new AbstractSuper(){
			public void show(){
				System.out.println(finalProp);
				System.out.println("�����������ڲ���");
			}
		});
		test2(new Inner(){
			public void show(){
				System.out.println("�ӿ������ڲ���");
			}
		});
	}
}