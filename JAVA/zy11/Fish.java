public class Fish{
	public static void main(String[] args){
		new Maxfish().show();
	} 
}

class Maxfish{
	String name = "����";
	class Minfish{
		String name = "С��";
		public void say(){
			String name = "������";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Maxfish.this.name);
		}

	} 
	public void show(){
		new Minfish().say();
	}
}