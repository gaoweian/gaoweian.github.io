//import java.util.Arrays;
//public class Px{
	//public static void main(String[] args){
		//int [] a = new int []{2,7,4,3,8,1,9,5,6,0};
		//排序
		//Arrays.sort(a);
		//for(int i=0;i<10;i++){
		//	System.out.print(a[i]+"\t");
		//}
		//System.out.print("\n");

		//在数组a中4这个数的位置
		//System.out.println(Arrays.binarySearch(a,4));
		//在数组a中从4到7之间5这个数，有显示位置
		//System.out.println(Arrays.binarySearch(a,4,7,5));

		//从a数组中复制前五个数到数组b中
		//int [] b = Arrays.copyOf(a,5);

		//int [] b = Arrays.copyOfRange(a,0,10);
		//for(int j:b){
		//	System.out.print(j);
		//}
		//System.out.print("\n");
		
		//如果两个数组长度相等和元素一一相等，则返回 true 
		//System.out.println(Arrays.equals(a,b));
		//Arrays.fill(a,1,4,7);
		//for(int p:a){
		//	System.out.print(p);
		//}

		//Arrays.sort(a,0,5);
		//for(int p:a){
		//	System.out.print(p+"\t");
		//}
		
		//数组元素之间用英文逗号或空格隔开
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
		
		//将a字符串转换为一个新的k字符数组
		//char[] k = a.toCharArray();
		//for(int i=0;i<a.length();i++){
			//System.out.println(k[i]);
		//}
		//for(int i:k){
		//	System.out.println(i);
		//}
		
		//将a字符串中的大写字母变换成小写
		/*String k =a.toLowerCase();
		System.out.println(k);*/

		//将a字符串中的小写字母变换成大写
		/*String k =a.toUpperCase();
		System.out.println(k);*/

		//返回指定索引处的 char 值
		/*System.out.println(a.charAt(5));*/
		
		//合并两个字符串
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
		
		//将字串c与字串d比较，返回值为boolean型
		//System.out.println(c.equals(d));

		//将此 String 与另一个 String 比较，不考虑大小写;
		//System.out.println(b.equalsIgnoreCase(c));

		//返回此字符串的哈希码
		//System.out.println(a.hashCode());
		
		//测定字串a是否以e结尾
		//System.out.println(a.endsWith("e"));
		
	
	
	}
}