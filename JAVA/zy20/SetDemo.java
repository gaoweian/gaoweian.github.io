import java.util.*;
public class SetDemo{
	public static void main(String[] args){
		//��������
		Set<String> s = new TreeSet<String>();
		//���Ԫ��
		s.add("A");
		s.add("C");
		s.add("B");
		s.add("D");
		//����s�е�Ԫ�ظ���
		//System.out.println("s�е�Ԫ�ظ���:"+s.size());
		//ɾ��ָ��Ԫ��
		//s.remove("A");
		//�������Ԫ��
		//s.clear();
		//ֱ���������Ԫ��
		//System.out.println(s);
		//for-each����
		//for(String i:s){
		//	System.out.println(i);
		//}
		//������
		Iterator  a  =  s.iterator();
		while(a.hasNext()){
			System.out.println(a.next());//�Զ�����
		}
	}
}