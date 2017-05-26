import java.util.Scanner;
public class Xx{
	public static Scanner sc = new Scanner(System.in);
	public static Supermarket [] a = new Supermarket[100];
	static int i=0;
	public static void main(String[] arge){
		welcome();
	}
	//菜单列表
	public static void welcome(){
		System.out.println("------------------------------------------------");
		System.out.println("----------------欢迎进入超市系统------------");
		System.out.println("----------------1.录入超市信息------------------");
		System.out.println("----------------2.查询超市信息------------------");
		System.out.println("----------------3.更改超市信息------------------");
		System.out.println("----------------4.删除超市信息------------------");
		System.out.println("----------------5.退出--------------------------");
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
					update();
					break;
				case "4":
					delete();
					break;
				case "5":
					System.exit(0);
				default:System.out.println("输入有误,请重新输入");
			welcome();
			}
	}
	//插入数据
	public static void add(){
		System.out.println("请输入商品名称");
		String spname=sc.next();
		System.out.println("请输入进价");
		double jhprice= sc.nextDouble();
		System.out.println("请输入进货数量");
		int jhsumber = sc.nextInt();
		System.out.println("请输入售价");
		double xsprice= sc.nextDouble();
		System.out.println("请输入售出数量");
		int xssumber = sc.nextInt();
		System.out.println("请输入库存数量");
		int kcsumber = sc.nextInt();
		Supermarket c = new Supermarket(spname,jhprice,jhsumber,xsprice,xssumber,kcsumber);
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
	//查询数据
	public static void select(){
		int i=0;
		System.out.println("以下为超市的信息：");
		System.out.println("1.查询全部商品的信息");
		System.out.println("2.通过商品名称查询该商品的信息");
		String p=sc.next();
		if(p.equals("1")){
			for(i=0;i<a.length;i++){
				if(a[i] != null){
					a[i].say();
				}
			}
			System.out.println("您的查询已完成,是否还要查询");
			System.out.println("yes再次查询，no返回主菜单");
			String n=sc.next();
			if(n.equals("yes")){
				select();
			}else if(n.equals("no")){
				System.out.println("返回菜单重新选择");
				welcome();
			}
		}else if(p.equals("2")){
			int fff=0;
			System.out.println("输入要查询的商品名称");
				String name=sc.next();
				for(Supermarket s:a ){
					if(s!= null&&name.equals(s.spname)){
						s.say();
						fff=1;
					}

				}
				if(fff==0){
					System.out.println("查无此商品，请重新查询");
					select();	
				}
		}
		System.out.println("您的查询已完成,是否还要查询");
		System.out.println("yes返回查询，no返回主菜单");
		String name=sc.next();
		if(name.equals("yes")){
			select();
		}else if(name.equals("no")){
			System.out.println("返回菜单重新选择");
			welcome();
		}
	}
	//修改数据
	public static void update(){	
		for(i=0;i<a.length;i++){
			if(a[i]!=null){
				a[i].say();
			}
		}
		System.out.println("请输入要修改的商品名称：");
		String f = sc.next();
		for(i=0;i<a.length;i++){
				System.out.println("请输入要修改的地方：");
				System.out.println("--1.商品名称请输入--");
				System.out.println("----2.进价请输入----");
				System.out.println("--3.进货数量请输入--");
				System.out.println("----4.售价请输入----");
				System.out.println("--5.售出数量请输入--");
				System.out.println("--6.库存数量请输入--");
				String zz = sc.next();
				switch(zz){
					case "1":
						System.out.println("请输入商品名称：");
						String v = sc.next();
						a[i].spname = v;
						welcome();
						break;
					case "2":
						System.out.println("请输入进货价格：");
						double c= sc.nextDouble();
						a[i].jhprice=c;
						welcome();
						break;
					case "3":
						System.out.println("请输入进货数量：");
						int q = sc.nextInt();
						a[i].jhsumber = q;
						welcome();
						break;
					case "4":
						System.out.println("请输入售价：");
						double b= sc.nextDouble();
						a[i].xsprice=b;
						welcome();
						break;
					case "5":
						System.out.println("请输入售货数量：");
						int p = sc.nextInt();
						a[i].xssumber = p;
						welcome();
						break;
					case "6":
						System.out.println("请输入库存数量：");
						int l = sc.nextInt();
						a[i].kcsumber = l;
						welcome();
						break;
					default:
						System.out.println("输入有误，请重新输入");
						update();
				}
		}

}
	public static void delete(){
		int i=0;
		System.out.println("选择删除方式");
		System.out.println("1.删除全部");
		System.out.println("2.删除单个");
		String p=sc.next();
		 if(p.equals("1")){
			 for(i=0;i<a.length;i++){
				if(a[i] != null){
					a[i]=null;	
				}
			 }
			 System.out.println("删除完成");
			 System.out.println("yes再次查询，no返回主菜单");
			 String n=sc.next();
			 if(n.equals("yes")){
				select();
			 }else if(n.equals("no")){
				System.out.println("返回菜单重新选择");
				welcome();
			 }
		 }else if(p.equals("2")){
			int f=0;
			System.out.println("输入要删除的超市信息的商品名称");
			String v=sc.next();
			 for(i=0;i<a.length;i++){
				if(a[i] != null && v.equals(a[i].spname)){
					a[i]=null;
					f=1;
				}
			}
			if(f==0){
				System.out.println("查无此人");
				System.out.println("yes继续，no返回主菜单");
				if(v.equals("yes")){
					select();
				}else if(v.equals("no")){
					System.out.println("返回菜单重新选择");
					welcome();
				}
			}
			System.out.println("您删除数据任务已完成,是否还要继续");
			System.out.println("yes继续，no返回主菜单");
			String w=sc.next();
			if(w.equals("yes")){
				select();
			}else if(w.equals("no")){
				System.out.println("返回菜单重新选择");
				welcome();
			}
		}
	}
	
}

