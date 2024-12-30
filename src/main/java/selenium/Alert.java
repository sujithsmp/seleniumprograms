package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		//accept() - accept
		WebElement click=driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
		click.click();
		
		driver.switchTo().alert().accept();
		//dismiss() - cancel or reject
		WebElement click1=driver.findElement(By.xpath("//button[@class=\"btn btn-warning\"]"));
		click1.click();
		driver.switchTo().alert().dismiss();
		
		
	}

}
