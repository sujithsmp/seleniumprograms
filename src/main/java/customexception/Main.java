package customexception;

import java.io.IOException;

public class Main 
{
	public void method(int age) throws InvalidAgeException 
	{
		
		if(age<18)
		{
			throw new InvalidAgeException("Invalid age");
		}
		else
		{
			System.out.println("valid");
		}
	}
	public static void main(String[] args) throws InvalidAgeException 
	{
		Main obj=new Main();
		try
		{
		obj.method(17);
		}
		catch(InvalidAgeException er)
		{
			System.out.println("Age is less than 18");
			System.out.println(er.getMessage());
		}

	}

}
