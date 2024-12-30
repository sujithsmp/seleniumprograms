package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementCommands 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//WebElement username=driver.findElement(By.id("loginform-username"));
		//css selector
		WebElement username=driver.findElement(By.cssSelector("input#loginform-username"));
		username.sendKeys("sujithsmp");
		
		//driver.findElement(By.id("loginform-username")).sendKeys("sujith2");
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("sujithsmp");
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
		//username.clear();
		//to automate style property
		String backgroundColor=login.getCssValue("background-color");
		System.out.println(backgroundColor);
		//get attribute value
		String attriValue=login.getAttribute("class");
		System.out.println(attriValue);
		//to fetch tag name
		String tagName=login.getTagName();
		System.out.println(tagName);
		String text=login.getText();
		System.out.println(text);
		
		
		
	}

}
