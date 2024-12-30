package hierarchialinheritance;

public class Childc extends Parent
{
	public void displayChildc()
	{
		System.out.println("Childc "+a);
	}

	public static void main(String[] args) 
	{
		Childc obj1=new Childc();
		obj1.display();
		obj1.displayChildc();
	}

}
