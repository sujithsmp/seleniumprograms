package inheritance;

public class Details 
{
	String name; int id;
		public void setDetails()
		{
			System.out.println("Enter the student name");
			name=new java.util.Scanner(System.in).nextLine();
			System.out.println("Enter the student id");
			id=new java.util.Scanner(System.in).nextInt();
		}
	
}
