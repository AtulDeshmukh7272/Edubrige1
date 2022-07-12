package com.array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(br.readLine());
        
        int ar[]=new int[size+1];
        
        
        for(int i=0;i<ar.length-1;i++)
        {
            System.out.println("Enter element at "+i+" index:");
            ar[i]=Integer.parseInt(br.readLine());
            
        }
        
        System.out.println("Enter the new element:");
        int element=Integer.parseInt(br.readLine());
        
        System.out.println("Enter the index location:");
        int index=Integer.parseInt(br.readLine());
        
        System.out.println(ar.length);
        
        for(int i=ar.length-1;i>=index;i--)
        {
            ar[i]=ar[i-1];
        }
        
        ar[index]=element;
        
        
        System.out.println(Arrays.toString(ar));

    }

}
