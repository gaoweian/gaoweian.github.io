enum Color{
	RED("��"),GREEN("��"),BLUE("��");
	private String name;
	private Color(String name){
		this.name = name;
		System.out.println("111111");
	}
	private Color(){
		
		System.out.println("22222");
	}
	public String getName(){
		return name;
		
	}
	public String toSstring(){
		return this.name;
	}
}
public class ColorDemo{
	public static void main(String[] args){
		Color sc  = Color.RED;
		System.out.println(sc);
		System.out.println(sc.name());
		System.out.println(sc.ordinal());
	}
}