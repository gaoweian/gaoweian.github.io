//import java.util.Arrays;
//public class Px{
	//public static void main(String[] args){
		//int [] a = new int []{2,7,4,3,8,1,9,5,6,0};
		//����
		//Arrays.sort(a);
		//for(int i=0;i<10;i++){
		//	System.out.print(a[i]+"\t");
		//}
		//System.out.print("\n");

		//������a��4�������λ��
		//System.out.println(Arrays.binarySearch(a,4));
		//������a�д�4��7֮��5�����������ʾλ��
		//System.out.println(Arrays.binarySearch(a,4,7,5));

		//��a�����и���ǰ�����������b��
		//int [] b = Arrays.copyOf(a,5);

		//int [] b = Arrays.copyOfRange(a,0,10);
		//for(int j:b){
		//	System.out.print(j);
		//}
		//System.out.print("\n");
		
		//����������鳤����Ⱥ�Ԫ��һһ��ȣ��򷵻� true 
		//System.out.println(Arrays.equals(a,b));
		//Arrays.fill(a,1,4,7);
		//for(int p:a){
		//	System.out.print(p);
		//}

		//Arrays.sort(a,0,5);
		//for(int p:a){
		//	System.out.print(p+"\t");
		//}
		
		//����Ԫ��֮����Ӣ�Ķ��Ż�ո����
		//System.out.print(Arrays.toString(a));
			
	//}
//}


import java.util.*;
public class Px{
	public static void main(String[] args){
		String myname="gaoweian";
		System.out.println(myname);
		//System.out.println(myname.length());
		String a="QED23/.ee";
		String b="Rsdy34";
		String c="rsdy34";
		String d="llk1102";
		int[] e = {1,8,41,45,65,70};
		
		//System.out.println(a.charAt(3));
		//System.out.println(a.indexOf("w"));
		//a=a.replace("2","6");
		//System.out.println(a);
		
		//��a�ַ���ת��Ϊһ���µ�k�ַ�����
		//char[] k = a.toCharArray();
		//for(int i=0;i<a.length();i++){
			//System.out.println(k[i]);
		//}
		//for(int i:k){
		//	System.out.println(i);
		//}
		
		//��a�ַ����еĴ�д��ĸ�任��Сд
		/*String k =a.toLowerCase();
		System.out.println(k);*/

		//��a�ַ����е�Сд��ĸ�任�ɴ�д
		/*String k =a.toUpperCase();
		System.out.println(k);*/

		//����ָ���������� char ֵ
		/*System.out.println(a.charAt(5));*/
		
		//�ϲ������ַ���
		/*String c = a.concat(b);
		char[] h = new char[c.length()];*/
		/*for(int i=0;i<c.length();i++){
			h[i]=c.charAt(i);
			System.out.println(h[i]);
		}*/
		/*h = c.toCharArray();
		for(int i=0;i<c.length();i++){
			System.out.println(h[i]);
		}*/
		
		//���ִ�c���ִ�d�Ƚϣ�����ֵΪboolean��
		//System.out.println(c.equals(d));

		//���� String ����һ�� String �Ƚϣ������Ǵ�Сд;
		//System.out.println(b.equalsIgnoreCase(c));

		//���ش��ַ����Ĺ�ϣ��
		//System.out.println(a.hashCode());
		
		//�ⶨ�ִ�a�Ƿ���e��β
		//System.out.println(a.endsWith("e"));
		
	
	
	}
}