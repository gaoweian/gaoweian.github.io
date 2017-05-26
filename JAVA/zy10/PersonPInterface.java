interface Person{
	void eat();
	void sleep();
}

class Student implements Person{
	public void eat(){
		System.out.println("学生去食堂吃饭!");
	}
	public void sleep(){
		System.out.println("学生要回寝室睡觉!");
	}
}

class Teacher implements Person{
	public void eat(){
		System.out.println("教师去教工餐厅吃饭!");
	}
	public void sleep(){
		System.out.println("教师回学校公寓睡觉!");
	}
}

class Parents implements Person{
	public void eat(){
		System.out.println("家长去招待所饭馆吃饭!");
	}
	public void sleep(){
		System.out.println("家长回招待所睡觉!");
	}
}

class Foreign implements Person{
    public void eat(){
       System.out.println("外宾去酒店吃饭！");
    }
    public void sleep(){
       System.out.println("外宾回酒店睡觉！");
    }
}
 
class Leader implements Person{
    public void eat(){
       System.out.println("领导去宾馆吃饭！");
    }
    public void sleep(){
       System.out.println("领导回宾馆睡觉！");
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