package com.String;



import java.util.Scanner;



public class Palidrom
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String st=scan.nextLine();
        
        String  reverse="";
        
        for(int i=st.length()-1;i>=0;i--)
        {
            reverse=reverse+st.charAt(i);
        }

        if(st.equals(reverse))
        {
            System.out.println("It is a Palindrome String");
        }
        else
        {
            System.out.println("It is not a Palindrome String");
        }
    }
}
