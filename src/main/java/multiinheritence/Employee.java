
package multiinheritence;
import java.util.Scanner;
public class Employee 
{
	protected double basicpay;
	protected double deduction;
	protected double bonus;
	
	public void salaryDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic pay");
		basicpay=sc.nextDouble();
		System.out.println("Enter the deduction");
		deduction=sc.nextDouble();
		System.out.println("Enter the bonus");
		bonus=sc.nextDouble();
	}
	
}
