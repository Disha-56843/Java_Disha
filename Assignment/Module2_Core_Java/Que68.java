package Module2_Core_Java;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to join two array lists.

public class Que68 {
	
	public static void main(String[] args) {
		
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
		
		arrayList.addAll(arrayList2);
		
		Iterator i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
