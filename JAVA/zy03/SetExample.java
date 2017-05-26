import java.util.*;

public class SetExample {
  public static void main(String args[]) {
    //创建一个对象
	Set set = new HashSet();
	//向容器内添加数据
    set.add("Bernadine");
    set.add("Elizabeth");
    set.add("Gene");
    set.add("Elizabeth");
    set.add("Clara");
    System.out.println(set);
    Set sortedSet = new TreeSet(set);
   System.out.println(sortedSet);
  }  
}