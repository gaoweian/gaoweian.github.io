/**
定义：枚举就是要让各种类型的变量的取值只能为若干个固定值得一个，
否则编译器就会报错
枚举可以让编译器在编译时就可以控制程序赋给的非法值，
使用普通变量的方式无法实现这一目标
起源：在jdk1.5之后，使用关键字enum定义的一种新类型，成为枚举类

*/
public class  EnumDemo2{
	public static void main(String[] args){
		EnumController oce = EnumController.ON;
		System.out.println(oce);
		System.out.println( oce.ON.ordinal());// 返回枚举实例在枚举类中的索引,从0开始;
		EnumController[] es = oce.values();//返回该枚举类所有对象组成的数组
		for(int i = 0;i<es.length;i++){
			System.out.println(es[i]);
		}
		
	}
}

enum EnumController{
	ON,OFF
}
/**
使用enum关键字定义的枚举类，就相当于定义了一个类，此类继承了Enum类而已
Enum类定义了一下方法  
String name();// 返回枚举实例名称;
	int ordinal();// 返回枚举实例在枚举类中的索引,从0开始;
	String toString();// 返回枚举对象的"自我描述";(看源代码)

*/

