package Module2_Core_Java;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a hash list

public class Que60 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Purple");
		set.add("Red");
		set.add("Black");
		set.add("White");
		set.add("Violet");
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
}
