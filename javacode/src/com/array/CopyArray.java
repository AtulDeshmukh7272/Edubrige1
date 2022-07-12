package com.array;



public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6};
		int temp;
		int arr1[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			temp = arr[i];
			arr1[i]= temp;
			arr[i]++;
		}
		for(int j=0 ; j<= arr1.length; j++)
		{
			System.out.print("Element of Second array " + arr1[j]);
		}
		

	}

}
