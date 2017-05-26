package com.hij;

public class Producter implements Runnable{
	private Storage storage;
	private int number;
	public Producter(Storage storage,int number){
		this.storage = storage;
		this.number = number;
	}
	public void run() {
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			storage.push(number);
		}
	}
}
