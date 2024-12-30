
package Seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablestatic {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//number of rows
	int a= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	int b= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(a);
		System.out.println(b);
		//read data from rows and table 
		//String bookname =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		
		//System.out.println(bookname);
		//print bookname only
		/*for(int r=2;r<=a;r++)
		{
			String booknameall =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(booknameall);	
		}*/
		//print all entries
		
		/*for(int r=2;r<=a;r++)
		{
			for(int c=1;c<=b;c++)
			{
				String booknameall =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(booknameall+"\t");
			}
			System.out.println();
		}*/
		
		//print booka whos author is mukesh
		
		/*for(int r=2;r<=a;r++)
		{
			String auth =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				//System.out.println(auth);	
				if(auth.equals("Mukesh"))
				{
					String bookname =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println(bookname);
				}
		}*/
		
		//total price
		int total=0;
		for(int r=2;r<=a;r++)
		{
			String ttl =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				//System.out.println(auth);	
				total=total+Integer.parseInt(ttl);
				//System.out.println(total);
		}
		System.out.println(total);
		 
	}

}
