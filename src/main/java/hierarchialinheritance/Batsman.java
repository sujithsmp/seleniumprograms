package hierarchialinheritance;

public class Batsman extends Player
{
	private int runs;

    public void inputBatsmanDetails() {
        inputDetails();
        System.out.print("Enter Runs Scored: ");
        runs = new java.util.Scanner(System.in).nextInt();
    }

    public void displayBatsmanDetails() {
        System.out.println("--- Batsman Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Runs Scored: " + runs);
    }

	public static void main(String[] args) {
		 Batsman batsman = new Batsman();
	        batsman.inputBatsmanDetails();
	        batsman.displayBatsmanDetails();
	}

}
