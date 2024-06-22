package Date12_06;

public class String_Methods {
	
	public static void main(String[] args) 
	{
		
		String s = "disha";
		String s2 = "disha";
		String s3 = "miral";
		String s6 = "tops";
		String s4 = new String("disha");
		String s5 = "DISHA";
		
		//equals = check value of string
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s4));
		System.out.println("-----------------------------");
		
		//equalsignorecase = check value of string but ignore if its Uppercase or Lowercase
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equalsIgnoreCase(s5));
		System.out.println(s.equals(s5));
		
		System.out.println("-----------------------------");
	
		
		//compareTo = compare value of variable using 
		
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
		System.out.println(s.compareTo(s6));
		System.out.println("-----------------------------");
		
		//==
		System.out.println(s==s2);
		System.out.println(s==s4);
	}

}
