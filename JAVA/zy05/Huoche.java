public class Huoche{
        String name; 
        char sj;      
        char carea; 
        char darea;
public  Huoche(String name,char sj,char carea,char darea){
	this.name=name;
	this.sj=sj;
	this.carea=carea;
	this.darea=darea;
}
public void say(){
	System.out.println("�����ͣ�"+name+",ʱ�䣺"+sj+"�����ص㣺"+carea+",����ص㣺"+darea);
}
public void sleep(){
	System.out.println("˯��");
}
public  void eat(){
	System.out.println("�Է�");
}
}