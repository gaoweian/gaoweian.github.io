package com.dazhi;

public abstract class Car {	
	String name;
	int number;
	int weight;
	double price;
	public Car(String name,int number,int weight,double price){		
		this.name = name;
		this.number = number;
		this.weight = weight;
		this.price = price;
	}
	
	public  int getnumber() {
		
		return number;
	}
	public  int getweight() {
		
		return weight;
	}
	public  double getprice() {
		return  price;
	}
}
