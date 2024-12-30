package interfacemethod;

//public class Child implements ParentInterface,ParentInter2,ParentInter3
public class Child implements ParentInter3
{
	
	public void display() 
	{
		System.out.println("implement1");
		System.out.println(VALUE);
	}

	
	public int print(int number) 
	{
		int num=number+VALUE;
		System.out.println("implement2 "+num);
		return 0;
	}
	
	
	
	public void ptwoDisplay() 
	{
		System.out.println("second interface class implemented");
		
	}
	
	public void pthreeDisplay() 
	{
		float a=PI+VALUE;
		
		System.out.println("3rd interface class implemented "+a);
	}

	
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.display();
		obj.print(100);
		obj.ptwoDisplay();
		obj.pthreeDisplay();
	}


	


	

	

}
