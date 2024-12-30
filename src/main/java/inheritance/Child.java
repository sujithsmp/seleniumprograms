package inheritance;

public class Child extends Parent
{
	public void childDisplay()
	{
		System.out.println("display child "+num);
		
	}

	public static void main(String[] args) 
	{
		//Parent obj=new Parent();
		//obj.parentDisplay();
		Child childobj=new Child();
		childobj.parentDisplay(66);
		childobj.childDisplay();
		
	}

}
