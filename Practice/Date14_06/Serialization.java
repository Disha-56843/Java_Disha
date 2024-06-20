package Date14_06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {


	public static void main(String[] args) throws IOException 
	{
		
		Employee s1 = new Employee(101,25000);
		FileOutputStream fout = new FileOutputStream("D://Dishajavaexp.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);//serialize
		out.writeObject(s1);
		System.out.println("success");
		
		
	}
	
	
}
