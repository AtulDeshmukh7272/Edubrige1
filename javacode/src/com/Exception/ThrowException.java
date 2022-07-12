package com.Exception;


import java.io.IOException;

public class ThrowException {

    public void test() throws IOException
    {
        int ar[]= {12,45,67,89,90,76};
        if(ar[5]<100)
        {
            throw new IllegalArgumentException("Wrong data!!");
        }
        else
        {
            throw new IOException("Input output exception");
        }
    }
    
    
    public static void main(String[] args) {
        
        try
        {
            new ThrowException().test();
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e )
        {
            System.out.println(e.getMessage());
        }

    }

}

