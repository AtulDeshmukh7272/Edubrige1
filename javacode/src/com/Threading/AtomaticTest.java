package com.Threading;
import java.util.concurrent.atomic.AtomicInteger;
//
//class Counter
//{
//    AtomicInteger count=new AtomicInteger(0);
//    
//    void increment()
//    {
//        count.getAndIncrement();
//    }
//    
//}
//
//class AtomicThread1 extends Thread
//{
//    public void run()
//    {
//        for(int i=1;i<=10;i++)
//        {
//            new Counter().increment();
//        }
//    }
//}
//
//
//class AtomicThread2 extends Thread
//{
//    public void run()
//    {
//        for(int i=1;i<=10;i++)
//        {
//            new Counter().increment();
//        }
//    }
//}
//
//
//public class AtomicTest {
//
//    public static void main(String[] args) {
//        
//        Counter c=new Counter();
//        
//        AtomicThread1 t1=new AtomicThread1();
//        AtomicThread2 t2=new AtomicThread2();
//        
//        t1.start(); 
//        t2.start();
//        
//        
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        
//        System.out.println(c.count);
//        
//        
//        
//
//    }
//
//}


//import java.util.concurrent.atomic.AtomicInteger;
//
//class Counter extends Thread {
// 
//
//    AtomicInteger count;
// 
//
//    Counter()
//    {
//        count = new AtomicInteger();
//    }
// 
// 
//    public void run()
//    {
// 
//  
//        for (int i = 0; i <10; i++) {
//            count.addAndGet(1);
//        }
//    }
//}
// 
//public class AtomicTest {
//    public static void main(String[] args)
//        throws InterruptedException
//    {
//        // Instance of Counter Class
//        Counter c = new Counter();
// 
//        // Defining Two different threads
//        Thread first = new Thread(c, "First");
//        Thread second = new Thread(c, "Second");
// 
//        // Threads start executing
//        first.start();
//        second.start();
// 
//        // main thread will wait for both
//        // threads to complete execution
//        first.join();
//        second.join();
// 
//        // Printing final value of count variable
//        System.out.println(c.count);
//    }
//}





//class Counter
//{
//    AtomicInteger count=new AtomicInteger();
//    
//    public void increment()
//    {
//        count.incrementAndGet();
//    }
//    
//}
//
//
//
//
//class AtomicTest {
//
//    public static void main(String[] args) {
//        
//        Counter c=new Counter();
//        
//        Thread t1=new Thread( 
//                
//                new Runnable() 
//                {                   
//                    @Override
//                    public void run() {
//                        for(int i=1;i<=10;i++)
//                        {
//                            c.increment();
//                        }
//                        
//                        
//                        
//                    }
//                });
//                
//            
//        Thread t2=new Thread( 
//                
//                new Runnable() 
//                {                   
//                    @Override
//                    public void run() {
//                        for(int i=1;i<=10;i++)
//                        {
//                            c.increment();
//                        }
//                    
//                    }
//                });
//        
//        t1.start(); 
//        t2.start();
//        
//        
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        
//        System.out.println(c.count);
//
//    }
//
//}




import java.util.concurrent.atomic.AtomicInteger;

class Counter
{
    AtomicInteger count=new AtomicInteger();
    
    public void increment()
    {
        count.incrementAndGet();
    }
    
}

class AtomicThread1 extends Thread
{
    Counter c;
    public AtomicThread1(Counter c)
    {
        this.c=c;
    }
        public void run() {
            for(int i=1;i<=10;i++)
            {
                c.increment();
            }
        
        }
    }
    
class AtomicThread2 extends Thread
{
    Counter c;
    public AtomicThread2(Counter c)
    {
        this.c=c;
    }
        public void run() {
            for(int i=1;i<=10;i++)
            {
                c.increment();
            }
        
        }
    }


class AtomicTest {

    public static void main(String[] args) {
        
        Counter c=new Counter();
        
        AtomicThread1 t1=new AtomicThread1(c); 
                
    
        AtomicThread2 t2=new AtomicThread2(c) ;
                

        t1.start(); 
        t2.start();
        
        
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(c.count);

    }

}

