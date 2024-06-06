package Date30_5;

public class ConstuctorEx2 {

		//static variable or data member 
		static int A = 0;
		
		ConstuctorEx2()
		{
			
			A++;
			System.out.println(A);
			
		}
		
		public static void main(String[] args) 
		{
			ConstuctorEx2 c1 = new ConstuctorEx2();
			ConstuctorEx2 c2 = new ConstuctorEx2();
			ConstuctorEx2 c3 = new ConstuctorEx2();
		}
	
}
