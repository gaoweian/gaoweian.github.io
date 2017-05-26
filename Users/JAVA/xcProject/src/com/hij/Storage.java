package com.hij;
/**
 * 仓库类
 * */
public class Storage {
	private final static int MAX_SIZE = 100;//设置仓库最大存货量
	private int size;
	public Storage(int size){
		this.size= size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	//存货
	public synchronized void push(int number){
		if(getSize()+number<=MAX_SIZE){
			setSize(getSize()+number);
			System.out.println("生产了"+number+"当前库存为"+getSize());
		}else{
			System.out.println("库存已满，暂停生产，等待消费者消费");
			try {
				this.wait();//让想获取该对象锁的线程处于等待状态
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//通知消费者消费
		this.notifyAll();
	}
	//取货 
	public synchronized void pop(int number){
		if(getSize()-number<0){
			System.out.println("库存不足，等待生产者生产");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			setSize(getSize()-number);
			System.out.println("消费成功"+number+"个，当前库存"+getSize()+"个");
		}
		//通知消生产者生产
		this.notifyAll();
	}
}
