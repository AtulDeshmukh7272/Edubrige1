package com.Threading;

import java.util.Scanner;

//class Thread1 extends Thread
//{
//	 
//	
//
//	public Thread1(String threadName, ThreadGroup group) {
//		
//		 super(group,threadName);
//	        start();
//	}
//
//	public static boolean checkPrimeNo(int no){
//	        if (no<=1){
//	            return false;
//	        }
//	        for(int i=2;i<no;i++){
//	            if(no%i==0){
//	                return false;
//	            }
//	        }
//	        return true;
//	    } 
//    
//}
//
//class Thread2 extends Thread
//{
//	Thread2(String threadName, ThreadGroup group)
//    {
//        super(group,threadName);
//        start();
//    }
//	public void numberCheck(int num)
//	{
//		 if(num % 2 == 0)
//	            System.out.println(num + " is even");
//	        else
//	            System.out.println(num + " is odd");
//	}
//	
//	
//	
//}
//
//
//public class ThreadGroupNoCheck {
//
//    public static void main(String[] args) {
//        
//        ThreadGroup parent=new ThreadGroup("Group ABC");
//        
//        Thread1 t1=new Thread1("thread t1", parent);
//        Thread2 t2=new Thread2("thread t2", parent);
//        System.out.println(t1.checkPrimeNo(11));
//        t2.numberCheck(20);
//        
//        
//        System.out.print(parent.activeCount());
//
//
//    }
//}




class ThreadPrime extends Thread
{
    int number;
    public ThreadPrime(String name,ThreadGroup group,int n)
    {
        super(group, name);
        this.number=n;
        
    }
    
    public void run()
    {
        int c=0;
        for(int i=1;i<=this.number;i++)
        {
            if(this.number%i==0)
            {
                c=c+1;
            }
        }
        
        if(c==2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Non-prime number");
        }
    }
    
}

class ThreadOddEven extends Thread
{

    int number;
    public ThreadOddEven(String name,ThreadGroup group,int n)
    {
        super(group, name);
        this.number=n;
        
    }
    public void number(ThreadGroup group)
    {
    	System.out.println("Hello");
    	System.out.println(Thread.currentThread().getName());

    }
    public void run()
    {
        if(this.number%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    
}
public class ThreadGroupNoCheck {

    public static void main(String[] args) {
        
        ThreadGroup group=new ThreadGroup("Task1");
        Scanner scan=new Scanner(System.in); 
        System.out.println("Enter a  number:");
        int n=scan.nextInt();
        
        ThreadPrime t1=new ThreadPrime("Prime", group, n);
        t1.start();
        
        ThreadOddEven t2=new ThreadOddEven("OddEven", group, n);
        t2.start();
       
        
    }

}





