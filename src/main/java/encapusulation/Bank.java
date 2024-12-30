package encapusulation;

public class Bank 
{
	private String name;
	private double value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public void cal()
	{
		value=value+100;
		
	}
}
