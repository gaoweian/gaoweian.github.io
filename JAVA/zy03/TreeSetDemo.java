import java.util.*;

public class TreeSetDemo {
  public static void main(String args[]) {
    //创建一个对象
	Set set = new TreeSet();
	//向容器内添加数据
    set.add("Bernadine");
    set.add("Elizabeth");
    set.add("Gene");
    set.add("Elizabeth");
    set.add("Clara");
    //set.add(123);
    //set.add(0.23);
    System.out.println(set);
   
  }
}