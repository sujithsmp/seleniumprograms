package encapsulation;

public class Bank {
    private int[] validPins;
    private double balance;
    public void setValidPins(int[] pins) 
    {
        validPins = pins;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public int[] getValidPins() 
    {
        return validPins;
    }
    public double getBalance() 
    {
        return balance;
    }
    
    
    public boolean validatePin(int pin)
    {
        for (int validPin : validPins) 
        {
            if (validPin==pin) 
            {
                return true;
            }
        }
        return false;
    }
    public boolean withdraw(double wamount)
    {
    	if(wamount<=balance)
    	{
    		balance=balance-wamount;
    		return true;
    	}
    	else 
    	{
    		System.out.println("Insufficient balance");
    		return false;
    	}
    	
    }
    
}