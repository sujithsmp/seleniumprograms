package hierarchialinheritance;

public class Player 
{
	protected String name;
    protected int age;

    public void inputDetails() 
    {
        System.out.print("Enter Player Name: ");
        name = new java.util.Scanner(System.in).nextLine();
        System.out.print("Enter Player Age: ");
        age = new java.util.Scanner(System.in).nextInt();

}
}
