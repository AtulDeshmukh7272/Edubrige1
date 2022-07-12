package com.array;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckSymetricMatrix 
{


	    public static void main(String[] args) throws NumberFormatException, IOException {
	        InputStreamReader in=new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(in);
	        int rows,cols;
	        int flag=0;
	        System.out.println("----- First Matrix -------");
	        
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
	        
	        System.out.println("Actual Matrix:");

	        for(int i=0;i<rows;i++)
	        {
	            for(int j=0;j<cols;j++)
	            {
	                System.out.print(ar1[i][j]+"\t");
	                
	            }
	            System.out.println();
	        }

	        
	        int transpose[][]=new int[rows][cols];
	        System.out.println("Transpose form of the Matrix:");
	        for(int i=0;i<rows;i++)
	        {
	            for(int j=0;j<cols;j++)
	            {
	                System.out.print(ar1[j][i]+"\t");
	                transpose[i][j]=ar1[j][i];
	          
	            }
	            System.out.println();
	        }
	        
	        for(int i=0; i< rows; i++)
	        {
	        	for(int j=0; j<cols;j++)
	        	{
	        		if(ar1[i][j] != transpose[i][j])
	        		{
	        			flag=1;
	        			break;
	        		}
	        	}
	        }
	        if(flag==1)
	        {
        	System.out.print("Matrix is not  Symetric");

	        }
	        else
	        {
	        	System.out.print("Matrix is  Symetric");

	        }
	   

	}
	    
//	    InputStreamReader in=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(in);
//        int rows,cols;
//        
//        
//        
//        System.out.println("Enter number of rows:");
//        rows=Integer.parseInt(br.readLine());
//        
//        System.out.println("Enter number of columns:");
//        cols=Integer.parseInt(br.readLine());
//        
//        int ar1[][]=new int[rows][cols];
//        
//        for(int i=0;i<rows;i++)
//        {
//            for(int j=0;j<cols;j++)
//            {
//                System.out.println("Enter element at ["+i+"]"+"["+j+"]="+"position:");
//                ar1[i][j]=Integer.parseInt(br.readLine());
//            }
//        }
//        
//        
//        int transpose[][]=new int[rows][cols];
//        
//        
//        for(int i=0;i<rows;i++)
//        {
//            for(int j=0;j<cols;j++)
//            {
//                transpose[i][j]=ar1[j][i];
//            }
//        }
//        
//        int flag=0;
//        for(int i=0;i<rows;i++)
//        {
//            for(int j=0;j<cols;j++)
//            {
//                if(transpose[i][j]!=ar1[i][j])
//                {
//                    flag=1;
//                    break;
//                }
//                }
//            }
//        if(flag==1)
//        {
//            System.out.println("It is not a Symettric matrix");
//        }
//        else
//        {
//            System.out.println("It is a Symettric matrix");
//        }
//    
//    
//    
//        
//        
//    }

}

	




