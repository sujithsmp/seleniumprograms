package Seleniumprograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateto {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(5000);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//@SuppressWarnings("deprecation")
		//URL urlobj=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to(urlobj);
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//  driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
	}
	
}
