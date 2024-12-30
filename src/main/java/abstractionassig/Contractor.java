package abstractionassig;

public class Contractor extends Employee 
{
    public Contractor(String name, double paymentPerHour) 
    {
        super(name, paymentPerHour);
    }

    public double calculateSalary(int hrs) 
    {
        return getPaymentPerHour() * hrs; 
    }
}