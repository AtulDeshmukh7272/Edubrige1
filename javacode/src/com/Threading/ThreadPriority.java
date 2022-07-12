package com.Threading;

class ThreadDemo1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1:"+Thread.currentThread().getPriority());
    }
}

class ThreadDemo2 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2:"+Thread.currentThread().getPriority());
    }
}

class ThreadDemo3 extends Thread
{
    public void run()
    {
        System.out.println("Thread 3:"+Thread.currentThread().getPriority());
    }
}


class ThreadDemo4 extends Thread
{
    public void run()
    {
        System.out.println("Thread 4:"+Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {

    public static void main(String[] args) {
      ThreadDemo1 t1=new ThreadDemo1();
      ThreadDemo2 t2=new ThreadDemo2();
      ThreadDemo3 t3=new ThreadDemo3();
      ThreadDemo4 t4=new ThreadDemo4();
      
      t1.setPriority(Thread.NORM_PRIORITY);
      t2.setPriority(Thread.MAX_PRIORITY);
      t3.setPriority(Thread.MIN_PRIORITY);
      t4.setPriority(Thread.MAX_PRIORITY);
      
      t1.start();
      t2.start();
      t3.start();
      t4.start();
    }

}