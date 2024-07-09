package Module2_Core_Java;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to extract a portion of an array list.

public class Que65 {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("Given list: " + list);
		
		List<String> sublist = list.subList(0, 3);
		
		System.out.println("List of First Three Elements: " + sublist);
	}

}
