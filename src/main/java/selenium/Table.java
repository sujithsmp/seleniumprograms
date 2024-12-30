package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		//Read the name and value from all pages(Handle pagination).
		System.out.println("Name"+"\t"+"\t"+"Position");
		for(int p=1;p<7;p++)
		{
			if(p>1)
			{
				WebElement click =driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				click.click();
				Thread.sleep(5000);
			}
			int rows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr")).size();
			for(int r=1;r<=rows;r++)
			{
				String Name=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td[1]")).getText();
				String Position=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td[2]")).getText();
				System.out.println(Name+"\t"+"\t"+Position);
			}
			
			
		
		
		}
	}

}
