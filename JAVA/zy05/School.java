public class School{
		//�������������Ϣ
        String name;   //��������
        int age;       //У������
        char area;   //��ַ����
		
public  School(String name,int age,char area){
	this.name=name;
	this.age=age;
	this.area=area;
}
public void say(){
	System.out.println("������"+name+",���䣺"+age+"��,�Ա�"+area);
}
//������Ķ�����Ϣ
public  void exercise(){
	System.out.println("�");
}

}