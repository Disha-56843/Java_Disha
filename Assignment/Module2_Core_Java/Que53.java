package Module2_Core_Java;

import java.util.ArrayList;

//Write a Java program to update specific array element by given element.

public class Que53 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Flutter");
		arrayList.add("Python");
		
		System.out.println("Array List without any update in names: " + arrayList);
		
		// Updating the specific array element with different name
		
		arrayList.set(2, "PHP");
		
		System.out.println("Array List after updating the second index element: " + arrayList);
		
	}
	
}
