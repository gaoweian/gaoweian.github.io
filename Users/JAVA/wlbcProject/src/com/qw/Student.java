package com.qw;

import java.io.Serializable;

public class Student implements Serializable{  
	private String name;  
	private String neirong;  
	 
	
	public Student(String name, String neirong) {
		
			this.name = name;  
			this.neirong = neirong;  
		
	}
	public void setName(String name)  {  
		this.name = name;  
	}  
	public void setAge(String neirong)  {  
 		this.neirong = neirong;  
 	}  
	public String getName()  {  
 		return this.name;  
 	}  
	public String getNeirong(){  
 		return this.neirong;  
 	}
	public  String toString(){
		return name+":"+neirong;
	}
}  

