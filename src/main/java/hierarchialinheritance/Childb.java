package hierarchialinheritance;

public class Childb  extends Parent
{
	public void displayChildb()
	{
		System.out.println("Childb "+a);
	}

	public static void main(String[] args)
	{
		Childb obj=new Childb();
		obj.display();
		obj.displayChildb();
		

	}

}
