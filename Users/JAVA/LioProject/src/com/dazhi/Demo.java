package com.dazhi;
import java.io.*;
import java.util.*;
public class Demo {
	static Scanner sc = new Scanner(System.in);
	static File file = new File("F:/test.txt");//创建静态的文件
	public static void main(String[] args) {
		
		if(!file.exists()){
			try {	
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		welcome();
	}//设置目录
		public static void welcome(){
			System.out.println("-------1.注册信息--------");
			System.out.println("-------2.登录------------");
			System.out.println("-------3.退出------------");
			
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
		//注册信息
		public static void say(){
			//用户输入的内容
			String userInput="";
			System.out.println("请输入内容:");
			userInput=sc.nextLine();
			//先读取原来文件的内容
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
			//原来文件的内容
			String oldcontext = s.toString();
			String w = "";
			if("".equals(oldcontext)){
				w = userInput+"\n";
			}else{
				w = oldcontext+userInput+"\n";
			}
			
			//写入
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
		//登录比较方法
		public static void bijiao(){//登录比较方法
			Properties p = new Properties();
			try{
			p.load(new FileInputStream("F:/test.txt"));
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("请输入用户名");
			String name = sc.next();
			System.out.println("请输入密码");
			String ps = sc.next();
			if(name.equals(p.getProperty("username"))&& ps.equals(p.getProperty("password"))){
				System.out.println("登陆成功");
			}else{
				System.out.println("登录失败");
			}
		}
	}

