package superkeyword;

public class DivChecker extends Sum
{
	//public DivChecker(int a,int b)
	public DivChecker()
	{	//super(a,b)
		super(15,5);
	}
	public void checkDivisibility() 
	{
        int result = super.cal();
        if (result % 10 == 0) 
        {
            System.out.println("The addition result " + result + " is divisible by 10.");
        } 
        else 
        {
            System.out.println("The addition result " + result + " is not divisible by 10.");
        }
	}

	public static void main(String[] args) 
	{
		//DivChecker obj= new DivChecker(15,5);
		DivChecker obj= new DivChecker();
		obj.checkDivisibility();

	}

}
