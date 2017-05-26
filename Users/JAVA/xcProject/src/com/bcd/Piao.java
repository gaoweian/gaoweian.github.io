package com.bcd;

public class Piao {
	private String name;
	private int number=50;
	public Piao(String name,int number){
		this.setName(name);
		this.setNumber(number);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
