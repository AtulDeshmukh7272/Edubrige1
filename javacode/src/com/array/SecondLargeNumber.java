package com.array;

public class SecondLargeNumber 
{
	public static void main(String[] args)
	{
	
	int arr[] = {324,456,12,42,34,57};
	int firstLargest = arr[0];
	int secondLarge = arr[0];
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>firstLargest)
		{	
			secondLarge = firstLargest;
			firstLargest= arr[i];
			
		}
		else if(secondLarge < arr[i])
		{
			secondLarge = arr[i];
		}
		

	}
	System.out.println(secondLarge);
	}
	
}
