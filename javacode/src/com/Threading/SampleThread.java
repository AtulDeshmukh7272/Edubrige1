package com.Threading;

class MyThread extends Thread
{
    public void run()//thread body
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(i+",");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getId());
    }
}



public class SampleThread {

    public static void main(String[] args) {
        
        MyThread t=new MyThread();
        t.setName("Mythread");
        t.setPriority(10);
        t.start();
        

    }

}