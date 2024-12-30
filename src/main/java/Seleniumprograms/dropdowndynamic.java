package Seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowndynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(5000);
	List<WebElement>E=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	
	for(int i=0;i<E.size();i++)
	{
	 String	t= E.get(i).getText();
		System.out.println(t);
		if(t.equals("selenium"))
		{
			E.get(i).click();
			break;
			
		}
	}
	
	}

}
