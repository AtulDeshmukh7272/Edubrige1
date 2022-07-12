package com.array;






public class LinearSearch {
	
	public static void main(String args[])
	{
	
		
		int ar[]= {12,3,98,67,56,90,71,77,12};
		
	    int key=12,flag=0;
	    
	    for(int i=0;i<ar.length;i++)
	    {
	    	if(ar[i]==key)
	    	{
	    		flag=1;
	    		System.out.println("Value present at "+i+" index");
	    	}
	    }
	    
	    if(flag==0)
	    {
	    	System.out.println("Value not present!!");
	    }
	    
		
	}

}

