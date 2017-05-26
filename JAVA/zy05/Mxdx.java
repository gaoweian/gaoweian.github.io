import java.util.Scanner;
public class Mxdx{
	public static void main(String[] args){
		//Student student = new Student("张三",19,'男');
		//student.say();
		//student.eat();
		//student.study();
		//student.sleep();
	while(true){
		System.out.println("1、请输入老师信息，2、请输入学生信息，3、请输入学校信息，4、请输入火车信息，5、请输入手机信息，6、请输入电脑信息，7、请输入荣耀信息");
		Scanner sc = new Scanner(System.in);
		int j=sc.nextInt();
		//老师
		if(j==1){
			Teacher [] a = new Teacher[2];
			for(int i=0;i<2;i++){
				System.out.println("请输入姓名");
				String name=sc.next();
				System.out.println("请输入年龄");
				int age=sc.nextInt();
				System.out.println("请输入性别");
				char sex=sc.next().charAt(0);
				Teacher b = new Teacher(name,age,sex);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//学生
		if(j==2){
			Student [] a = new Student[2];
			for(int i=0;i<2;i++){
				System.out.println("请输入姓名");
				String name=sc.next();
				System.out.println("请输入年龄");
				int age=sc.nextInt();
				System.out.println("请输入性别");
				char sex=sc.next().charAt(0);
				Student b = new Student(name,age,sex);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//学校
		if(j==3){
			School [] a = new School[2];
			for(int i=0;i<2;i++){
				System.out.println("请输入校名");
				String name=sc.next();
				System.out.println("请输入校龄");
				int age=sc.nextInt();
				System.out.println("请输入地址");
				char area=sc.next().charAt(0);
				School b = new School(name,age,area);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//火车
		if(j==4){
			Huoche [] a = new Huoche[2];
			for(int i=0;i<2;i++){
				System.out.println("请输入类型");
				String name=sc.next();
				System.out.println("请输入时间");
				char sj=sc.next().charAt(0);
				System.out.println("请输入出发地");
				char carea=sc.next().charAt(0);
				System.out.println("请输入到达地");
				char darea=sc.next().charAt(0);
				Huoche b = new Huoche(name,sj,carea,darea);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//手机
		if(j==5){
			Sj [] a = new Sj[2];
			for(int i=0;i<2;i++){
				System.out.println("请输入品牌");
				String name=sc.next();
				System.out.println("请输入价格");
				char price=sc.next().charAt(0);
				Sj b = new Sj(name,price);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}

		if(j==6){
			Dn [] a = new Dn[2];
			for(int i=0;i<2;i++){
				System.out.println("请输入品牌");
				String name=sc.next();
				System.out.println("请输入价格");
				char price=sc.next().charAt(0);
				Dn b = new Dn(name,price);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//荣耀
		if(j==7){
			Hero [] a = new Hero[2];
			for(int i=0;i<2;i++){
				System.out.println("请输入姓名");
				String name=sc.next();
				System.out.println("请输入装备");
				String zhuangbei=sc.next();
				System.out.println("请输入人物类型");
				int type=sc.nextInt();
				System.out.println("请输入皮肤");
				String pfname=sc.next();
				System.out.println("请输入伤害值");
				int heat=sc.nextInt();
				Hero b = new Hero(name,zhuangbei,type,pfname,heat);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
	}	
	}
}