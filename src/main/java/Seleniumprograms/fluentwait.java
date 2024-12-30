package Seleniumprograms;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentwait {

	public static void main(String[] args)throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				       .withTimeout(Duration.ofSeconds(30))
				       .pollingEvery(Duration.ofSeconds(5))
				       .ignoring(NoSuchElementException.class);
			 
			
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();

				   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				     public WebElement apply(WebDriver driver) {
				       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
				     }
				   });
				   foo.sendKeys("Admin");
			//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//driver.manage().window().maximize();
			//WebElement u=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
			//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
				//u.sendKeys("Admin");
			//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			//WebElement p=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
			//p.click();
	}
}
