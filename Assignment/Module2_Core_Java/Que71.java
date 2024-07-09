package Module2_Core_Java;

import java.util.HashMap;

//Write a Java program to check whether a map contains key-value mappings (empty) or not.

public class Que71 {
	
	 public static void main(String[] args) 
	 {
		 
		   HashMap <Integer,String> hashmap = new HashMap <Integer,String> ();
		   hashmap.put(1, "Java");
		   hashmap.put(2, "PHP");
		   hashmap.put(3, "Android");
		   hashmap.put(4, "Flutter");
		   hashmap.put(5, "Python");
		  
		// Removing all the elements from the linked map
//		   hashmap.clear();
		   
		   // check the result
		   if(hashmap.isEmpty())
		   {
			   System.out.println("Hash map is empty");
		   }
		   else
		   {
			   System.out.println("Hash map is not empty"); 
			  
		   }
		  
		   
	}

}
