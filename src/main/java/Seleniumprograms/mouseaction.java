package Seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement ele=	driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement ele1=	driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		act.moveToElement(ele).moveToElement(ele1).click().build().perform();
			
		
	}

}
