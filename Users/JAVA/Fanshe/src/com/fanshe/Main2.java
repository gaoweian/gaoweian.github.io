package com.fanshe;

import java.lang.reflect.Constructor;
public class Main2{
	
	public static void main(String[] args) {
		try {
			Class<?> c = null;
			c = Class.forName("com.fanshe.User");
			
			User u = (User) c.newInstance();
			u.setAge(20);
			u.setName("Rollen");
			System.out.println(u);
			
			Constructor<?> con[] = c.getConstructors();
		
			for(int i=0;i<con.length;i++){
				Class<?> cl[] = con[i].getParameterTypes();
				System.out.println("con["+i+"](");
				for(int j=0;j<cl.length;j++){
					if(j==cl.length-1){
						System.out.println(cl[j].getName());
					}else{
						System.out.println(cl[j].getName()+",");
					}
					System.out.println(")");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	class User{
		private int age;
		private String name;
		public User(){
			super();
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
