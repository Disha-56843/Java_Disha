package LoopPattern;

//import java.util.Iterator;

public class Pattern7 {
	
	public static void main(String[] args) {
		
		int i;
		int j; 
		
		for(i = 5; i >= 1; i--)
		{
			for(j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
