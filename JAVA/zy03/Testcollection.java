import java.util.*;
public class Testcollection{
	public static void main(String[] args){
		List c = new ArrayList();
		//添加元素
		c.add("孙悟空");
		//虽然集合不能放基本数据类型，但Java支持自动装箱
		c.add(6);
		System.out.println("c是集合的元素个数为："+c.size());
		//删除指定元素
		c.remove(6);
		System.out.println("c是集合的元素个数为："+c.size());
		//判断是否包含指定字符串
		System.out.println("c是集合是否包含孙悟空字符串："+c.contains("孙悟空"));
		c.add("轻量级J2EE 企业应用实战");
		System.out.println("c集合的元素："+c);
		Collection books = new HashSet();
		books.add("轻量级J2EE 企业应用实战");
		books.add("Struts2 权威指南");
		System.out.println("c集合是否完全包含books集合?："+c.containsAll(books));
		//用c集合减去books集合里的元素
		c.removeAll(books);
		System.out.println("c集合的元素："+c);
		//删除c集合里的所有元素
		c.clear();
		System.out.println("c集合的元素："+c);
		//books集合里只剩下c集合里也同时包含的元素
		books.retainAll(c);
		System.out.println("books集合的元素："+books);
	}
}