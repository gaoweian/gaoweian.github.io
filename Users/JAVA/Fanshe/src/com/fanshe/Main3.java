package com.fanshe;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main3 implements Serializable{
	private static final long ID = 12312313;
	public static void main(String[] args) {
		try {
			Class<?> cla = Class.forName("com.fanshe.Main3");
			System.out.println("--------本类属性--------");
			//取得本类的全部属性
			Field[] filed = cla.getDeclaredFields();
			for(int i=0;i<filed.length;i++){
				//权限修饰符
				int mo = filed[i].getModifiers();
				String pr = Modifier.toString(mo);
				//属性类型
				Class<?> ty = filed[i].getType();
				System.out.println(pr+" "+ty.getName()+" "+filed[i].getName()+";");
			}
			System.out.println("--------实现的接口或者父类的属性--------");
			//取得实现的或者父类的属性
			Field[] filed1 = cla.getFields();
			for(int j=0;j<filed1.length;j++){
				//权限修饰符
				int mo = filed1[j].getModifiers();
				String pr = Modifier.toString(mo);
				//属性类型
				Class<?> ty = filed1[j].getType();
				System.out.println(pr+" "+ty.getName()+" "+filed1[j].getName()+";");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
