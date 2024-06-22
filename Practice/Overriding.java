package Date12_06;

class Rbi
{
	int rate()
	{
		return 0;
	}
}
class Sbi extends Rbi
{
	int rate()
	{
		return 5;
	}
}
class Icici extends Rbi
{
	int rate()
	{
		return 6;
	}
}
class Axis extends Rbi
{
	int rate()
	{
		return 7;
	}
}

public class Overriding {

	public static void main(String[] args) 
	{
		Rbi rbi;//Reference variable
		
		rbi = new Sbi();
		System.out.println(rbi.rate());
		
		rbi = new Icici();
		System.out.println(rbi.rate());
		
		rbi = new Axis();
		System.out.println(rbi.rate());
		
		
		

		
	}
	
}
