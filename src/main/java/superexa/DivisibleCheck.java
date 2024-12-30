package superexa;

public class DivisibleCheck extends Addition
{

	public void divcheck(int a,int b)
	{
		int value=super.sum(a,b);
		if (value % 10 == 0) 
		{
            System.out.println("The addition result " + value + " is divisible by 10.");
        } 
		else 
		{
            System.out.println("The addition result " +value + " is not divisible by 10.");
        }
	}
		

	public static void main(String[] args) {
		DivisibleCheck check = new DivisibleCheck();
        
        check.divcheck(20, 10);
	}

}
