/**
	ö�ٹ��췽��
*/
public class Colorde{
	public static void main(String[] args){
		System.out.println("Hello World!");
		Color ci = Color.RED;
	}
}

enum Color {
	RED("��"),GREEN("��"),BLUE();
	
	private String name;
	private Color(String name){
		this.name = name;
		System.out.println("�в����Ĺ��췽��");
	}

	private Color(){
		System.out.println("�޲����Ĺ��췽��");
	}
	
}
