package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to sort a given array list

public class Que56 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("D");
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("B");
		arrayList.add("E");
		
		System.out.println("Array before sorting: " + arrayList);
		
		Collections.sort(arrayList);
		
		System.out.println("Array list after sorting: " + arrayList);
		
	}
	
}
