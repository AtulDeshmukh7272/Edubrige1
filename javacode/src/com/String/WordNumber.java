package com.String;


public class WordNumber {

	public static void main(String[] args) {
			String str =" Java programming is Easy to learn";
			
			
			
			
			        int count=0;
			        String st="Welcome to String programming";//String constant pool
			        String st1=new String("Welcome to String programming");//heap memory area
			        
			        String st3=st1.intern();
			        
			        for(int i=0;i<st.length();i++)//length of the string
			        {
			            System.out.print(st.charAt(i));//Retrieve a particular character from the string
			        }
			        
			        System.out.println(st.length());
			        
			        int spaces=0;
			        for(int i=0;i<st.length();i++)//length of the string
			        {
			            char ch=st1.charAt(i);
			            if(ch==' ')
			            {
			                spaces++;
			            }
			        }
			        
			        System.out.println("Number of blanks="+spaces);
			     
			        
			        for (int i = 0; i < str. length() - 1; i++) {
			        	if ((str. charAt(i) == ' ') && (str. charAt(i + 1) != ' ')) {
			        	count++; }
			        	} 
			        System. out. println("Number of words in a string : " + count);
				}
			        

			    }

			

			
	


