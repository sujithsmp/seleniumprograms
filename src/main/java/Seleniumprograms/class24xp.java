package Seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class24xp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("hello");
		//boolean d1 = driver.findElement(By.xpath("//img[@class=\"product-image\"]")).isDisplayed();
		//System.out.println("yes "+ d1);
		//xpath with multiple attri
		//driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"][@name='field-keywords']")).sendKeys("hello");
		//AND operator
		//driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"and @name='field-keywords']")).sendKeys("hello");
		//OR operator
		//driver.findElement(By.xpath("//input[@placeholder=\"1Search Amazon.in\"or @name='1field-keywords']")).sendKeys("hello");
		//linktext or inner text 
	//boolean text = driver.findElement(By.xpath("//a[text()='Sell']")).isDisplayed();
	//String textvalue = driver.findElement(By.xpath("//a[text()='Sell']")).getText();
	//System.out.println("? "+ text);
	//System.out.println("? "+ textvalue);
		//innertext
		//boolean text = driver.findElement(By.xpath("//h2[text()='Amazon LIVE - Watch, Chat & Shop LIVE ']")).isDisplayed();
		//String textvalue = driver.findElement(By.xpath("//h2[text()='Amazon LIVE - Watch, Chat & Shop LIVE ']")).getText();
		//System.out.println("? "+ text);
		//System.out.println("? "+ textvalue);
		//contains()-Search Amazon.in
		//driver.findElement(By.xpath("//input[contains(@placeholder,\"Amazon.in\")]")).sendKeys("hello");
		//starts-with -Search Amazon.in
		
	//driver.findElement(By.xpath("//input[contains(@placeholder,\"Sea\")]")).sendKeys("hello");
		//chained xpath
		boolean chain=driver.findElement(By.xpath("//div[@id='live-flagship-root']/div/div/div/h2")).isDisplayed();
		String chainvalue=driver.findElement(By.xpath("//div[@id='live-flagship-root']/div/div/div/h2")).getText();
		System.out.println("? "+ chain);
		System.out.println("? "+ chainvalue);
		

}
	
} 