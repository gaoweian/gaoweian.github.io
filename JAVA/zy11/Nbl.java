public class Nbl{
	String name = "xiao";
	public static void main(String[] args){
		//out oc = new out();
		//out.in ic = oc.new in();
		//ic.say();
		//oc.show();
		new Nbl().show(); 
	}
	public void show(){
		class L{
			public void say(){
				System.out.println("111111111"+name);
			} 
		}
		new L().say();
	}	
}
/*class out{
	String name = "外部";
	class in{
	public void say(){
			System.out.println("内部，"+name);
		}
	}
	public void show(){
		in ic = new in();
		ic.say();
	}
}*/