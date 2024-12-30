package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(5000);
		List<WebElement>options=driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
		
		
		System.out.println("Options in the search box are..");
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
				
		}
		
		//click if search option is selenium
		Thread.sleep(5000);
		for(int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equals("selenium"))
			{
				options.get(i).click();
				
			}
		}
	}

}
