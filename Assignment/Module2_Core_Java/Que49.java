package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Iterator;

/* Write a Java program to create a new array list, add some colors (string) and print out
the collection. */

public class Que49 {

	public static void main(String[] args) {
		
		ArrayList <String> arrayList = new ArrayList<>();
		
    	arrayList.add("Purple");
		arrayList.add("Red");
    	arrayList.add("Black");
    	arrayList.add("White");
    	
    	Iterator i = arrayList.iterator();
    	
    	while(i.hasNext())
    	{
    		System.out.println(i.next());
    	}
		
	}
	
}
