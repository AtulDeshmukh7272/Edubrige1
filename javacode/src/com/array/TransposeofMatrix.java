package com.array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransposeofMatrix {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		   InputStreamReader in=new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(in);
	        int rows1,cols1;
	        
	        System.out.println("----- First Matrix -------");
	        
	        System.out.println("Enter number of rows:");
	        rows1=Integer.parseInt(br.readLine());
	        
	        System.out.println("Enter number of columns:");
	        cols1=Integer.parseInt(br.readLine());
	        
	        int ar1[][]=new int[rows1][cols1];
	        
	        for(int i=0; i< rows1; i++)
	        {
	        	for(int j=0; j< cols1; j++)
	        	{
	        		System.out.print("Enter The Element "+"["+ i + "]" + "[" + j +"]");
	                ar1[i][j]=Integer.parseInt(br.readLine());

	        	}
	        }
	        for(int i=0; i< cols1;i++)
	        {
	        	for(int j=0; j< rows1; j++)
	        	{
	        		System.out.print(ar1[j][i]);
	        	}
	        	System.out.println("   ");
	        }
	        
	        
//	        InputStreamReader in=new InputStreamReader(System.in);
//	        BufferedReader br=new BufferedReader(in);
//	        int rows,cols;
//	        
//	        System.out.println("----- First Matrix -------");
//	        
//	        System.out.println("Enter number of rows:");
//	        rows=Integer.parseInt(br.readLine());
//	        
//	        System.out.println("Enter number of columns:");
//	        cols=Integer.parseInt(br.readLine());
//	        
//	        int ar1[][]=new int[rows][cols];
//	        
//	        for(int i=0;i<rows;i++)
//	        {
//	            for(int j=0;j<cols;j++)
//	            {
//	                System.out.println("Enter element at ["+i+"]"+"["+j+"]="+"position:");
//	                ar1[i][j]=Integer.parseInt(br.readLine());
//	            }
//	        }
//	        
//	        System.out.println("Actual Matrix:");
//
//	        for(int i=0;i<rows;i++)
//	        {
//	            for(int j=0;j<cols;j++)
//	            {
//	                System.out.print(ar1[i][j]+"\t");
//	                
//	            }
//	            System.out.println();
//	        }
//
//	        
//	        int transpose[][]=new int[rows][cols];
//	        System.out.println("Transpose form of the Matrix:");
//	        for(int i=0;i<rows;i++)
//	        {
//	            for(int j=0;j<cols;j++)
//	            {
//	                System.out.print(ar1[j][i]+"\t");
//	                transpose[i][j]=ar1[j][i];
//	            }
//	            System.out.println();
//	        }

	}

}
