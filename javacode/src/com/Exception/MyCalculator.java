package com.Exception;



import java.util.Scanner;

public class MyCalculator {
	
	
	public long power(int a,int b) throws Exception {
		
		if(a==0|| b==0)
			throw new Exception("n and p should not be zero");
		else if(a < 0 || b < 0)
			throw new Exception("n and p should not be zero");
		else
			return (long) (Math.pow(a, b));
	}
	
	public static void main(String[] srgs) throws Exception {
		MyCalculator myc = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of  N and P");
		int n= sc.nextInt();
		int p=sc.nextInt();
		System.out.print(myc.power(n,p));
	}

}
