import java.util.*;
public class TestIterator{
	public static void main(String[] args){
		
		Collection books = new HashSet();
		books.add("������J2EE ��ҵӦ��ʵս");
		books.add("Struts2 Ȩ��ָ��");
		books.add("����J2EE��Ajax");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			//t.next()//�������ص�����������Object���ͣ���Ҫǿ������ת��
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("Struts2 Ȩ��ָ��")){
				//�Ӽ�����ɾ����һ��next �����������͵�Ԫ��
				it.remove();
			}
			//��book ������ֵ������ı伯��Ԫ�ر���
			book = "�����ַ���";//1
		}
		System.out.println(books);
	}
}