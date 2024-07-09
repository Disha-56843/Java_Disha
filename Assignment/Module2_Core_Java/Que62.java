package Module2_Core_Java;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to associate the specified value with the specified key in a Hash Map.

public class Que62 {

	 public static void main(String[] args)
	 {
	
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
			
		 	map.put(1, " Java");
			map.put(2, " Python");
			map.put(3, " Flutter");
			map.put(4, " PHP");
			
			System.out.println(map);
			
			for(Map.Entry m : map.entrySet())
			{
				System.out.println(m.getKey()+ " " +m.getValue());
			}
		}
	
	 
}
