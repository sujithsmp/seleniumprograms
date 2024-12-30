package superkeyword;

public class Child extends Main
{
	
		public Child(int b)
		{
			
			super(100);
			System.out.println("Child class "+b);
		}

	public static void main(String[] args) 
	{
		Child ch=new Child(10);
	}

}
