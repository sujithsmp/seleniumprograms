package Seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mousedoubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.switchTo().frame("iframeResult");
		WebElement ele1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement ele2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement ele3=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		ele1.clear();
		ele1.sendKeys("welcome");
		
		act.doubleClick(ele3).build().perform();
		
		
	/*Action store=act.doubleClick(ele3).build();
		Thread.sleep(5000);
		store.perform();
		//or*/
		if(ele2.getAttribute("value").equals("welcome"))
		{
			System.out.println("ok");
		}
		
	}

}

//

