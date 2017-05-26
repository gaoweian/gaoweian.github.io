public class School{
		//声明类的属性信息
        String name;   //姓名属性
        int age;       //校龄属性
        char area;   //地址属性
		
public  School(String name,int age,char area){
	this.name=name;
	this.age=age;
	this.area=area;
}
public void say(){
	System.out.println("姓名："+name+",年龄："+age+"岁,性别："+area);
}
//声明类的动作信息
public  void exercise(){
	System.out.println("活动");
}

}