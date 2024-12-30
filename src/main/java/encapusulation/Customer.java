package encapusulation;

public class Customer {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setName("Sujith");
		obj.setValue(1000);
		obj.cal();
		System.out.println(obj.getName());
		System.out.println(obj.getValue());
	}

}
