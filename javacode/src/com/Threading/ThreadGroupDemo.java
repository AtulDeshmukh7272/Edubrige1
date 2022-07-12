package com.Threading;

class ThreadWork extends Thread
{
    
    ThreadWork(String threadName, ThreadGroup group)
    {
        super(group,threadName);
        start();
    }
    
    
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+":"+i);
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }
        }
    }
    
    
}



public class ThreadGroupDemo {

    public static void main(String[] args) {
        
        ThreadGroup parent=new ThreadGroup("Group ABC");
        
        ThreadWork t1=new ThreadWork("thread t1", parent);
        ThreadWork t2=new ThreadWork("thread t2", parent);
        System.out.print(parent.activeCount());
        
        

    }

}

