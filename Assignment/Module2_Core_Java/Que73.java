package Module2_Core_Java;

import java.util.ArrayList;

//Write a Java program to replace the second element of an Array List with the specified element.

public class Que73 {
	
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("Java");
		array.add("Php");
		array.add("Android");
		array.add("Flutter");
		
		System.out.println("Original array list: " + array);
		
		String new_array = "Python";
		array.set(1, new_array);
		
		int num = array.size();
		System.out.println("Replace third element with 'Python'.");
		for(int i=0 ; i<num ; i++)
		{
			System.out.println(array.get(i));
		}
	}

}
