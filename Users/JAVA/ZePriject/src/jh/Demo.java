package jh;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Set set = new TreeSet();
		//向容器内添加数据
	    set.add(new Student("张三",20,80));
	    set.add(new Student("李四",19,90));
	    set.add(new Student("王五",28,80));
	    set.add(new Student("赵六",22,71));
		Iterator it = set.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+","+s.getAge()+","+s.getGrade());
			//System.out.println(it.next());
		}
	}

}
