public class S{
	public static void main(String[] args){
		Ishool sc = new teacherImpl();
		sc.study();
		Ishool sc1 = new studentImpl();
		sc1.study();
	}	
}
//定义接口
class B{
}
interface Ishool{
	public static final String NAME="小明";
	public abstract void study();//方法的声明
}
interface IA extends Ishool{
}
class teacherImpl extends B implements Ishool,IA{
	public void study(){
		System.out.println("教课"+NAME);
	}
}
class studentImpl implements Ishool{
	public void study(){
		System.out.println("上课"+NAME);
	}
}
//interface  //定义接口
//implements //实现接口
//public     //公共的
//extends    //继承
//private    //私有的
//protected  //受保护的 
//final      //最终的 
//abstract   //声明抽象

