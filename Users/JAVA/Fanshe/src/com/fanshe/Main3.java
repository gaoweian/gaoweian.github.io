package com.fanshe;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main3 implements Serializable{
	private static final long ID = 12312313;
	public static void main(String[] args) {
		try {
			Class<?> cla = Class.forName("com.fanshe.Main3");
			System.out.println("--------��������--------");
			//ȡ�ñ����ȫ������
			Field[] filed = cla.getDeclaredFields();
			for(int i=0;i<filed.length;i++){
				//Ȩ�����η�
				int mo = filed[i].getModifiers();
				String pr = Modifier.toString(mo);
				//��������
				Class<?> ty = filed[i].getType();
				System.out.println(pr+" "+ty.getName()+" "+filed[i].getName()+";");
			}
			System.out.println("--------ʵ�ֵĽӿڻ��߸��������--------");
			//ȡ��ʵ�ֵĻ��߸��������
			Field[] filed1 = cla.getFields();
			for(int j=0;j<filed1.length;j++){
				//Ȩ�����η�
				int mo = filed1[j].getModifiers();
				String pr = Modifier.toString(mo);
				//��������
				Class<?> ty = filed1[j].getType();
				System.out.println(pr+" "+ty.getName()+" "+filed1[j].getName()+";");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
