package com.Exception;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionType {
    public static void main(String[] args) {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        int input;
        
        try
        {
         input=Integer.parseInt(br.readLine());
         System.out.println(input/0);
        
        }
        
        catch(IOException | NumberFormatException e)
        {
            System.out.println(e.getCause());
            System.out.println(e.getClass().toString());
            System.out.println(e.getMessage());
        }
        
        
        
        catch (Exception e) 
        {
            System.out.println(e.getCause());
            System.out.println(e.getClass().toString());
            System.out.println(e.getMessage());
        }
        

    }
}


