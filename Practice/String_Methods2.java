package Date12_06;

public class String_Methods2 {
	
	public static void main(String[] args) 
	{
		
		String s = "tops";
		String s2 ="TECH";
		String s3 ="  java tops  ";
		String s4 ="Java is a programming language, Java is a Platform";
		System.out.println(s.toUpperCase()); // convert string into uppercase 
		System.out.println(s2.toLowerCase()); // convert string into lowercase 
		System.out.println(s3.trim()); //Remove extra space from start and end
		System.out.println(s.charAt(0)); // show character of given index number
	
		System.out.println(s.endsWith("s")); // compare if string ends with given character 
		System.out.println(s.startsWith("to")); // compare if string starts with given character 
		System.out.println(s.length()); // check string length
		System.out.println(s.lastIndexOf("p")); // check the index of given character
		System.out.println(s4.replace("Java","Advance Java")); 
	}

}
