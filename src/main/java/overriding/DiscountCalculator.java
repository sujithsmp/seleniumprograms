package overriding;
import java.util.Scanner;
public class DiscountCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original price of the clothing: $");
        double price = scanner.nextDouble();

        System.out.println("Enter the season (1 for Onseason, 2 for Offseason): ");
        int choice = scanner.nextInt();

        Season season;

        if (choice == 1) {
            season = new Onseason();
        } else if (choice == 2) {
            season = new Offseason();
        } else {
            System.out.println("Invalid choice! Defaulting to no discount.");
            season = new Season();
        }

        double finalPrice = season.discount(price);
        
        System.out.println("Original Price:"+ price);
        System.out.println("Final Price after discount:"+finalPrice);

        scanner.close();
    }
}
	