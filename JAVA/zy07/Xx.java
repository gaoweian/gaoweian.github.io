import java.util.Scanner;
public class Xx{
	public static Scanner sc = new Scanner(System.in);
	public static Supermarket [] a = new Supermarket[100];
	static int i=0;
	public static void main(String[] arge){
		welcome();
	}
	//�˵��б�
	public static void welcome(){
		System.out.println("------------------------------------------------");
		System.out.println("----------------��ӭ���볬��ϵͳ------------");
		System.out.println("----------------1.¼�볬����Ϣ------------------");
		System.out.println("----------------2.��ѯ������Ϣ------------------");
		System.out.println("----------------3.���ĳ�����Ϣ------------------");
		System.out.println("----------------4.ɾ��������Ϣ------------------");
		System.out.println("----------------5.�˳�--------------------------");
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
					update();
					break;
				case "4":
					delete();
					break;
				case "5":
					System.exit(0);
				default:System.out.println("��������,����������");
			welcome();
			}
	}
	//��������
	public static void add(){
		System.out.println("��������Ʒ����");
		String spname=sc.next();
		System.out.println("���������");
		double jhprice= sc.nextDouble();
		System.out.println("�������������");
		int jhsumber = sc.nextInt();
		System.out.println("�������ۼ�");
		double xsprice= sc.nextDouble();
		System.out.println("�������۳�����");
		int xssumber = sc.nextInt();
		System.out.println("������������");
		int kcsumber = sc.nextInt();
		Supermarket c = new Supermarket(spname,jhprice,jhsumber,xsprice,xssumber,kcsumber);
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
	//��ѯ����
	public static void select(){
		int i=0;
		System.out.println("����Ϊ���е���Ϣ��");
		System.out.println("1.��ѯȫ����Ʒ����Ϣ");
		System.out.println("2.ͨ����Ʒ���Ʋ�ѯ����Ʒ����Ϣ");
		String p=sc.next();
		if(p.equals("1")){
			for(i=0;i<a.length;i++){
				if(a[i] != null){
					a[i].say();
				}
			}
			System.out.println("���Ĳ�ѯ�����,�Ƿ�Ҫ��ѯ");
			System.out.println("yes�ٴβ�ѯ��no�������˵�");
			String n=sc.next();
			if(n.equals("yes")){
				select();
			}else if(n.equals("no")){
				System.out.println("���ز˵�����ѡ��");
				welcome();
			}
		}else if(p.equals("2")){
			int fff=0;
			System.out.println("����Ҫ��ѯ����Ʒ����");
				String name=sc.next();
				for(Supermarket s:a ){
					if(s!= null&&name.equals(s.spname)){
						s.say();
						fff=1;
					}

				}
				if(fff==0){
					System.out.println("���޴���Ʒ�������²�ѯ");
					select();	
				}
		}
		System.out.println("���Ĳ�ѯ�����,�Ƿ�Ҫ��ѯ");
		System.out.println("yes���ز�ѯ��no�������˵�");
		String name=sc.next();
		if(name.equals("yes")){
			select();
		}else if(name.equals("no")){
			System.out.println("���ز˵�����ѡ��");
			welcome();
		}
	}
	//�޸�����
	public static void update(){	
		for(i=0;i<a.length;i++){
			if(a[i]!=null){
				a[i].say();
			}
		}
		System.out.println("������Ҫ�޸ĵ���Ʒ���ƣ�");
		String f = sc.next();
		for(i=0;i<a.length;i++){
				System.out.println("������Ҫ�޸ĵĵط���");
				System.out.println("--1.��Ʒ����������--");
				System.out.println("----2.����������----");
				System.out.println("--3.��������������--");
				System.out.println("----4.�ۼ�������----");
				System.out.println("--5.�۳�����������--");
				System.out.println("--6.�������������--");
				String zz = sc.next();
				switch(zz){
					case "1":
						System.out.println("��������Ʒ���ƣ�");
						String v = sc.next();
						a[i].spname = v;
						welcome();
						break;
					case "2":
						System.out.println("����������۸�");
						double c= sc.nextDouble();
						a[i].jhprice=c;
						welcome();
						break;
					case "3":
						System.out.println("���������������");
						int q = sc.nextInt();
						a[i].jhsumber = q;
						welcome();
						break;
					case "4":
						System.out.println("�������ۼۣ�");
						double b= sc.nextDouble();
						a[i].xsprice=b;
						welcome();
						break;
					case "5":
						System.out.println("�������ۻ�������");
						int p = sc.nextInt();
						a[i].xssumber = p;
						welcome();
						break;
					case "6":
						System.out.println("��������������");
						int l = sc.nextInt();
						a[i].kcsumber = l;
						welcome();
						break;
					default:
						System.out.println("������������������");
						update();
				}
		}

}
	public static void delete(){
		int i=0;
		System.out.println("ѡ��ɾ����ʽ");
		System.out.println("1.ɾ��ȫ��");
		System.out.println("2.ɾ������");
		String p=sc.next();
		 if(p.equals("1")){
			 for(i=0;i<a.length;i++){
				if(a[i] != null){
					a[i]=null;	
				}
			 }
			 System.out.println("ɾ�����");
			 System.out.println("yes�ٴβ�ѯ��no�������˵�");
			 String n=sc.next();
			 if(n.equals("yes")){
				select();
			 }else if(n.equals("no")){
				System.out.println("���ز˵�����ѡ��");
				welcome();
			 }
		 }else if(p.equals("2")){
			int f=0;
			System.out.println("����Ҫɾ���ĳ�����Ϣ����Ʒ����");
			String v=sc.next();
			 for(i=0;i<a.length;i++){
				if(a[i] != null && v.equals(a[i].spname)){
					a[i]=null;
					f=1;
				}
			}
			if(f==0){
				System.out.println("���޴���");
				System.out.println("yes������no�������˵�");
				if(v.equals("yes")){
					select();
				}else if(v.equals("no")){
					System.out.println("���ز˵�����ѡ��");
					welcome();
				}
			}
			System.out.println("��ɾ���������������,�Ƿ�Ҫ����");
			System.out.println("yes������no�������˵�");
			String w=sc.next();
			if(w.equals("yes")){
				select();
			}else if(w.equals("no")){
				System.out.println("���ز˵�����ѡ��");
				welcome();
			}
		}
	}
	
}

