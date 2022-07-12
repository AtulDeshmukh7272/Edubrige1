package com.Exception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceClosingInFinally {

	public static void main(String[] args) {
		
		BufferedReader br=null;
		try
		{
			FileReader f=new FileReader("C:\\Users\\Sam\\OneDrive\\Desktop\\Test.txt");
			br=new BufferedReader(f);
			
			String line;
			
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		finally
		{
			if(br!=null)
			{
				try 
				{
					br.close();
				}
				catch (IOException e){
					
					e.printStackTrace();
				}
			}
		}
	}

}

