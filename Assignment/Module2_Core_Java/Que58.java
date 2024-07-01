package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Write a Java program to shuffle elements in an array list.

public class Que58 {
	
	// Method to shuffle elements in the ArrayList
    public static void shuffleArrayList(ArrayList<String> arrayList) {
        Random random = new Random();
        for (int i = arrayList.size() - 1; i > 0; i--) {
            // Generate a random index
            int index = random.nextInt(i + 1);
            
            // Swap the elements at the current index and the random index
            String temp = arrayList.get(index);
            arrayList.set(index, arrayList.get(i));
            arrayList.set(i, temp);
        }
    }

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Red");
		arrayList.add("Blue");
		arrayList.add("Orange");
		arrayList.add("Green");
		arrayList.add("Violet");
		
		System.out.println("Array list before shuffling: " + arrayList);
		
//		Method 1: Using collection  
		Collections.shuffle(arrayList);
		System.out.println("Array List after shuffling: " + arrayList);
		
//		Method 2: ArrayList method
		shuffleArrayList(arrayList);
		System.out.println("Array List after shuffling: " + arrayList);
		
	}
	
	
}
