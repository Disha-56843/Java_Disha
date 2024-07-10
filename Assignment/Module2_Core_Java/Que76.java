package Module2_Core_Java;

import java.util.HashMap;

//Write a Java program to get a collection view of the values contained in this map

public class Que76 {

	 public static void main(String[] args) 
	 {
		  
		  HashMap<Integer,String> hashmap= new HashMap<Integer,String>();  
		  hashmap.put(1,"Red");
		  hashmap.put(2,"Green");
		  hashmap.put(3,"Black");
		  hashmap.put(4,"White");
		  hashmap.put(5,"Blue");
		       
		   // checking collection view of the map
		   System.out.println("Collection view is: "+ hashmap.values());
	  }
	
}
