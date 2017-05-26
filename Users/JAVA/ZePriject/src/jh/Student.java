package jh;

public class Student implements Comparable<Object>{
	
	
	String name;
	int age;
	int grade;
	
	public Student(String name,int age,int grade){
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	public  int getGrade(){
		return grade;
	}
	public  int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name=name;
	}
	public void setAge(){
		this.age=age;
	}
	public void setGrade(int grade){
		this.grade=grade;
		
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		if(this.grade>s.getGrade()){
			return 1;
		}
		if(this.grade==s.getGrade()){
			if(this.age>s.getAge()){
				return 1;
			}
			if(this.age>s.getAge()){
				return -1;
			}
			return 0;
			 
		}
		return -1;
	}
	public String toString(){
		return getName()+"\t"+getAge()+"\t"+getGrade();
	}
}
		
