package overriding;

public class Child extends Parent
{
	public int cal(int a,int b) 
	{
		System.out.println("Parent call from child method  "+super.cal(100,20));
		int diff=a-b;
		
		return diff;
	}
	public void disc() 
	{
		System.out.println("Child disp");
		
	}
	

	public static void main(String[] args) 
	{
		/*Child obj=new Child();
	System.out.println("Child "+obj.cal(100, 20));	
		Parent obj1=new Parent();
		System.out.println("Parent "+obj1.cal(100, 20));	*/
		
		Parent obj3=new Child();
		obj3.cal(10,100);
		obj3.disp();
	}

}
