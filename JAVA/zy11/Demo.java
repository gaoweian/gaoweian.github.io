//ʵ��1���ڲ���Ļ����ṹ
//�ⲿ��
/*class Out{
	private int age = 12;
	class In{
		public void print(){
			System.out.println("���䣺"+age);
		}
	}
}
public class Demo{
	public static void main(String[] args){
		Out.In in = new Out().new In();
		in.print();
		//���߲������ַ�ʽ����
		/*Out1 out = new Out1();
		Out1.In1 in = out.new In1();
		in.print();*/
	//}
//}*/
//ʵ��2���ڲ����еı���������ʽ
/*class Out {
    private int age = 12;
     
    class In {
        private int age = 13;
        public void print() {
            int age = 14;
            System.out.println("�ֲ�������" + age);
            System.out.println("�ڲ��������" + this.age);
            System.out.println("�ⲿ�������" + Out.this.age);
        }
    }
}
 
public class Demo {
    public static void main(String[] args) {
        Out.In in = new Out().new In();
        in.print();
    }
}*/
//ʵ��3����̬�ڲ���
/*class Out {
    private static int age = 12;
     
    static class In {
        public void print() {
            System.out.println("���䣺"+age);
        }
    }
}
 
public class Demo {
    public static void main(String[] args) {
        Out.In in = new Out.In();
        in.print();
    }
}*/
//ʵ��4�������ڲ���
class Out {
    private int age = 12;
 
    public void Print(final int x) {
        class In {
            public void inPrint() {
                System.out.println(x);
                System.out.println("���䣺"+age);
            }
        }
        new In().inPrint();
    }
}
 
public class Demo {
    public static void main(String[] args) {
        Out out = new Out();
        out.Print(3);
    }
}
