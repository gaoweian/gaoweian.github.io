interface I{
	void show();
}
/*enum Color implements I{
	RED(){
		public void show(){
			System.out.println("��ɫ");
		}
	},GREEN(){
		public void show(){
			System.out.println("��ɫ");
		}
	},BLUE(){
		public void show(){
			System.out.println("��ɫ");
		}
	}
}*/
enum Color implements I{
	RED(),GREEN();
	static String BLUE = "lan";
	public void show(){
		System.out.println("��ɫ");
	}
}
/*enum Color {
	color;
	public void show(){
		System.out.println("��ö��ʵ�ֵ���");
	}
	public static Color getcolor(){
		return color;
	}
}*/
public class Demo2{
	public static void main(String[] args){
		//Color.RED.show();
		//Color.getcolor().show();
		System.out.println(Color.BLUE);
	}
}
