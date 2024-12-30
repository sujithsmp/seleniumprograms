package encapsulation;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of password box");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter the passwords");
		for (int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
		
		 Bank bank = new Bank();
		 bank.setValidPins(arr);
		
		 System.out.println("Enterd passwords are"); 
		int[]arr1=bank.getValidPins();	
		for (int i=0;i<arr1.length;i++)
			{
				System.out.println(arr1[i]);
			}
		
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (bank.validatePin(enteredPin)) 
        {
            System.out.println("Access granted. You can withdraw money.");
            
            System.out.println("Enter the amount to deposit");
    		double amount=sc.nextDouble();
    		bank.setBalance(amount);
    		
    		System.out.println("Current Balnce:"+bank.getBalance()); 
            System.out.println("Enter the amount to withdraw");
    		double wamt=sc.nextDouble();
    		
    		 if (bank.withdraw(wamt)) 
    		 {
                 System.out.println("Withdrawal successful.");
                 System.out.println("Remaining Balance:" + bank.getBalance());
             } else {
                 System.out.println("Withdrawal failed due to insufficient balance.");
             }
    		
           
        } 
        else 
        {
            System.out.println("Invalid PIN. Access denied.");
        }
        
        
	
      
    }
}