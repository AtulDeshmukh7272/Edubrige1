package com.Exception;




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {

	public static void main(String[] args) {
		
	  
		try(BufferedReader br=new BufferedReader(new FileReader(""))) 
		{
			
			
			String line=null;
			
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}

}
