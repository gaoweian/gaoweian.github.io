public class Teacher{
	
		//声明类的属性信息
        String name;   //姓名属性
        int age;       //年龄属性
        char sex;      //性别属性
		
public  Teacher(String name,int age,char sex){
	this.name=name;
	this.age=age;
	this.sex=sex;
}
public void say(){
	System.out.println("姓名："+name+",年龄："+age+"岁,性别："+sex);
}
//声明类的动作信息
public  void teach(){
	System.out.println("课程");
}
public void kaihui(){
	System.out.println("kaihu");
}
public void play(){
	System.out.println("play");
}
}