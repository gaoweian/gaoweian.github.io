import java.util.Scanner;
public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
		System.out.println("�������������");
		String nr = sc.next();
		System.out.println("���������ź���");
		String haoma = sc.next();
		Dx dx = new Dx(nr);
		Ca ca = new Ca(haoma);
		Phone phone = new Phone(ca,dx);
		Ren ren = new Ren(phone);
		ren.callPhone();

	} 
}