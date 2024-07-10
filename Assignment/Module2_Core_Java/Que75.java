package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to compare two sets and retain elements which are same on both sets.

public class Que75 {

	public static void main(String[] args) 
	{
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add("Android");
		arrayList.add("Flutter");
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		
		arrayList2.add("Java2");
		arrayList2.add("Php2");
		arrayList2.add("Android2");
		arrayList2.add("Flutter");
		
		arrayList.retainAll(arrayList2);
		
		Iterator i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
}
