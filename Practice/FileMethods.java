package Dtae20_06;

import java.io.File;

public class FileMethods {

	public static void main(String[] args) 
	{
		File file = new File("D://tops1.txt");
		getdetails(file);
		
	}

	private static void getdetails(File file) 
	{
		// TODO Auto-generated method stub
		System.out.println(file.exists());;
		System.out.println(file.isDirectory());;
		System.out.println(file.lastModified());;
		System.out.println(file.getName());;
		System.out.println(file.getAbsolutePath());;
		System.out.println(file.getPath());;
		System.out.println(file.canExecute());;
		System.out.println(file.canRead());;
	}
	
}
