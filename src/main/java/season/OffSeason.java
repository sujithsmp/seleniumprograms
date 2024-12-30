package season;

public class OffSeason 
{
	public double discount(double price)
	{
		double discountRate = 0.15;
        return price * (1 - discountRate);
    }
}
