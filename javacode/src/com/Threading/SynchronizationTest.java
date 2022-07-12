package com.Threading;

class MultiplicationTable //Shared Resource
{
    private int number;
    
    synchronized public void  table(int n)
    {

        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    
}

class ThreadFirst extends Thread
{
    MultiplicationTable m;
    
    ThreadFirst(MultiplicationTable m)
    {
        this.m=m;
    }
    
    public void run()
    {
        m.table(4);
    }
    
}
class SecondThread extends Thread
{

    MultiplicationTable m;
    
    SecondThread(MultiplicationTable m)
    {
        this.m=m;
    }
    
    public void run()
    {
        m.table(14);
    }
}


public class SynchronizationTest {

    public static void main(String[] args) {
        
        MultiplicationTable m=new MultiplicationTable();
        
        ThreadFirst t1=new ThreadFirst(m);
        SecondThread t2=new SecondThread(m);
        
        t1.start();
        t2.start();
        
    }

}

