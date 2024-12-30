package abstraction;

public class Result extends Google
{
	
	public void search(String name) 
	{
		
		System.out.println("Name:"+name);
	}

	
	public int age(int number) 
	{
		return number+10;
	}
	public static void main(String[] args) 
	{
		
		Result obj=new Result();
		obj.search("Sujith");
		System.out.println("age:"+obj.age(21));
		obj.display();
		
	}


}
