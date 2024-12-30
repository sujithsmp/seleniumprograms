package inheritance;

public class Student extends Details
{
	private String department;private int age;
	
	public void setDetails2()
	{
		setDetails();
		System.out.println("Enter the student age");
		age=new java.util.Scanner(System.in).nextInt();
		System.out.println("Enter the student department");
		department =new java.util.Scanner(System.in).nextLine();
	}
	public void displayDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + id);
        System.out.println("Department: " + department);
    }

	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.setDetails2();
		obj.displayDetails();
	}

}
