package Module2_Core_Java;

import java.util.ArrayList;

//Write a Java program to compare two array lists.

public class Que66 {
	
	public static boolean compareArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        // Check if the sizes of both lists are the same
        if (list1.size() != list2.size()) {
            return false;
        }

        // Check each element in both lists for equality
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        // If all elements are equal, return true
        return true;
    }
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		
		System.out.println("First list: " + list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Red");
		list2.add("Green");
		list2.add("Orange");
		list2.add("White");
	
		System.out.println("Second list: " + list2);
		
		 boolean areEqual = compareArrayLists(list1, list2);
	     System.out.println("Are the two array lists equal? :" + areEqual);
		
	}

}
