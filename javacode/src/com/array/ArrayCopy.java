package com.array;




import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int ar[]= {1,2,3,77,5,3,88,90};
		
		int ar1[]=ar; //shallow copy of the array
		
		ar[0]=12;
		
		
		int ar2[]=new int[ar.length];
		
		for(int i=0;i<ar.length;i++)//deep copy of the array
		{
			ar2[i]=ar[i];
		}
		
		ar[2]=88;
		
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		

	}

}

