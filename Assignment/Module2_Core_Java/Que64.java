package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to reverse elements in an array list.

public class Que64 {

	 public static void main(String[] args) 
	 {
		 
			ArrayList<String> arrayList = new ArrayList<>();
			
			arrayList.add("Organge");
			arrayList.add("Blue");
			arrayList.add("Violet");
			arrayList.add("Pink");
			
			System.out.println("Array list before reverse: " + arrayList);
			
			Collections.reverse(arrayList);
			
			System.out.println("Array list after reverse: " + arrayList);
		}
	
}
