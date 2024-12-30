package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		//1.select all the checkboxes using one webelement 
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='check-box-list' and @type='checkbox']"));
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		//or
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		
		//2.select last 2 checkboxes using one webelement 
		for(int i=2;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		//3.select first 2 checkboxes using one webelement 
				for(int i=0;i<2;i++)
				{
					checkboxes.get(i).click();
				}*/
		//4.unselect checkboxes if they are selected 
				for(int i=0;i<2;i++)
				{
					checkboxes.get(i).click();
				}
				Thread.sleep(5000);
				
				for(int i=0;i<checkboxes.size();i++)
				{
					if(checkboxes.get(i).isSelected())
					{
						checkboxes.get(i).click();
					}
					
				}
				
				
	}

}
