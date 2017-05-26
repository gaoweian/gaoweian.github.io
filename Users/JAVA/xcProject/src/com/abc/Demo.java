package com.abc;


/*public class Demo extends Thread{  
    int i = 0;  
    //��дrun������run�����ķ���������ֳ�ִ����  
    public void run()  
    {  
        for(;i<100;i++){  
        System.out.println(getName()+"  "+i);  
          
        }  
    }  
    public static void main(String[] args)  
    {  
        for(int i = 0;i< 100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+"  : "+i);  
            if(i==20)  
            {  
                new Demo().start();  
                new Demo().start();  
            }  
        }  
    }  
  
} */


/*public class Demo implements Runnable  
{  
  
    private int i;  
    public void run()  
    {  
        for(i = 0;i <100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" "+i);  
        }  
    }  
    public static void main(String[] args)  
    {  
        for(int i = 0;i < 100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" "+i);  
            if(i==20)  
            {  
                Demo rtt = new Demo();  
                new Thread(rtt,"���߳�1").start();  
                new Thread(rtt,"���߳�2").start();  
            }  
        }  
  
    }  
  
}  */


import java.util.concurrent.Callable;  
import java.util.concurrent.ExecutionException;  
import java.util.concurrent.FutureTask;  
  
public class Demo implements Callable<Integer>  
{  
  
    public static void main(String[] args)  
    {  
        Demo ctt = new Demo();  
        FutureTask<Integer> ft = new FutureTask<>(ctt);  
        for(int i = 0;i < 100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" ��ѭ������i��ֵ"+i);  
            if(i==20)  
            {  
                new Thread(ft,"�з���ֵ���߳�").start();  
            }  
        }  
        try  
        {  
            System.out.println("���̵߳ķ���ֵ��"+ft.get());  
        } catch (InterruptedException e)  
        {  
            e.printStackTrace();  
        } catch (ExecutionException e)  
        {  
            e.printStackTrace();  
        }  
  
    }  
  
    @Override  
    public Integer call() throws Exception  
    {  
        int i = 0;  
        for(;i<100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" "+i);  
        }  
        return i;  
    }  
  
}  

