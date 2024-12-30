package multiinheritence;

public class Vehicle 
{
	String brand; int manyr;
	public void car()
	{
		System.out.println("Enter the brand");
		brand=new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter the manufaure year");
		manyr=new java.util.Scanner(System.in).nextInt();
	}

}
