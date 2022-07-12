package com.Threading;

class Thread1 extends Thread
{
    Thread1(String threadName, ThreadGroup group)
    {
        super(group,threadName);
        start();
    }
    
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.print(i+" ");
        }
        
    }
    
}

class Thread2 extends Thread
{
    Thread2(String threadName, ThreadGroup group)
    {
        super(group,threadName);
        start();
    }
    
    public void run()
    {
        for(int i=100;i>=1;i--)
        {
            System.out.print(i+" ");
        }
        
    }
    
}

public class ThreadGroupExercise {

    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("printing group");
        
        Thread1 t1=new Thread1("1to100",tg);
        try {
            t1.join();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        Thread2 t2=new Thread2("100to1",tg);
    }

}
