package com.fanshe;

import java.io.Serializable;



public class Main implements Serializable{
	private static final long ID = 12312313;
	public static void main(String[] args){
		Main m = new Main();
		System.out.println(m.getClass().getName());//com.fanshe.Main
		
		try {
			Class<?> c1 = null;
			Class<?> c2 = null;
			Class<?> c3 = null;
			c1 = Class.forName("com.fanshe.Main");
			c2 = new Main().getClass();
			c3 = Main.class;
			System.out.println("������"+c1.getName());//������com.fanshe.Main
			System.out.println("������"+c2.getName());//������com.fanshe.Main
			System.out.println("������"+c3.getName());//������com.fanshe.Main
//			//������������û��getClass��������Ҳ�ж�Ӧ��Class����
//			Class<Integer> intc = int.class;
//			Class<Byte> bytec = byte.class;
//			Class<Character> charc = char.class;
//			Class<Double> doublec = double.class;
//			System.out.println(intc);//int
//			System.out.println(bytec);//byte
//			System.out.println(charc);//char
//			System.out.println(doublec);//double
//		
//			Class<Void> voidc = void.class;
//			System.out.println(voidc);//void
//				
//			Class<Main> mm = Main.class;
//			System.out.println(mm);//class com.fanshe.Main
//				//����
//			String[] s = new String[10];
//			int[][] t = new int[3][2];
//			int[] o = new int[10];
//			Class<? extends String[]> sc = s.getClass();
//			Class<? extends int[][]> tc = t.getClass();
//			Class<? extends int[]> oc = o.getClass();
//			System.out.println(sc);//class [Ljava.lang.String;
//			System.out.println(tc);//class [[I
//			System.out.println(oc);//class [I
//				//ö����Class����
//			Class<Size> e = Size.class;
//			System.out.println(e);
//				//��̬����forName,
//			Class<?> cl = Class.forName("java.util.HashMap");
//			System.out.println(cl.getName());
			
			Class<?> cla = Class.forName("com.fanshe.Main");
			//ȡ�ø���
			Class<?> p = cla.getSuperclass();
			System.out.println("cla�ĸ���Ϊ"+cla.getName());
			Class<?> inter[] = cla.getInterfaces();
			System.out.println("claʵ�ֽӿ��У�");
			for(int i=0;i<inter.length;i++){
				System.out.println((i+1)+":"+inter[i].getName());
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	enum Size {
//		SMALL, MEDIUM, BIG
//	}
}



