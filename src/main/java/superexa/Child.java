package superexa;

public class Child extends Parent
{
	int number;
	public void set(int n)
	{
		super.number=n;
		//number=n;
	}
	
	public void displaychild()
	{
		System.out.println("child class"+number);
	}

	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.set(100);
		obj.display();
		obj.displaychild();


	}

}
