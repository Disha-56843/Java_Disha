package Module2_Core_Java;

/*W.A.J.P to compare a given string to the specified character sequence. Comparing 
 topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false */

public class Que16 {
	
	public static void main(String[] args) {
		
		String s = "topsint.com";
		String s1 = "topsint.com";
		String s2 = "Topsint.com";
		
//		Using Operator
		System.out.println(s==s1);
		System.out.println(s==s2);
		
		System.out.println("--------------------");
		
//		Using string method
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		
	}

}
