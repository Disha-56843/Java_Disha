package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to retrieve an element (at a specified index) from a given array arrayList.

public class Que52 {

	public static void main(String[] args) {
		
		// Create an ArrayarrayList and add some elements
        ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the index
        System.out.print("Enter the index of the element you want to retrieve: ");
        int index = scanner.nextInt();

        // Check if the index is within the valid range
        if (index >= 0 && index < arrayList.size()) {
            // Retrieve and display the element at the specified index
            String element = arrayList.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            // Display an error message if the index is out of range
            System.out.println("Index out of range. Please enter a valid index.");
        }

        // Close the scanner
        scanner.close();
		
		
	}
	
}
