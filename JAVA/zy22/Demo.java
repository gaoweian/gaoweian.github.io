
import java.io.*;


public class Demo {
	
	public static void main(String[] args) {
		File file = new File("F:/JAVA/text.txt");
		if(!file.exists()){
			try {	
				file.createNewFile();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		int a=(int)file.length();
		new Thread(new Xc(0,a*1/3,file)).start();
		new Thread(new Xc(a*1/3,a*1/3,file)).start();
		new Thread(new Xc(a*2/3,a,file)).start();
	}
}
