package com.dazhi;
import java.io.*;
import java.util.*;
public class Demo {
	static Scanner sc = new Scanner(System.in);
	static File file = new File("F:/test.txt");//������̬���ļ�
	public static void main(String[] args) {
		
		if(!file.exists()){
			try {	
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		welcome();
	}//����Ŀ¼
		public static void welcome(){
			System.out.println("-------1.ע����Ϣ--------");
			System.out.println("-------2.��¼------------");
			System.out.println("-------3.�˳�------------");
			
			int a=sc.nextInt();
			switch(a){
				case 1:
					say();
					break;
				case 2:
					bijiao();
					break;
				case 3:
					System.exit(0);
			}
			
		}
		//ע����Ϣ
		public static void say(){
			//�û����������
			String userInput="";
			System.out.println("����������:");
			userInput=sc.nextLine();
			//�ȶ�ȡԭ���ļ�������
			StringBuffer s = new StringBuffer();
			int len;
			byte[] b = new byte[1024];
			FileInputStream f = null;
			try {
				f = new FileInputStream(file);
				while((len = f.read(b))!=-1){
					s.append(new String(b,0,len));
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}finally{
				if(f!=null){
					try {
						f.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			//ԭ���ļ�������
			String oldcontext = s.toString();
			String w = "";
			if("".equals(oldcontext)){
				w = userInput+"\n";
			}else{
				w = oldcontext+userInput+"\n";
			}
			
			//д��
			FileWriter fi = null;		
			try {
				fi = new FileWriter(userInput);
				fi.write(w);
			} catch (IOException e) {
				e.printStackTrace();
			}finally{			
				if(fi!=null){
					try {
						fi.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			bijiao();
		}
		//��¼�ȽϷ���
		public static void bijiao(){//��¼�ȽϷ���
			Properties p = new Properties();
			try{
			p.load(new FileInputStream("F:/test.txt"));
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("�������û���");
			String name = sc.next();
			System.out.println("����������");
			String ps = sc.next();
			if(name.equals(p.getProperty("username"))&& ps.equals(p.getProperty("password"))){
				System.out.println("��½�ɹ�");
			}else{
				System.out.println("��¼ʧ��");
			}
		}
	}

