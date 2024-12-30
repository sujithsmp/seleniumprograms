package Seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class27 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//isDisplayed
		//boolean displayed=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(displayed);
		//or
		//WebElement  displayed=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println(displayed.isDisplayed());
		//isEnabled()
		//boolean enabled=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		//System.out.println(enabled);
		//isSelected() gendermale
		WebElement selectedm=driver.findElement(By.xpath("//input[@id='gender-male']"));
		selectedm.click();
		//genederfemale
	    WebElement selectedf=driver.findElement(By.xpath("//input[@id='gender-female']"));
	    selectedf.click();
	  
		System.out.println("Gender male is selected");
		System.out.println(selectedm.isSelected());
		System.out.println("Gender female is selected"
				+ "");
		System.out.println(selectedf.isSelected());
		

	}

}
