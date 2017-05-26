public class Sj{
        String name;      
        char price;     	
public  Sj(String name,char sex){
	this.name=name;
	this.price=price;
}
public void say(){
	System.out.println("品牌："+name+",价格："+price);
}
//声明类的动作信息
public  void tell(){
	System.out.println("打电话");
}
public void emill(){
	System.out.println("fa邮件");
}
}