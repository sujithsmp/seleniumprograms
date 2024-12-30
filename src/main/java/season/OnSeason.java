package season;

import java.util.Scanner;

public class OnSeason extends OffSeason
{
	public double discount(double price)
	{
		double discountRate = 0.40;
        return price * (1 - discountRate);
    }
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the original price:");
	        double price = sc.nextDouble();
	        System.out.println("Enter the season (1 for Onseason, 2 for Offseason): ");
	        int choice = sc.nextInt();
	        OffSeason obj=new OnSeason();
	        OffSeason obj2=new OffSeason();
	        double finalPrice = price;
	        if(choice==1)
	        {
	        	finalPrice =obj.discount(price);
	        }
	        else if(choice==2)
	        {
	        	finalPrice =obj2.discount(price);
	        }
	        else
	        {
	        	System.out.println("Invalid choice..No discount applied ");
	        }
	        
	        
	        System.out.println("Original Price:"+price);
	        System.out.println("Original Price:"+finalPrice);
	        
	}
}
