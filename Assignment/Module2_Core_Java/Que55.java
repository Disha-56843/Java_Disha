package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to search an element in an array list.

public class Que55 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Flutter");
		arrayList.add("Python");
		arrayList.add("Javascript");
		
		 // Ask the user to input the element to search
        System.out.print("Enter the element to search: ");
        String elementToSearch = scanner.next();

        // Search for the element in the ArrayList
        if (arrayList.contains(elementToSearch)) {
            System.out.println("Element " + elementToSearch + " is found in the ArrayList.");
        } else {
            System.out.println("Element " + elementToSearch + " is not found in the ArrayList.");
        }

       
        scanner.close();
		
	}
	
}
