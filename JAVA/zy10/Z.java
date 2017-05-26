public class Z{
	public static void main(String[] args){
		B b = new B();
		C c = new C();
		b.study();
		c.study();
		A.work();
	}
}

abstract class A{
	public abstract void study();
	public static void work(){
		System.out.println("工作");
	}
	public A(){
		System.out.println("构造方法");
	}
}

class B extends A{
	public void study(){
		System.out.println("学习java");
	}
}

class C extends A{
	public void study(){
		System.out.println("学习php");
	}
}