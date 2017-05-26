//实例1：内部类的基本结构
//外部类
/*class Out{
	private int age = 12;
	class In{
		public void print(){
			System.out.println("年龄："+age);
		}
	}
}
public class Demo{
	public static void main(String[] args){
		Out.In in = new Out().new In();
		in.print();
		//或者采用下种方式访问
		/*Out1 out = new Out1();
		Out1.In1 in = out.new In1();
		in.print();*/
	//}
//}*/
//实例2：内部类中的变量访问形式
/*class Out {
    private int age = 12;
     
    class In {
        private int age = 13;
        public void print() {
            int age = 14;
            System.out.println("局部变量：" + age);
            System.out.println("内部类变量：" + this.age);
            System.out.println("外部类变量：" + Out.this.age);
        }
    }
}
 
public class Demo {
    public static void main(String[] args) {
        Out.In in = new Out().new In();
        in.print();
    }
}*/
//实例3：静态内部类
/*class Out {
    private static int age = 12;
     
    static class In {
        public void print() {
            System.out.println("年龄："+age);
        }
    }
}
 
public class Demo {
    public static void main(String[] args) {
        Out.In in = new Out.In();
        in.print();
    }
}*/
//实例4：方法内部类
class Out {
    private int age = 12;
 
    public void Print(final int x) {
        class In {
            public void inPrint() {
                System.out.println(x);
                System.out.println("年龄："+age);
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
