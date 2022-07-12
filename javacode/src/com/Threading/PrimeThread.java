package com.Threading;

import java.util.Scanner;

class PrimeNumber extends Thread{  
	
	 public static boolean CheckPrimeNo(int no){
	        if (no<=1){
	            return false;
	        }
	        for(int i=2;i<no;i++){
	            if(no%i==0){
	                return false;
	            }
	        }
	        return true;
	    }
	  
} 
	  


public class PrimeThread 
{
	public static void main(String arg[]) {
		PrimeNumber p = new PrimeNumber();
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter thr number:");
		 int no= sc.nextInt();
		 System.out.println("number  is prime Number."+p.CheckPrimeNo(no));
		    p.start();
}
}