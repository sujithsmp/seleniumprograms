package multiinheritence;

public class Model extends Details
{
	String color,varient;
	public void color()
	{
		engine();
		System.out.println("Enter the color");
		color=new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter the Vareint");
		varient=new java.util.Scanner(System.in).nextLine();
	}
	
	public void display()
	{
		System.out.println("--- Sports Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println(" Manufaure Year: " + manyr);
        System.out.println("Fuel type: " + fuel);
        System.out.println("Cubic capacity: " + cc);
        System.out.println("Color: " + color);
        System.out.println("Vareint: " + varient);
    }
	
	public static void main(String[] args) 
	{
		Model obj= new Model();
		obj.color();
		obj.display();
	}

}
