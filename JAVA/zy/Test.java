import java.util.Scanner;
public class Test{
	public static Scanner sc = new Scanner(System.in);
	public static Student [] a = new Student[100];
	static int i=0;
	public static void main(String[] arge){
		welcome();
	}
	public static void welcome(){
		System.out.println("------------------------------------------------");
		System.out.println("----------------欢迎进入学生录入系统------------");
		System.out.println("----------------1.录入学生信息------------------");
		System.out.println("----------------2.查询学生信息------------------");
		System.out.println("----------------3.更改学生信息------------------");
		System.out.println("----------------4.删除学生信息------------------");
		System.out.println("----------------5.退出--------------------------");
		System.out.println("------------------------------------------------");
		String p=sc.next();
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
	public static void add(){
		System.out.println("请输入姓名");
		String name=sc.next();
		System.out.println("请输入年龄");
		int age= sc.nextInt();
		System.out.println("请输入性别");
		char sex = sc.next().charAt(0);
		Student c= new Student(name,age,sex);
		a[i]=c;
		i++;
		System.out.println("若要继续输入学生信息请输入yes，否则返回菜单重新选择");
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
		System.out.println("以下为学生的信息：");
		System.out.println("1.查询全部学生的信息");
		System.out.println("2.通过学生姓名查询该学生的信息");
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
			System.out.println("输入要查询的学生姓名");
				String name=sc.next();
				for(Student s:a ){
					
					if(s!= null&&name.equals(s.name)){
						s.say();
						fff=1;
					}

				}
				if(fff==0){
					System.out.println("查无此人");
					System.out.println("yes返回查询，no返回主菜单");
					if(name.equals("yes")){
						select();
					}else if(name.equals("no")){
						System.out.println("返回菜单重新选择");
						welcome();
					}
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
	public static void update(){	
		String v;
		char cc;
		for(i=0;i<a.length;i++){
			if(a[i]!=null){
				a[i].say();
			}
		}
		System.out.println("请输入要修改的名字：");
		String f = sc.next();
		for(i=0;i<a.length;i++){
				System.out.println("请输入要修改的地方：");
				System.out.println("姓名请输入‘1’");
				System.out.println("年龄请输入‘2’");
				System.out.println("性别请输入‘3’");
				String zz = sc.next();
				switch(zz){
					case "1":
						System.out.println("请输入姓名：");
						v = sc.next();
						a[i].name = v;
						welcome();
						break;
					case "2":
						System.out.println("对不起，年龄不可更改");
						break;
					case "3":
						System.out.println("请输入性别：");
						cc = sc.next().charAt(0);
						a[i].sex = cc;
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
			System.out.println("输入要删除的学生信息的学生姓名");
			String v=sc.next();
			 for(i=0;i<a.length;i++){
				if(a[i] != null && v.equals(a[i].name)){
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
