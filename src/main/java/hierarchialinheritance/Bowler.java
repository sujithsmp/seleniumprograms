package hierarchialinheritance;

public class Bowler  extends Player {
    private int wickets;

    public void inputBowlerDetails() {
        inputDetails(); // Call parent method
        System.out.print("Enter Wickets Taken: ");
        wickets = new java.util.Scanner(System.in).nextInt();
    }

    public void displayBowlerDetails() {
        System.out.println("--- Bowler Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Wickets Taken: " + wickets);
    }

	public static void main(String[] args) {
		Bowler bowler = new Bowler();
        bowler.inputBowlerDetails();
        bowler.displayBowlerDetails();

	}

}
