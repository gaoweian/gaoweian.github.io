public class Teacher{
	
		//�������������Ϣ
        String name;   //��������
        int age;       //��������
        char sex;      //�Ա�����
		
public  Teacher(String name,int age,char sex){
	this.name=name;
	this.age=age;
	this.sex=sex;
}
public void say(){
	System.out.println("������"+name+",���䣺"+age+"��,�Ա�"+sex);
}
//������Ķ�����Ϣ
public  void teach(){
	System.out.println("�γ�");
}
public void kaihui(){
	System.out.println("kaihu");
}
public void play(){
	System.out.println("play");
}
}