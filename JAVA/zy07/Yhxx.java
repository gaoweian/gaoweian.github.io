import java.util.Scanner;
public class Yhxx{
	public static Scanner sc = new Scanner(System.in);
	public static Yinhang  [] a = new Yinhang[100];;
	static int i=0;
	public static void main(String[] arge){
		welcome();
	}
	//菜单列表
	public static void welcome(){
		System.out.println("------------------------------------------------");
		System.out.println("----------------欢迎进入银行系统------------");
		System.out.println("----------------1.录入基本信息------------------");
		System.out.println("----------------2.查询基本信息------------------");
		System.out.println("----------------3.进入存取功能------------------");
		System.out.println("----------------4.退出--------------------------");
		System.out.println("------------------------------------------------");
		String p=sc.next();
		//选择功能项
			switch(p){
				case "1":
					add();
					break;
				case "2":
					select();
					break;
				case "3":
					function();
					break;
				case "4":
					System.exit(0);
				default:System.out.println("输入有误,请重新输入");
			welcome();
			}
	}
	//用户信息
	public static void add(){
		System.out.println("请用户名");
		String name=sc.next();
		System.out.println("请输入密码");
		int password= sc.nextInt();
		System.out.println("余额");
		double balance = sc.nextDouble();
		Yinhang c = new Yinhang(name,password,balance);
		a[i]=c;
		i++;
		System.out.println("若要继续输入,请输入yes，否则返回菜单重新选择");
		String p=sc.next();
		if(p.equals("yes")){
			add();
		}else{
		System.out.println("输入有误,返回菜单重新选择");
		welcome();
		}
	}
	public static void select(){
		int i=0;
		for(i=0;i<a.length;i++){
			if(a[i] != null){
				a[i].say();
			}
		}
		System.out.println("您的信息查询已完成,是否返回主菜单进行其他操作");
		System.out.println("yes返回主菜单，no退出");
		String name=sc.next();
		if(name.equals("yes")){
			welcome();
		}else if(name.equals("no")){
			System.out.println("已退出该系统");
			System.exit(0);
		}
	}
	//存取功能
	public static void function(){
		for(i=0;i<a.length;i++){
			if(a[i] != null){
				System.out.print("余额："+a[i].balance+"元");
			}
				System.out.println("请按功能键：");
				System.out.println("--1.取款--");
				System.out.println("--2.存款--");
				System.out.println("--3.转账--");
				System.out.println("--4.退出--");
				String f = sc.next();
				switch(f){
					case "1":
						for(int p=0;p<3;p++){
							System.out.println("输入密码：");
							int s = sc.nextInt();
							if(s!=a[i].password){
								System.out.println("密码错误，请重新输入：");
							}else {
								System.out.println("密码正确，请输入取款金额：");
								double v = sc.nextDouble();
								if(v>a[i].balance){
									System.out.println("取款失败：");
								}else{
									System.out.println("取款成功：");
								}
								System.out.println("您de操作已完成,是否返回主菜单进行其他操作");
								System.out.println("yes返回主菜单，no退出");
								String name=sc.next();
								if(name.equals("yes")){
									welcome();
								}else if(name.equals("no")){
									System.out.println("已退出该系统");
									System.exit(0);
								}
							}
						}
						System.out.println("三次输入错误，银行卡被吞，退出该系统");
						System.out.println("请联系银行人员解决该问题");
						System.exit(0);
						break;
					case "2":
							for(int p=0;p<3;p++){
								System.out.println("输入密码：");
								int s = sc.nextInt();
								if(s!=a[i].password){
									System.out.println("密码错误，请重新输入：");
								}else {
									System.out.println("密码正确，请输入存款金额：");
									double v = sc.nextDouble();
									System.out.println("存款成功：");
								}
								System.out.println("您de操作已完成,是否返回主菜单进行其他操作");
								System.out.println("yes返回主菜单，no退出");
								String name=sc.next();
								if(name.equals("yes")){
									welcome();
								}else if(name.equals("no")){
									System.out.println("已退出该系统");
									System.exit(0);
								}							
							}
							System.out.println("三次输入错误，银行卡被吞，退出该系统");
							System.out.println("请联系银行人员解决该问题");
							System.exit(0);
							break;
					case "3":
						for(int p=0;p<3;p++){
							System.out.println("输入密码：");
							int s = sc.nextInt();
							if(s!=a[i].password){
								System.out.println("密码错误，请重新输入：");
							}else {
								System.out.println("密码正确，请输入汇款账号：");
								int m = sc.nextInt();
								System.out.println("请输入汇款金额：");
								double v = sc.nextDouble();
								if(v>a[i].balance){
									System.out.println("转账失败：");
								}else{
									System.out.println("转账成功：");
								}
								System.out.println("您de操作已完成,是否返回主菜单进行其他操作");
								System.out.println("yes返回主菜单，no退出");
								String name=sc.next();
								if(name.equals("yes")){
									welcome();
								}else if(name.equals("no")){
									System.out.println("已退出该系统");
									System.exit(0);
								}
							}
						}
						System.out.println("三次输入错误，银行卡被吞，退出该系统");
						System.out.println("请联系银行人员解决该问题");
						System.exit(0);
						break;
					case "4":
						System.exit(0);
					default:
						System.out.println("输入有误，请重新输入");
						function();
				}
		}
		
	}
}