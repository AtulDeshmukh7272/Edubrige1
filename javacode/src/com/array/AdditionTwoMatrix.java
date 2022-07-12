package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionTwoMatrix {

	


	    public static void main(String[] args) throws NumberFormatException, IOException {
	        InputStreamReader in=new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(in);
	        int rows1,cols1,rows2,cols2;
	        
	        System.out.println("----- First Matrix -------");
	        
	        System.out.println("Enter number of rows:");
	        rows1=Integer.parseInt(br.readLine());
	        
	        System.out.println("Enter number of columns:");
	        cols1=Integer.parseInt(br.readLine());
	        
	        int ar1[][]=new int[rows1][cols1];
	        
	        for(int i=0;i<rows1;i++)
	        {
	            for(int j=0;j<cols1;j++)
	            {
	                System.out.println("Enter element at ["+i+"]"+"["+j+"]="+"position:");
	                ar1[i][j]=Integer.parseInt(br.readLine());
	            }
	        }
	        
	        
	        
	        
	        System.out.println("----- Second Matrix -------");
	        
	        System.out.println("Enter number of rows:");
	        rows2=Integer.parseInt(br.readLine());
	        
	        System.out.println("Enter number of columns:");
	        cols2=Integer.parseInt(br.readLine());
	        
	        int ar2[][]=new int[rows2][cols2];
	        
	        for(int i=0;i<rows2;i++)
	        {
	            for(int j=0;j<cols2;j++)
	            {
	                System.out.println("Enter element at ["+i+"]"+"["+j+"]="+"position:");
	                ar2[i][j]=Integer.parseInt(br.readLine());
	            }
	        }
	        
	        System.out.println("First Matrix:");
	        for(int i=0;i<rows1;i++)
	        {
	            for(int j=0;j<cols1;j++)
	            {
	                System.out.print(ar1[i][j]+"\t");
	            
	            }
	            System.out.println();
	        }
	        
	        System.out.println("Second Matrix:");
	        for(int i=0;i<rows2;i++)
	        {
	            for(int j=0;j<cols2;j++)
	            {
	                System.out.print(ar2[i][j]+"\t");
	            
	            }
	            System.out.println();
	        }
	        
	        int result[][]=new int[rows1][cols1];
	        
	        
	        if((rows1==rows2)&&(cols1==cols2))
	        {
	        for(int i=0;i<rows1;i++)
	        {
	            for(int j=0;j<cols1;j++)
	            {
	                result[i][j]=ar1[i][j]+ar2[i][j];
	            
	            }
	            
	        }
	        
	        }
	        else
	        {
	            System.out.println("Operation can not be performed");
	        }
	        
	        System.out.println("Resultant Matrix:");
	        
	        for(int i=0;i<rows1;i++)
	        {
	            for(int j=0;j<cols1;j++)
	            {
	                System.out.print(result[i][j]+"\t");
	            
	            }
	            System.out.println();
	            
	        }
	        

	    }

	}
