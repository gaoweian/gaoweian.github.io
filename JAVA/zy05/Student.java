public class Student{
		//�������������Ϣ
        String name;   //��������
        int age;       //��������
        char sex;      //�Ա�����
		static int sumber=1000;
public  Student(String name,int age,char sex){
	this.name=name;
	this.age=age;
	this.sex=sex;
}
public void say(){
	System.out.println("�ҽ�"+name+",����"+age+"��,�Ա���"+sex);
}
//������Ķ�����Ϣ
public  void eat(){
	System.out.println("eating");
}
public void study(){
	System.out.println("study");
}
public void play(){
	System.out.println("play");
}
public void sleep(){
	System.out.println("sleep");
	System.out.println(sumber);
}

}