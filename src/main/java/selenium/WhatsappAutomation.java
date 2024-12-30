package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WhatsappAutomation {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9900");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class=\"_ai0b _ai08 _ash5\"]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.xpath("//div[@class=\"_ai04\"]//div[@class=\"x1hx0egp x6ikm8r x1odjw0f x6prxxf x1k6rcq7 x1whj5v\"]"));
		
		search.sendKeys("Archa");
		String text="Happy Belated Birthday, my love!\r\n"
				+ "I know I missed your special day, and for that, I’m truly sorry. Life got in the way, but there’s no excuse for not celebrating the incredible person you are. You deserve all the happiness in the world, not just on your birthday but every single day.\r\n"
				+ "\r\n"
				+ "I hope your day was as amazing as you, and I’d love the chance to make it up to you. Let’s create new memories together and turn this into a celebration we’ll both cherish.\r\n"
				+ "\r\n"
				+ "You mean the world to me, and I hope you know that, no matter what";

		Actions act=new Actions(driver);
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		Thread.sleep(5000);
		WebElement type=driver.findElement(By.xpath("//div[@class=\"x1hx0egp x6ikm8r x1odjw0f x1k6rcq7 x6prxxf\"]"));
		for(int i=0;i<100;i++)
		{
		type.sendKeys(text);
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		Thread.sleep(1000);
		}
		
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}

}
