package com.array;


import java.util.*;
public class ArrayExisting {


	
	 
	public static void main(String[] args) {

	   int[] arr = {2,4,56,75,24,57,25,12,657,78};

	   
	   int pos = 2;
	   int val   = 5;
	

	  System.out.println("Old Array : "+Arrays.toString(arr));     
	   
	  for(int i=arr.length-1; i > pos; i--){
	    arr[i] = arr[i-1];
	   }
	   arr[pos] = val;
	   System.out.println("New Array: "+Arrays.toString(arr));
	 }
	 }

