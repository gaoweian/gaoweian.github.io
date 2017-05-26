import java.util.*;
public class TestIterator{
	public static void main(String[] args){
		
		Collection books = new HashSet();
		books.add("轻量级J2EE 企业应用实战");
		books.add("Struts2 权威指南");
		books.add("基于J2EE的Ajax");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			//t.next()//方法返回的数据类型是Object类型，需要强制类型转换
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("Struts2 权威指南")){
				//从集合中删除上一次next 方法返回类型的元素
				it.remove();
			}
			//对book 变量赋值，不会改变集合元素本身
			book = "测试字符串";//1
		}
		System.out.println(books);
	}
}