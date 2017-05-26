public class Fish{
	public static void main(String[] args){
		new Maxfish().show();
	} 
}

class Maxfish{
	String name = "大鱼";
	class Minfish{
		String name = "小鱼";
		public void say(){
			String name = "都是鱼";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Maxfish.this.name);
		}

	} 
	public void show(){
		new Minfish().say();
	}
}