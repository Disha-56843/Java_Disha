package Module2_Core_Java;

import java.util.ArrayList;

//Write a Java program to insert an element into the array list at the first position.

public class Que51 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Flutter");
		arrayList.add("Python");
		
		System.out.println("Original Array List: " + arrayList);
		
		String newElement = "PHP";
		arrayList.add(0, newElement);
		
		System.out.println("Array List after inserting new element at the first position: " + arrayList);
		
	}
	
}
