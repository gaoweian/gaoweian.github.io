public class S{
	public static void main(String[] args){
		Ishool sc = new teacherImpl();
		sc.study();
		Ishool sc1 = new studentImpl();
		sc1.study();
	}	
}
//����ӿ�
class B{
}
interface Ishool{
	public static final String NAME="С��";
	public abstract void study();//����������
}
interface IA extends Ishool{
}
class teacherImpl extends B implements Ishool,IA{
	public void study(){
		System.out.println("�̿�"+NAME);
	}
}
class studentImpl implements Ishool{
	public void study(){
		System.out.println("�Ͽ�"+NAME);
	}
}
//interface  //����ӿ�
//implements //ʵ�ֽӿ�
//public     //������
//extends    //�̳�
//private    //˽�е�
//protected  //�ܱ����� 
//final      //���յ� 
//abstract   //��������

