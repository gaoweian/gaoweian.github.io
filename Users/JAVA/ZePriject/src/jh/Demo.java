package jh;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Set set = new TreeSet();
		//���������������
	    set.add(new Student("����",20,80));
	    set.add(new Student("����",19,90));
	    set.add(new Student("����",28,80));
	    set.add(new Student("����",22,71));
		Iterator it = set.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+","+s.getAge()+","+s.getGrade());
			//System.out.println(it.next());
		}
	}

}
