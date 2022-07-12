package com.Threading;
class DThread extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
           System.out.println(getName()+" is daemon thread. ");
        }
        else
        {
            System.out.println(getName()+" is user thread. ");
        }
    }
    
}



public class DaemonThread {

    public static void main(String[] args) {
        
        DThread t1=new DThread();
        DThread t2=new DThread();
        DThread t3=new DThread();
        DThread t4=new DThread();
        
        t1.setDaemon(true);
        
        t1.start();
        
        
        t2.start();
        t3.start();
        
        t4.setDaemon(true);
        t4.start();

    }

}
