import java.util.*;

public class HashSetDemo {
  public static void main(String args[]) {
    //����һ������
	HashSet set = new HashSet();
	//���������������
    set.add("Bernadine");
    set.add("Elizabeth");
    set.add("Gene");
    set.add("Elizabeth");
    set.add("Clara");
    //set.add(123);
   // set.add(0.23);
   // set.add(new circle(3));
	//3.���������Ԫ��
    System.out.println(set);
    TreeSet sortedSet = new TreeSet(set);
   System.out.println(sortedSet);
  }
}