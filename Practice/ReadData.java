package Dtae20_06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) 
	{
		
		try 
		{
			FileInputStream in = new FileInputStream("D://dishajavaexp.txt");
			int i =0;
			
			while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		in.close();
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		
	}
	
}
