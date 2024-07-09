package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program of swap two elements in an array list.

public class Que67 {
	
	// Function to swap two items in a list
    public static void swapElements(ArrayList<String> list, int position1, int position2) 
    {
        // Save the item at position1 in a temporary place
        String temp = list.get(position1);
        
        // Move the item at position2 to position1
        list.set(position1, list.get(position2));
        
        // Move the item in the temporary place to position2
        list.set(position2, temp);
    }
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("Given Arraylist: " + list);
		
		 // Swap the items at position 1 and position 3
        swapElements(list, 1, 3);
//        Swap two elements using collection
//		Collections.swap(list, 1, 3);
        
        // Show the list after swapping
        System.out.println("List after swapping: " + list);
		
	}

}
