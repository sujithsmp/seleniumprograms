package abstractionassig;
public class FullTimeEmployee extends Employee {
   static final int STANDARD_WORKING_HOURS = 8;  // Full-time employees work 8 hours per day

    public FullTimeEmployee() 
    {
        super("Sujith", 200);
    }

    
    public double calculateSalary(int workingHours) 
    {
        return getPaymentPerHour() * STANDARD_WORKING_HOURS;
    }
}