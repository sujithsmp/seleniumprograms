package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitHandling {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement pswrd = driver.findElement(By.id("loginform-password"));
		pswrd.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement clientsMenu = driver.findElement(By.xpath("//a[text()='Clients']"));
		clientsMenu.click();
	}

}
