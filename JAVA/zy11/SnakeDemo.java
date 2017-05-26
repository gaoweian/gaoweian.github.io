class Snake{ 
	private String name = "外部类属性";
	private class Node{
		private String name = "内部类属性";
		public void add2ikil(){
			String name = "局部变量";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Snake.this.name);
		}
	}
	public void show(){
		new Node().add2ikil();
	}
}
public class SnakeDemo{
	public static void main(String[] args){
		new Snake().show();
	}
}