package Seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clss22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
	//boolean d1=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	//String s1 =driver.findElement(By.id("nav-logo-sprites")).getText();
	//System.out.println(d1);
	//System.out.println(s1);
		//driver.findElement(By.name("field-keywords")).sendKeys("Nothing");
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		//driver.findElement(By.partialLinkText("Amazon")).click();
		List<WebElement>wb=driver.findElements(By.className("nav-a"));
		System.out.println("total" +wb.size());
		//List<WebElement>wb=driver.findElements(By.tagName("a"));
		//System.out.println("total" +wb.size()
		);

}}
 