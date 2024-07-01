package Module2_Core_Java;

import java.util.ArrayList;

// Write a Java program to iterate through all elements in an array list. 

public class Que50 {

	public static void main(String[] args) {
	
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Flutter");
		arrayList.add("Python");
		
		System.out.println("Original Array List: " + arrayList);
		
		arrayList.add("PHP");
		
		System.out.println("Array List after inserting new element at the first position: " + arrayList);
		
	}

}
