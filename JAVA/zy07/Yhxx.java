import java.util.Scanner;
public class Yhxx{
	public static Scanner sc = new Scanner(System.in);
	public static Yinhang  [] a = new Yinhang[100];;
	static int i=0;
	public static void main(String[] arge){
		welcome();
	}
	//�˵��б�
	public static void welcome(){
		System.out.println("------------------------------------------------");
		System.out.println("----------------��ӭ��������ϵͳ------------");
		System.out.println("----------------1.¼�������Ϣ------------------");
		System.out.println("----------------2.��ѯ������Ϣ------------------");
		System.out.println("----------------3.�����ȡ����------------------");
		System.out.println("----------------4.�˳�--------------------------");
		System.out.println("------------------------------------------------");
		String p=sc.next();
		//ѡ������
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
				default:System.out.println("��������,����������");
			welcome();
			}
	}
	//�û���Ϣ
	public static void add(){
		System.out.println("���û���");
		String name=sc.next();
		System.out.println("����������");
		int password= sc.nextInt();
		System.out.println("���");
		double balance = sc.nextDouble();
		Yinhang c = new Yinhang(name,password,balance);
		a[i]=c;
		i++;
		System.out.println("��Ҫ��������,������yes�����򷵻ز˵�����ѡ��");
		String p=sc.next();
		if(p.equals("yes")){
			add();
		}else{
		System.out.println("��������,���ز˵�����ѡ��");
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
		System.out.println("������Ϣ��ѯ�����,�Ƿ񷵻����˵�������������");
		System.out.println("yes�������˵���no�˳�");
		String name=sc.next();
		if(name.equals("yes")){
			welcome();
		}else if(name.equals("no")){
			System.out.println("���˳���ϵͳ");
			System.exit(0);
		}
	}
	//��ȡ����
	public static void function(){
		for(i=0;i<a.length;i++){
			if(a[i] != null){
				System.out.print("��"+a[i].balance+"Ԫ");
			}
				System.out.println("�밴���ܼ���");
				System.out.println("--1.ȡ��--");
				System.out.println("--2.���--");
				System.out.println("--3.ת��--");
				System.out.println("--4.�˳�--");
				String f = sc.next();
				switch(f){
					case "1":
						for(int p=0;p<3;p++){
							System.out.println("�������룺");
							int s = sc.nextInt();
							if(s!=a[i].password){
								System.out.println("����������������룺");
							}else {
								System.out.println("������ȷ��������ȡ���");
								double v = sc.nextDouble();
								if(v>a[i].balance){
									System.out.println("ȡ��ʧ�ܣ�");
								}else{
									System.out.println("ȡ��ɹ���");
								}
								System.out.println("��de���������,�Ƿ񷵻����˵�������������");
								System.out.println("yes�������˵���no�˳�");
								String name=sc.next();
								if(name.equals("yes")){
									welcome();
								}else if(name.equals("no")){
									System.out.println("���˳���ϵͳ");
									System.exit(0);
								}
							}
						}
						System.out.println("��������������п����̣��˳���ϵͳ");
						System.out.println("����ϵ������Ա���������");
						System.exit(0);
						break;
					case "2":
							for(int p=0;p<3;p++){
								System.out.println("�������룺");
								int s = sc.nextInt();
								if(s!=a[i].password){
									System.out.println("����������������룺");
								}else {
									System.out.println("������ȷ�����������");
									double v = sc.nextDouble();
									System.out.println("���ɹ���");
								}
								System.out.println("��de���������,�Ƿ񷵻����˵�������������");
								System.out.println("yes�������˵���no�˳�");
								String name=sc.next();
								if(name.equals("yes")){
									welcome();
								}else if(name.equals("no")){
									System.out.println("���˳���ϵͳ");
									System.exit(0);
								}							
							}
							System.out.println("��������������п����̣��˳���ϵͳ");
							System.out.println("����ϵ������Ա���������");
							System.exit(0);
							break;
					case "3":
						for(int p=0;p<3;p++){
							System.out.println("�������룺");
							int s = sc.nextInt();
							if(s!=a[i].password){
								System.out.println("����������������룺");
							}else {
								System.out.println("������ȷ�����������˺ţ�");
								int m = sc.nextInt();
								System.out.println("���������");
								double v = sc.nextDouble();
								if(v>a[i].balance){
									System.out.println("ת��ʧ�ܣ�");
								}else{
									System.out.println("ת�˳ɹ���");
								}
								System.out.println("��de���������,�Ƿ񷵻����˵�������������");
								System.out.println("yes�������˵���no�˳�");
								String name=sc.next();
								if(name.equals("yes")){
									welcome();
								}else if(name.equals("no")){
									System.out.println("���˳���ϵͳ");
									System.exit(0);
								}
							}
						}
						System.out.println("��������������п����̣��˳���ϵͳ");
						System.out.println("����ϵ������Ա���������");
						System.exit(0);
						break;
					case "4":
						System.exit(0);
					default:
						System.out.println("������������������");
						function();
				}
		}
		
	}
}