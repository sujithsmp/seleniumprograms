package multiinheritence;

public class Details extends Vehicle 
{
	String fuel; int cc;
	public void engine()
	{
		car();
		System.out.println("Enter the fuel type");
		fuel=new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter the cc");
		cc=new java.util.Scanner(System.in).nextInt();
	}


}
