interface Person{
	void eat();
	void sleep();
}

class Student implements Person{
	public void eat(){
		System.out.println("ѧ��ȥʳ�óԷ�!");
	}
	public void sleep(){
		System.out.println("ѧ��Ҫ������˯��!");
	}
}

class Teacher implements Person{
	public void eat(){
		System.out.println("��ʦȥ�̹������Է�!");
	}
	public void sleep(){
		System.out.println("��ʦ��ѧУ��Ԣ˯��!");
	}
}

class Parents implements Person{
	public void eat(){
		System.out.println("�ҳ�ȥ�д������ݳԷ�!");
	}
	public void sleep(){
		System.out.println("�ҳ����д���˯��!");
	}
}

class Foreign implements Person{
    public void eat(){
       System.out.println("���ȥ�Ƶ�Է���");
    }
    public void sleep(){
       System.out.println("����ؾƵ�˯����");
    }
}
 
class Leader implements Person{
    public void eat(){
       System.out.println("�쵼ȥ���ݳԷ���");
    }
    public void sleep(){
       System.out.println("�쵼�ر���˯����");
    }
}

public class PersonPInterface{
	public static void main(String[] args){
		Person p = new Student();
		p.eat();
		p.sleep();
		p = new Teacher();
		p.eat();
		p.sleep();
		p = new Parents();
		p.eat();
		p.sleep();
		p=new Foreign();
        p.eat();
        p.sleep();
        p=new Leader();
        p.eat();
        p.sleep();
	}
}