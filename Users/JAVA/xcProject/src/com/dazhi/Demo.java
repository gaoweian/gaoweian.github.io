package com.dazhi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ʹ��Callable�ӿڷ�ʽ�������߳� 
 */
/*
 
public class Demo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //1�������߳�
        ExecutorService ser = Executors.newFixedThreadPool(2);//�������߳�

        Race tortoise = new Race("���ڹ�",1000);
        Race rabbit = new Race("С����",500); 

        //2����ȡFuture����
        Future<Integer> result1 = ser.submit(tortoise);
        Future<Integer> result2 = ser.submit(rabbit);

        Thread.sleep(2000);//2��
        tortoise.setFlag(false);//ֹͣ�߳���ѭ�� ����flag = false;
        rabbit.setFlag(false);
        //3����ȡֵ
        int num1 = result1.get();
        int num2 = result2.get();

        System.out.println("�ڹ�����-->"+num1+"��");
        System.out.println("��������-->"+num2+"��");
        //4��ֹͣ����
        ser.shutdownNow();
    }
}

class Race implements Callable<Integer>
{
    private String name;//����
    private long time;//��ʱʱ��
    private boolean flag = true;
    private int step = 0;//��

    public Race() {
    }   
    public Race(String name) {
        super();
        this.name = name;
    }
    public Race(String name, int time) {
        super();
        this.name = name;
        this.time = time;
    }

    //�з���ֵ��
    @Override
    public Integer call() throws Exception {
        while(flag){
            Thread.sleep(time);//��ʱ
            step++;
        }
        return step;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getTime() {
        return time;
    }
    public void setTime(long  time) {
        this.time = time;
    }
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public int getStep() {
        return step;
    }
    public void setStep(int step) {
        this.step = step;
    }
}
*/

/**
 * ģ���������
 * 1���������̣߳���ʽһ�����̳� Thread + ��дrun�������߳��壩
 * 2��ʹ���̣߳������������  + ����.start()����  �߳�����
 */
/*
public class Demo {

    public static void main(String[] args) {
        //�����������
        Rabbit rab = new Rabbit();
        Tortoise tor = new Tortoise();  
        //����start���� �������̡߳� �ڲ���CPU�ܿ�
        rab.start(); //��Ҫ����run���������ڲ��Լ����á�
        tor.start();        
        for(int i=0;i<30;i++)
        {
            System.out.println("main-->"+i);                
        }
    }
}

class Rabbit extends Thread{
    //�߳���  һ�д�run��ʼ
    @Override
    public void run() {
        //�߳���
        for(int i=0;i<30;i++)
        {
                System.out.println("��������"+i+"��");               
        }
    }

}

class Tortoise extends Thread
{
    @Override
    public void run() {
        //�߳���
        for(int i=0;i<30;i++)
        {
                System.out.println("�ڹ�����"+i+"��");               
        }
    }
}
*/

