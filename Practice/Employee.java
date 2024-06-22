package Date14_06;

import java.io.Serializable;

public class Employee implements Serializable 
{

	int id;
	int salary;
	
	public Employee(int id,int salary) 
	{
		this.id=id;
		this.salary=salary;
	}
	
}
