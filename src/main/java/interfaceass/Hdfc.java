package interfaceass;

import java.util.Scanner;

public class Hdfc implements Rbi
{
	
	public String customer(String name) 
	{
		
		return name;
	}

	
	
	
	public double recurringDeposit(double monthlyDeposit, int months) 
	{
		double maturityAmount = monthlyDeposit * months + 
                (monthlyDeposit * (months * (months + 1))) / 2.0 * (INT_RATE / 400);
		return maturityAmount;
	}
	public static void main(String[] args) 
	{
		Hdfc obj=new Hdfc();
		 Scanner sc = new Scanner(System.in);
		 
		 	System.out.print("Enter the customer name");
		 	String name=sc.nextLine();
	        
	        System.out.print("Enter the monthly deposit amount (P): ");
	        double monthlyDeposit = sc.nextDouble();
	        
	        System.out.print("Enter the number of months (n): ");
	        int months = sc.nextInt();

	        double maturityAmount = obj.recurringDeposit(monthlyDeposit, months);
	        System.out.println("...........RD for the customer....... "+obj.customer(name));
	        System.out.println("The maturity amount after " + months + " months is: Rs. " + maturityAmount);


	}

	

}
