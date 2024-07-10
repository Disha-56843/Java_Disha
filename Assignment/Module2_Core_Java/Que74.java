package Module2_Core_Java;

import java.util.ArrayList;

/* Write a Java program to print all the elements of an Array List using the position of
the elements. */

public class Que74 {
	
	public static void main(String[] args) {
		
		 ArrayList <String> arraylist = new ArrayList <String> ();
		 	
		 arraylist.add("Java");
		 arraylist.add("Php");
		 arraylist.add("Android");
		 arraylist.add("Flutter");
		  
		  System.out.println("\nOriginal array list: " + arraylist);
		  
		  System.out.println("\nPrint using index of an element: ");
		  int no_of_elements = arraylist.size();
		  for (int index = 0; index < no_of_elements; index++)
		   System.out.println(arraylist.get(index));
		
	}

}
