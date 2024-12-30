package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class BootstrapDropDown 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
				
		//select single option from the drop down
		driver.findElement(By.xpath("//input[@value='Java']")).click();
				
		//no of options
		List<WebElement> option=driver.findElements(By.xpath("//ul[contains(@class,'multi')]//label"));
		System.out.println("No of options:"+option.size());
	
		//select all options from the drop down
		for(int i=0;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}
	
				
		//select multiple options
		for(WebElement op1:option)
			{
			String t =op1.getText();
			if(t.equals("Bootstrap")||t.equals("Angular")||t.equals("CSS"))
			{
			op1.click();
			}
		}
				
	}
}
	


