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
		System.out.println("�û�����"+name+"�����룺"+password+"����"+balance+"Ԫ");
	}
}