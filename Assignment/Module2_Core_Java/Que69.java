package Module2_Core_Java;

import java.util.HashSet;

//Write a Java program to convert a hash set to an array.

public class Que69 {
	
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("Android");
		set.add("Flutter");
		set.add("Python");
		
		System.out.println("Hash set: " + set);
		
		// Creating an array
		 String[] new_array = new String[set.size()];
		 
		 set.toArray(new_array);
		
		 // Displaying array elements
		 System.out.println("Array: ");
		  for(String list : new_array)
		  {
			  System.out.println(list);
		  }
	}

}
