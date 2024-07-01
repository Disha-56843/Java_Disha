package Module2_Core_Java;

import java.util.ArrayList;

//Write a Java program to remove the third element from an array list

public class Que54 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Flutter");
		arrayList.add("Python");
		arrayList.add("Javascript");
		
		System.out.println("Array List without any update in names: " + arrayList);
		
		// removing the third array element with different name
		
		arrayList.remove(2);
		
		System.out.println("Array List after updating the second index element: " + arrayList);
		
		
	}

}
