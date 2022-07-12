package com.array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TwoDArray {

	

	

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        
	        InputStreamReader in=new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(in);
	        int rows,cols;
	        
	        System.out.println("Enter number of rows:");
	        rows=Integer.parseInt(br.readLine());
	        
	        System.out.println("Enter number of columns:");
	        cols=Integer.parseInt(br.readLine());
	        
	        int ar1[][]=new int[rows][cols];
	        
	        for(int i=0;i<rows;i++)
	        {
	            for(int j=0;j<cols;j++)
	            {
	                System.out.println("Enter element at ["+i+"]"+"["+j+"]="+"position:");
	                ar1[i][j]=Integer.parseInt(br.readLine());
	            }
	        }
	        

	        for(int i=0;i<rows;i++)
	        {
	            for(int j=0;j<cols;j++)
	            {
	                System.out.print(ar1[i][j]+"\t");
	            }
	            System.out.println();
	        }
	        
	        
	        int ar[][] = {{12,3,6},{4,8,9},{5,6,1}};
	        
	        for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<3;j++)
	            {
	                System.out.print(ar[i][j]+"\t");
	            }
	            System.out.println();
	        }

	    }

	}



