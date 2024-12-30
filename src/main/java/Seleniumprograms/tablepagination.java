package Seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablepagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.get("https://demo.opencart.com/admin/index.php");
		//driver.manage().window().maximize();
		
	WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
	username.clear();
	username.sendKeys("demo");
	WebElement passwrd=	driver.findElement(By.xpath("//input[@id='input-password']"));
	passwrd.clear();
	passwrd.sendKeys("demo");
	driver.findElement(By.xpath("//a[contains(text(),' Customers')]")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click(); 
	
	String s=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
	int a = Integer.parseInt(s.substring(s.indexOf("(")+1,s.indexOf("page")-1));

	for(int i=1;i<=a;i++)
	{
		if(i>1)
		{
			driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+i+"]")).click(); 
		}
		
		
		
	}

}}
//