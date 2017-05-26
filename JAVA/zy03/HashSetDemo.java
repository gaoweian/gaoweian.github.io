import java.util.*;

public class HashSetDemo {
  public static void main(String args[]) {
    //创建一个对象
	HashSet set = new HashSet();
	//向容器内添加数据
    set.add("Bernadine");
    set.add("Elizabeth");
    set.add("Gene");
    set.add("Elizabeth");
    set.add("Clara");
    //set.add(123);
   // set.add(0.23);
   // set.add(new circle(3));
	//3.输出容器的元素
    System.out.println(set);
    TreeSet sortedSet = new TreeSet(set);
   System.out.println(sortedSet);
  }
}