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
		System.out.println("----------------��ӭ����ѧ��¼��ϵͳ------------");
		System.out.println("----------------1.¼��ѧ����Ϣ------------------");
		System.out.println("----------------2.��ѯѧ����Ϣ------------------");
		System.out.println("----------------3.����ѧ����Ϣ------------------");
		System.out.println("----------------4.ɾ��ѧ����Ϣ------------------");
		System.out.println("----------------5.�˳�--------------------------");
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
				default:System.out.println("��������,����������");
				
		
		welcome();
	}
	}
	public static void add(){
		System.out.println("����������");
		String name=sc.next();
		System.out.println("����������");
		int age= sc.nextInt();
		System.out.println("�������Ա�");
		char sex = sc.next().charAt(0);
		Student c= new Student(name,age,sex);
		a[i]=c;
		i++;
		System.out.println("��Ҫ��������ѧ����Ϣ������yes�����򷵻ز˵�����ѡ��");
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
		System.out.println("����Ϊѧ������Ϣ��");
		System.out.println("1.��ѯȫ��ѧ������Ϣ");
		System.out.println("2.ͨ��ѧ��������ѯ��ѧ������Ϣ");
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
			System.out.println("����Ҫ��ѯ��ѧ������");
				String name=sc.next();
				for(Student s:a ){
					
					if(s!= null&&name.equals(s.name)){
						s.say();
						fff=1;
					}

				}
				if(fff==0){
					System.out.println("���޴���");
					System.out.println("yes���ز�ѯ��no�������˵�");
					if(name.equals("yes")){
						select();
					}else if(name.equals("no")){
						System.out.println("���ز˵�����ѡ��");
						welcome();
					}
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
	public static void update(){	
		String v;
		char cc;
		for(i=0;i<a.length;i++){
			if(a[i]!=null){
				a[i].say();
			}
		}
		System.out.println("������Ҫ�޸ĵ����֣�");
		String f = sc.next();
		for(i=0;i<a.length;i++){
				System.out.println("������Ҫ�޸ĵĵط���");
				System.out.println("���������롮1��");
				System.out.println("���������롮2��");
				System.out.println("�Ա������롮3��");
				String zz = sc.next();
				switch(zz){
					case "1":
						System.out.println("������������");
						v = sc.next();
						a[i].name = v;
						welcome();
						break;
					case "2":
						System.out.println("�Բ������䲻�ɸ���");
						break;
					case "3":
						System.out.println("�������Ա�");
						cc = sc.next().charAt(0);
						a[i].sex = cc;
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
			System.out.println("����Ҫɾ����ѧ����Ϣ��ѧ������");
			String v=sc.next();
			 for(i=0;i<a.length;i++){
				if(a[i] != null && v.equals(a[i].name)){
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
