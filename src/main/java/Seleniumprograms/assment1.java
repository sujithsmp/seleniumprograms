package Seleniumprograms;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		element.sendKeys("test");
		//element.submit();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//List<WebElement>e1=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link'or @id='Wikipedia1_wikipedia-search-more']"));
		List<WebElement>e1=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		//WebElement e1=driver.findElement(By.xpath("//div[@id='wikipedia-search-result-link'or @id='Wikipedia1_wikipedia-search-more']"));
		//System.out.println(e1.findElements(By.tagName("a")).size());
		
		System.out.println("total " +e1.size());
		Thread.sleep(5000);
		for(int i=0;i<e1.size();i++)
		{
			e1.get(i).click();
		}
		Set<String> we=driver.getWindowHandles();
		for(String title:we)
		{
			String t1=driver.switchTo().window(title).getTitle();
			System.out.println(t1);
			if(t1.equals("Testicle - Wikipedia")||t1.equals("Testosterone - Wikipedia")||t1.equals("Test - Wikipedia"))
			{
				driver.close();
				
				
		}
	}

}}