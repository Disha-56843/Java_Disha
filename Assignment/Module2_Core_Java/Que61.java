package Module2_Core_Java;

import java.util.HashSet;

//Write a Java program to get the number of elements in a hash set.

public class Que61 {
	
	 public static void main(String[] args) {
			HashSet<String> set = new HashSet<>();
			
			set.add("Purple");
			set.add("Red");
			set.add("Black");
			set.add("White");
			set.add("Violet");
			
			System.out.println("Original Hash set: " + set);
			System.out.println("Size of the above hash set is: " + set.size());
		  }

}
