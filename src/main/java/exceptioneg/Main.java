package exceptioneg;

public class Main 
{
	public void  opr(int num1,int num2)
	{
		try 
		{
			int[] arr=new int[5];
		//int rslt=num1/num2;
		//System.out.println("Result "+rslt);
		for(int i=0;i<5;i++)
		{
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
		int rslt=num1/num2;
		System.out.println("Result "+rslt);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("div by zero is not possible");
		}*/
		catch(ArrayIndexOutOfBoundsException er)
		{
			System.out.println("array length exceeds");
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("c");
	}

	public static void main(String[] args) 
	{
		Main obj=new Main();
		
		obj.opr(10, 0);

	}

}
