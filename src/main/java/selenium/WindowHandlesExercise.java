package selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExercise {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		search.sendKeys("test");
		WebElement clickOPtion=driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		clickOPtion.click();
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//a"));
		int size=links.size();
		for(int i=0;i<size;i++)
		{
			links.get(i).click();
		}
		Set<String>windows=driver.getWindowHandles();
		Thread.sleep(5000);
		for(String id:windows)
		{
			String title=driver.switchTo().window(id).getTitle();
			System.out.println(title);
			if(title.equals("Test - Wikipedia")||title.equals("Testosterone - Wikipedia"))
			{
				driver.close();
			}
			
		}

	}

}
