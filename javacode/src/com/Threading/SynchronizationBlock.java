package com.Threading;

class Multiplication//Shared Resource
{
    private int number;
    
     public void  table(int n)
    {
     synchronized(this)
     {
        for(int i=1;i<=10;i++)  //Critical Section
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
}

class Work1 extends Thread
{
    Multiplication m;
    
    Work1(Multiplication m)
    {
        this.m=m;
    }
    
    public void run()
    {
        m.table(4);
    }
    
}
class Work2 extends Thread
{

    Multiplication m;
    
    Work2(Multiplication m)
    {
        this.m=m;
    }
    
    public void run()
    {
        m.table(14);
    }
}


public class SynchronizationBlock {

    public static void main(String[] args) {
        
    	  Multiplication m=new Multiplication();
          
          Work1 t1=new Work1(m);
          Work2 t2=new Work2(m);
          
          t1.start();
          t2.start();
        
    }

}
