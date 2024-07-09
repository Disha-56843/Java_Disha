package Module2_Core_Java;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to count the number of key-value (size) mappings in a map.

public class Que63 {
	
	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, " Java");
		map.put(2, " Python");
		map.put(3, " Flutter");
		map.put(4, " PHP");
		map.put(5, " C#");
		
		for(Map.Entry x : map.entrySet())
		{
			System.out.println(x.getKey()+ " " +x.getValue());
		}

		
		System.out.println("Size of above Hash map is: " + map.size());
	 }

}
