package multiinheritence;

public class Child2 extends Child1
{
public void displayChild2()
	
	{
		
		System.out.println("display Child2");
		
	}

	public static void main(String[] args) {
		Child2 obj=new Child2();
		Child1 obj1=new Child1();
		Parent obj2=new Parent();
		obj.parentDisplay();
		obj.displayChild1();
		obj.displayChild2();
		obj1.parentDisplay();
		

	}

}
