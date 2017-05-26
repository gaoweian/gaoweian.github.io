public class Zm{
	public static void main(String[] args){
		MyWindow i = new MyWindow();
		i.close();
	}
}
interface IWindow{
	void max();	
	void min();
	void close();
}
abstract class WindowAdapter implements IWindow{
	public void max(){}
	public void min(){}
	public void close(){}
}
class MyWindow extends WindowAdapter {
	public void close(){
		System.out.println("¹Ø´°");
	}
}
