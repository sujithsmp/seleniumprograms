package exceptioneg;

import java.io.IOException;

public class ThrowsEg 
{
	public void method(int n1,int n2) throws  IOException
	{
		int r=n1+n2;
		if(r>20)
		{
			throw new ArithmeticException("r>20");
		}
		else
		{
			throw new IOException();
		}
	}
	
	public void display() throws IOException  
	{
		method(10,31);
	}

	public static void main(String[] args) 
	{
		
		ThrowsEg obj= new ThrowsEg();
		try 
		{		
		obj.display();
		}
		catch(IOException e)
		{
			System.out.println("exception occured");
		}
		catch(ArithmeticException er)
		{
			System.out.println("Arithamatic exception");
		}
		
	}
}
