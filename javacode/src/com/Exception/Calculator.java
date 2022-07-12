package com.Exception;



import java.util.Scanner;

public class Calculator {

    public static final Calculator cal = new Calculator();
    public static final Scanner in = new Scanner(System.in);
	
    public long power(int n, int p) throws Exception{
        if(n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");
        else if(n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        else
            return (long)(Math.pow(n,p));
     }
	public static void main(String[] args) {
	    while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(cal.power(n, p));
            } 
            catch (Exception e) {
                System.out.println(e);
            }
	

	    }

	}
}

