package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow2 {

	public static void main(String[] args) 
	{	
		WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	WebElement newtab = driver.findElement(By.xpath("//button[@id='tabButton']"));
	newtab.click();
	System.out.println(driver.getTitle());
	Set<String> allWindowsSet = driver.getWindowHandles();
	List<String>allWindowsList=new ArrayList(allWindowsSet);
	
	String parentId=allWindowsList.get(0);
	String childId=allWindowsList.get(1);
	driver.switchTo().window(childId);
	
	String text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(text);
	
	//for more than 2 windows
	for(String id:allWindowsSet)
	{
		String title=driver.switchTo().window(id).getTitle();
		if(title.equals("title of the widow to which u need to perform some actions"))
		{
			//any operation
		}
	}

	}

}
