public class Hero{
       //�������������Ϣ
        String name;    //��������
        String zhuangbei;    //װ��
        int type;           //��������
        String pfname;    //Ƥ��
        int heat;           //�˺�ֵ
public Hero(String name,String zhuangbei,int type,String pfname,int heat){
	this.name=name;
	this.zhuangbei=zhuangbei;
	this.type=type;
	this.pfname=pfname;
	this.heat=heat;
}
public void say(){
	System.out.println("�����ͣ�"+name+",װ����"+zhuangbei+"�������ͣ�"+type+",Ƥ����"+pfname+"���˺�ֵ"+heat);
}
	//������Ķ�����Ϣ
public void jineng(){
	System.out.println("����");
}
public void move(){
	System.out.println("MOVE");
}
public void pudong(){
	System.out.println("pudong");
}
}