package com.String;







import java.util.Scanner;

public class CapialAndSamall {

	    public static void main(String[] args) {
	        
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter any string:");
	        String st=scan.nextLine();
	        int v=0,c=0,l=0,u=0,d=0,s=0,sp=0;
	        
	        for(int i=0;i<st.length();i++)
	        {
	            if(st.charAt(i)=='a'||st.charAt(i)=='A'||st.charAt(i)=='e'||st.charAt(i)=='E'||st.charAt(i)=='i'||st.charAt(i)=='I'||st.charAt(i)=='o'||st.charAt(i)=='O'||st.charAt(i)=='u'||st.charAt(i)=='U')
	            {
	               v=v+1;   
	            }
	            else if((st.charAt(i)>='a' && st.charAt(i)<='z')||(st.charAt(i)>='A' && st.charAt(i)<='Z'))
	            {
	                c=c+1;
	            }
	            else if(st.charAt(i)>='0' && st.charAt(i)<='9')
	            {
	                d=d+1;
	            }
	            else if(st.charAt(i)==' ')
	            {
	                s=s+1;
	            }
	            else
	            {
	                sp=sp+1;
	            }
	        }
	        for(int i=0;i<st.length();i++)
	        {
	            if((st.charAt(i)>='A' && st.charAt(i)<='Z'))
	            {
	                u=u+1;
	            }
	            else if((st.charAt(i)>='a' && st.charAt(i)<='z'))
	            {
	                l=l+1;
	            }
	        }
	        
	        
	        
	        System.out.println("Vowels="+v);
	        System.out.println("Consonants="+c);
	        System.out.println("Lower case Alphabets="+l);
	        System.out.println("Upper case Alphabets="+u);
	        System.out.println("Digits="+d);
	        System.out.println("Blanks="+s);
	        System.out.println("Special="+sp);

	    }

	}


