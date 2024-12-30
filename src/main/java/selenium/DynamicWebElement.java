package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.qabible.in/table-pagination.php");
	driver.manage().window().maximize();
	List<WebElement> firstcol=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	String locator="";
	
	/*for(int i=0;i<firstcol.size();i++)
	{
		Thread.sleep(5000);
		if(firstcol.get(i).getText().equals("Ashton Cox"))
		{
			 locator=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[4]")).getText();
			System.out.println(locator);
			break;
		}
	}*/
	int rows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr")).size();
	for(int r=1;r<=rows;r++)
	{
		String position=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td[1]")).getText();
		//System.out.println(position);
		if(position.equals("Ashton Cox"))
		{
			String value=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+r+"]//td[4]")).getText();
			System.out.println(value);
		}

	}

}}
