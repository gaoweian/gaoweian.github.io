/**
���壺ö�پ���Ҫ�ø������͵ı�����ȡֵֻ��Ϊ���ɸ��̶�ֵ��һ����
����������ͻᱨ��
ö�ٿ����ñ������ڱ���ʱ�Ϳ��Կ��Ƴ��򸳸��ķǷ�ֵ��
ʹ����ͨ�����ķ�ʽ�޷�ʵ����һĿ��
��Դ����jdk1.5֮��ʹ�ùؼ���enum�����һ�������ͣ���Ϊö����

*/
public class  EnumDemo2{
	public static void main(String[] args){
		EnumController oce = EnumController.ON;
		System.out.println(oce);
		System.out.println( oce.ON.ordinal());// ����ö��ʵ����ö�����е�����,��0��ʼ;
		EnumController[] es = oce.values();//���ظ�ö�������ж�����ɵ�����
		for(int i = 0;i<es.length;i++){
			System.out.println(es[i]);
		}
		
	}
}

enum EnumController{
	ON,OFF
}
/**
ʹ��enum�ؼ��ֶ����ö���࣬���൱�ڶ�����һ���࣬����̳���Enum�����
Enum�ඨ����һ�·���  
String name();// ����ö��ʵ������;
	int ordinal();// ����ö��ʵ����ö�����е�����,��0��ʼ;
	String toString();// ����ö�ٶ����"��������";(��Դ����)

*/

