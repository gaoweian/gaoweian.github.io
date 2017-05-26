import java.util.Scanner;
public class Js {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个数:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		System.out.println("请输入运算符号:");
		char d;
		d=sc.next().charAt(0);
	    if(d=='+') {
			c = a + b;
			System.out.println(c);
		} else if(d=='-'){
			c = a - b;
			System.out.println(c);
		} else if(d=='*'){
			c = a * b;
			System.out.println(c);
		} else if(d=='/'){
			c = a / b;
			System.out.println(c);
		 }
	}
}