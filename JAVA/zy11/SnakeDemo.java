class Snake{ 
	private String name = "�ⲿ������";
	private class Node{
		private String name = "�ڲ�������";
		public void add2ikil(){
			String name = "�ֲ�����";
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