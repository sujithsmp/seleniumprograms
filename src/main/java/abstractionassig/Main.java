package abstractionassig;

public class Main {
    public static void main(String[] args) {
    	Contractor obj1 = new Contractor("Dileep", 200);
    	//Employee obj1 = new Contractor("Dileep", 200);
        int cWkgHours = 5; 
        System.out.println(obj1.getName() + "'s Salary (Contractor):" + obj1.calculateSalary(cWkgHours));

        Employee obj2 = new FullTimeEmployee();
        
        System.out.println(obj2.getName() + "'s Salary (Full-time):" + obj2.calculateSalary(0));  // Hours parameter ignored
    }
}

