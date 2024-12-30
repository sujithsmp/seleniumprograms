package Seleniumprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Program1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Launch chrome
		WebDriver  driver = new ChromeDriver();
		
//Open url		
		driver.get("https://www.amazon.in/");
		
//implicit wait
	     //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
//Get title of url
		String title= driver.getTitle();

//Validate Title	
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Title matches:  " +title);
		}
		else {
			System.out.println("Title not Matches");
		}		
		

	//Close driver	
		driver.close();
	}

}
