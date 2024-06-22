package Date14_06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException  
	{
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://Dishajavaexp.txt"));
		Employee e = (Employee) in.readObject();
		
		System.out.println(e.id+" "+e.salary);
	}

}
