package Module2_Core_Java;

/* W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True */

public class Que17 {
	
	public static void main(String[] args) {
		
		String s = "Java Exercises";
		String s1 = "Java Exercise";
		
		System.out.println(s.endsWith("se"));
		System.out.println(s1.endsWith("se"));
		
	}

}
