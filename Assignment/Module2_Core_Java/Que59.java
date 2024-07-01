package Module2_Core_Java;

import java.util.HashSet;

//Write a Java program to append the specified element to the end of a hash set

public class Que59 {

	public static void main(String[] args) {
		
		 // Create a new HashSet of Strings
        HashSet<String> hashSet = new HashSet<>();
        
        // Add some initial elements to the HashSet
        hashSet.add("Java");
        hashSet.add("Flutter");
        hashSet.add("Python");
        hashSet.add("Javascript");
        
        // Element to be appended
        String newElement = "PHP";
        
        // Append the specified element to the end of the HashSet
        hashSet.add(newElement);
        
        // Display the HashSet elements
        for (String element : hashSet) {
            System.out.println(element);
        }
        
        
        
	}
	
}
