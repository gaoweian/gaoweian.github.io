package com.thread;
import java.util.*;
public class Demo {
	/*public static void main(String[] args) throws InterruptedException {  
	    for(int i=0;i<100;i++){  
	        System.out.println("main"+i);  
	        Thread.sleep(100);  
	    }  
	 }  */
	/* public static void main(String[] args) throws InterruptedException {  
	        System.out.println(Thread.currentThread().getName());  
	        Thread myThread=new Thread();  
	        myThread.start();  
	        myThread.sleep(1000);//这里sleep的就是main线程，而非myThread线程  
	        Thread.sleep(10);  
	        for(int i=0;i<100;i++){  
	            System.out.println("main"+i);  
	        }  
	    }  */
	/*public static void main(String[] args) throws InterruptedException {  
        new MyThread().start();  
        new MyThread().start();  
    }  
}  
  
class MyThread extends Thread {  
    @Override  
    public void run() {  
        for (int i = 0; i < 3; i++) {  
            System.out.println(this.getName()+"线程" + i + "次执行！");  
            try {  
                Thread.sleep(50);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    }  */
	 
	
}
