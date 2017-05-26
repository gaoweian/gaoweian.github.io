interface I{
	void show();
}
/*enum Color implements I{
	RED(){
		public void show(){
			System.out.println("红色");
		}
	},GREEN(){
		public void show(){
			System.out.println("绿色");
		}
	},BLUE(){
		public void show(){
			System.out.println("蓝色");
		}
	}
}*/
enum Color implements I{
	RED(),GREEN();
	static String BLUE = "lan";
	public void show(){
		System.out.println("红色");
	}
}
/*enum Color {
	color;
	public void show(){
		System.out.println("用枚举实现单例");
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
