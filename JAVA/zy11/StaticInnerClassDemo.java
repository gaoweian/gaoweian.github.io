class Outer{
	class Inner{
		public void show(){
			System.out.println("非静态内部类");
		}
	}
	private String name = "will";
	private static int age = 17;
	static class StaticInner{
		private String s = "ooxx";
		private static int num = 13;
		public void show(){
			System.out.println(age);
			System.out.println(new Outer().name);
		}
	}
	public void test(){
		System.out.println(StaticInner.num);
		System.out.println(new StaticInner().s);
		new StaticInner().show();
	}
}
public class StaticInnerClassDemo{
	public static void main(String[] args){
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.show();
		out.test();
	} 
}
