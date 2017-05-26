import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class getProperties {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// 配置文件
		Properties pps = new Properties();
		pps.load(new FileInputStream("F:/sss.txt"));
		Enumeration enum1 = pps.propertyNames();
		while(enum1.hasMoreElements()){
			String strKey = (String) enum1.nextElement();
			String strValue = pps.getProperty(strKey);
			System.out.println(strKey+"="+strValue);
		}
	}

}
