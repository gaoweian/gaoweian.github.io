import java.util.*;
public class SetDemo{
	public static void main(String[] args){
		//创建对象
		Set<String> s = new TreeSet<String>();
		//添加元素
		s.add("A");
		s.add("C");
		s.add("B");
		s.add("D");
		//返回s中的元素个数
		//System.out.println("s中的元素个数:"+s.size());
		//删除指定元素
		//s.remove("A");
		//清空所有元素
		//s.clear();
		//直接输出所有元素
		//System.out.println(s);
		//for-each遍历
		//for(String i:s){
		//	System.out.println(i);
		//}
		//迭代器
		Iterator  a  =  s.iterator();
		while(a.hasNext()){
			System.out.println(a.next());//自动排序
		}
	}
}