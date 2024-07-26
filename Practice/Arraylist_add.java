package Date29_06;

import java.util.ArrayList;

public class Arraylist_add {

		public static void main(String[] args) {
		
			ArrayList<String> arrayList = new ArrayList<>();
			
			arrayList.add("Java");
			arrayList.add("Flutter");
			arrayList.add("Python");
			
			System.out.println("Original Array List: " + arrayList);
			
			String newElement = "PHP";
			arrayList.add(3, newElement);
			
			arrayList.add("PHP");
			
			System.out.println("Array List after inserting new element at the first position: " + arrayList);
			
		}



	
}
