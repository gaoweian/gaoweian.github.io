public class Student{
		//声明类的属性信息
        String name;   //姓名属性
        int age;       //年龄属性
        char sex;      //性别属性
		static int sumber=1000;
public  Student(String name,int age,char sex){
	this.name=name;
	this.age=age;
	this.sex=sex;
}
public void say(){
	System.out.println("我叫"+name+",年龄"+age+"岁,性别是"+sex);
}
//声明类的动作信息
public  void eat(){
	System.out.println("eating");
}
public void study(){
	System.out.println("study");
}
public void play(){
	System.out.println("play");
}
public void sleep(){
	System.out.println("sleep");
	System.out.println(sumber);
}

}