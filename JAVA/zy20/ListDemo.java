import java.util.*;
public class ListDemo{
	public static void main(String[] args){
		//��������
		List<String> l = new ArrayList<String>();
		//List<String> l = new LinkedList<String>();
		//����Ԫ��
		l.add("A");
		l.add("C");
		l.add("D");
		l.add("B");
		//����l�е�Ԫ�ظ���
		//System.out.println("l�е�Ԫ�ظ���:"+l.size());
		//
		System.out.println("��ȡ��0����������������:"+l.get(0));
		//ɾ��ָ��Ԫ��
		//l.remove("A");
		//�������Ԫ��
		//l.clear();
		//ֱ���������Ԫ��
		//System.out.println(l);
		//for-each����
		//for(String i:l){
		//	System.out.println(i);
		//}
		//������
		Iterator  a  =  l.iterator();
		while(a.hasNext()){
			System.out.println(a.next() );
		}
	}
}