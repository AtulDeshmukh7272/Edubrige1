package com.String;

public class StringReverse {




    public static void main(String[] args) {
    String st="We love Java Programming";
    String array[]=st.split(" ");
    String rev="";
    
    for(int i=array.length-1;i>=0;i--)
    {
        rev=rev+array[i]+" ";
    }
    
    System.out.println(rev); 
    }

}




