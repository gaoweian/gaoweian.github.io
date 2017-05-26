/**
	枚举构造方法
*/
public class Colorde{
	public static void main(String[] args){
		System.out.println("Hello World!");
		Color ci = Color.RED;
	}
}

enum Color {
	RED("红"),GREEN("绿"),BLUE();
	
	private String name;
	private Color(String name){
		this.name = name;
		System.out.println("有参数的构造方法");
	}

	private Color(){
		System.out.println("无参数的构造方法");
	}
	
}
