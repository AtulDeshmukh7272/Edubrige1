package com.Exception;




public class ExceptionPropagation {
    
    public void method1()
    {
        System.out.println("This is method1");
        int ar[]= {1,2,3,4,5};
        System.out.println(ar[7]);
    }
    
    public void method2()
    {
        System.out.println("This is method2");
        method1();  
    }
    
    public void method3()
    {
        System.out.println("This is method3");
        method2();
    }
    
    public static void main(String args[])
    {
        try
        {
        new ExceptionPropagation().method3();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }

}

