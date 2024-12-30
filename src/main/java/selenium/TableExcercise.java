package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExcercise {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		//1.find total number of rows in the table
		int rows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr")).size();
		System.out.println("No of rows:"+rows);//10
		
		//2.find total number of columns in the table
		int columns=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//th")).size();
		System.out.println("No of columns:"+columns);//7
		
		//3.Read data from specific row and column(eg:6th row 1sth column)
		String name=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]//td[1]")).getText();
		System.out.println("Name is:"+name);//Brielle Williamson
		
		//4.read data from all the rows and colums
		/*System.out.println("Name"+"\t"+"\t"+"Position"+"\t"+"\t"+"Office"+"\t"+"\t"+"Age"+"\t"+"Start date"+"\t"+"Salary");
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				String value=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		//5.read data from first 2 columns
		System.out.println("Name"+"\t"+"\t"+"Position");
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=2;c++)
			{
				String value=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}*/
		
		//6.print name of employees whose position is Accountant
		System.out.println("print name of employees whose position is Accountant");
		for(int r=1;r<=rows;r++)
		{
			String position=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td[2]")).getText();
			//System.out.println(position);
			if(position.equals("Accountant"))
			{
				String employee=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td[1]")).getText();
				System.out.println(employee);
			}
		}
		
		//7.find total salary of all the employees
		int totalSum=0;
		System.out.println("Individual salary is:");
		for(int r=1;r<=rows;r++)
		{
			String totalSalary=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td[6]")).getText();
			//System.out.println(totalSalary);
			int sal = Integer.parseInt(totalSalary.replace("$", "").replace(",", ""));
			System.out.println(sal);
			totalSum=totalSum+sal;
			
		}
		System.out.println("Total salary of all the employees is: $"+totalSum);
		
		//8.To print the salaries in ascending order
		System.out.println("Salaries in ascending order:");
		List<Integer>salaries=new ArrayList<Integer>();
		for(int r=1;r<=rows;r++)
		{
			String totalSalary=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td[6]")).getText();
			int sal = Integer.parseInt(totalSalary.replace("$", "").replace(",", ""));
			salaries.add(sal);
		}
		Collections.sort(salaries);
		for(int sal:salaries)
		{
			System.out.println(sal);
		}
		//9.Find the webelement of the table footer row and print it
		
		List<WebElement> footer=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tfoot//tr//th"));
		for(int i=0;i<footer.size();i++)
		{
			String value=footer.get(i).getText();
			System.out.println(value);
		}
		
		//10.Find the weblelement of the 3rd column of the table and print it

		List<WebElement> thiredcol=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[3]"));
		
		for(int i=0;i<thiredcol.size();i++)
		{
			String value=thiredcol.get(i).getText();
			System.out.println(value);
		}
		//11. Find the weblelement of the 4th row of the table and print it
List<WebElement> fourthRow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
		
		for(int i=0;i<fourthRow.size();i++)
		{
			String value=fourthRow.get(i).getText();
			System.out.println(value);
		}
	}

}
