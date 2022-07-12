package com.Exception;


public class EcxeptionTest {

    public static void main(String[] args) {
        
        int a=10,b=20;
        int ar[]= {12,45,67,89,99,34,67,90};
        String st="Akash";
        try
        {
        
            System.out.println(a/0);
            System.out.println(a+b);
            System.out.println(a);
            System.out.println(b);
            System.out.println(st.toLowerCase());
            
            
        }
        
        catch(ArithmeticException e)
        {
            
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)//Generalized Exception
        {
            System.out.println(e.getMessage());
        }
        finally
        {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        }
    }
}




