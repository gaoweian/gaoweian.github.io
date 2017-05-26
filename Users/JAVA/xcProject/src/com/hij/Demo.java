package com.hij;

public class Demo {
	public static void main(String[] args) {
		//实例化仓库
		Storage storage = new Storage(0);
		//消费者
		Cousrtem cousrtem1 = new Cousrtem(storage, 10);
		Cousrtem cousrtem2 = new Cousrtem(storage, 70);
		Cousrtem cousrtem3 = new Cousrtem(storage, 40);
		//生产者
		Producter producter1 = new Producter(storage, 20);
		Producter producter2 = new Producter(storage, 80);
		Producter producter3 = new Producter(storage, 60);
		//运行消费者
		new Thread(cousrtem1).start();
		new Thread(cousrtem2).start();
		new Thread(cousrtem3).start();
		//运行生产者
		new Thread(producter1).start();
		new Thread(producter2).start();
		new Thread(producter3).start();
	}

}
