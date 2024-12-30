package multiinheritence;

public class SalarySlip extends CalcualteHra
{
	public void paySlip()
	{
		double hra=hraCal();
		double pf=pfCal();
		double totalSalary=basicpay+hra-pf-deduction+bonus;
		System.out.println("--- Salary Slip ---");
        System.out.println("Basic Pay:"+basicpay);
        System.out.println("Deduction:"+deduction);
        System.out.println("HRA:"+ hra);
        System.out.println("PF:"+ pf);
        System.out.println("Bonus:"+bonus);
        System.out.println("Total Salary:" +totalSalary);
		
	}
	

	public static void main(String[] args) 
	{
		SalarySlip slip=new SalarySlip();
		slip.salaryDetails();
		slip.paySlip();
	}

}
