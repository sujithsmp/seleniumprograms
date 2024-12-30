package aggregation;

public class Class2 
{
	
		String street;
		int houseno;
		String housename;
		Class1 cl1;
	public Class2(String s,String hn,int r,Class1 cl1)

		{
			street=s;
			houseno=r;
			housename=hn;
			this.cl1=cl1;
			
		}
	
	public void print()
	{	
		System.out.println("name :"+cl1.name);
		System.out.println("roll no :"+cl1.roll);
		System.out.println("house number :"+houseno);
		System.out.println("house name :"+housename);
		System.out.println("street :"+street);
	}
	
}
