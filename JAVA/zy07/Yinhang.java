public class Yinhang{
	String name;
	int password;
	double balance;
	public Yinhang(String name,int password,double balance){
		this.name=name;
		this.password=password;
		this.balance=balance;
	}
	public void say(){
		System.out.println("用户名："+name+"，密码："+password+"，余额："+balance+"元");
	}
}