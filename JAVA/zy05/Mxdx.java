import java.util.Scanner;
public class Mxdx{
	public static void main(String[] args){
		//Student student = new Student("����",19,'��');
		//student.say();
		//student.eat();
		//student.study();
		//student.sleep();
	while(true){
		System.out.println("1����������ʦ��Ϣ��2��������ѧ����Ϣ��3��������ѧУ��Ϣ��4�����������Ϣ��5���������ֻ���Ϣ��6�������������Ϣ��7����������ҫ��Ϣ");
		Scanner sc = new Scanner(System.in);
		int j=sc.nextInt();
		//��ʦ
		if(j==1){
			Teacher [] a = new Teacher[2];
			for(int i=0;i<2;i++){
				System.out.println("����������");
				String name=sc.next();
				System.out.println("����������");
				int age=sc.nextInt();
				System.out.println("�������Ա�");
				char sex=sc.next().charAt(0);
				Teacher b = new Teacher(name,age,sex);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//ѧ��
		if(j==2){
			Student [] a = new Student[2];
			for(int i=0;i<2;i++){
				System.out.println("����������");
				String name=sc.next();
				System.out.println("����������");
				int age=sc.nextInt();
				System.out.println("�������Ա�");
				char sex=sc.next().charAt(0);
				Student b = new Student(name,age,sex);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//ѧУ
		if(j==3){
			School [] a = new School[2];
			for(int i=0;i<2;i++){
				System.out.println("������У��");
				String name=sc.next();
				System.out.println("������У��");
				int age=sc.nextInt();
				System.out.println("�������ַ");
				char area=sc.next().charAt(0);
				School b = new School(name,age,area);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//��
		if(j==4){
			Huoche [] a = new Huoche[2];
			for(int i=0;i<2;i++){
				System.out.println("����������");
				String name=sc.next();
				System.out.println("������ʱ��");
				char sj=sc.next().charAt(0);
				System.out.println("�����������");
				char carea=sc.next().charAt(0);
				System.out.println("�����뵽���");
				char darea=sc.next().charAt(0);
				Huoche b = new Huoche(name,sj,carea,darea);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//�ֻ�
		if(j==5){
			Sj [] a = new Sj[2];
			for(int i=0;i<2;i++){
				System.out.println("������Ʒ��");
				String name=sc.next();
				System.out.println("������۸�");
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
				System.out.println("������Ʒ��");
				String name=sc.next();
				System.out.println("������۸�");
				char price=sc.next().charAt(0);
				Dn b = new Dn(name,price);
				a[i]=b;
		}
		for(int i=0;i<2;i++){
			a[i].say();
		}
		break;
		}
		//��ҫ
		if(j==7){
			Hero [] a = new Hero[2];
			for(int i=0;i<2;i++){
				System.out.println("����������");
				String name=sc.next();
				System.out.println("������װ��");
				String zhuangbei=sc.next();
				System.out.println("��������������");
				int type=sc.nextInt();
				System.out.println("������Ƥ��");
				String pfname=sc.next();
				System.out.println("�������˺�ֵ");
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