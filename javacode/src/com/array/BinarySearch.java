package com.array;



import java.util.Arrays;

public class BinarySearch {

	public static void main(String args[])
	{
		int ar[]= {12,3,98,67,56,90,71,77};
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
	    int key=56,flag=0,low,high,mid;
	    
	    low=0;
	    high=ar.length-1;
	    
	    mid=(low+high)/2;
	    
	    while(low<=mid)
	    {
	    	if(key>ar[mid])
	    	{
	    		low=mid+1;
	    		
	    	}
	    	else if(key==ar[mid])
	    	{
	    		flag=1;
	    		System.out.println("Value present at "+ mid +"index");
	    		break;
	    	}
	    	else if(key<ar[mid])
	    	{
	    		high=mid-1;
	    	}
	    	
	    	mid=(low+high)/2;
	    	
	    }
	    
	    
	    if(flag==0)
	    {
	    	System.out.println("Value not found!!");
	    }
	}
}
