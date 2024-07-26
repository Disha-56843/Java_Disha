package Dtae20_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		String s ="welcome";
		FileOutputStream fout = new FileOutputStream("D://tops.txt");
		fout.write(s.getBytes());
		System.out.println("Success");
	
		
		Thread.sleep(2000);
		
		FileInputStream fin = new FileInputStream("D://tops.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		fin.close();
		fout.close();
	}
	
}
