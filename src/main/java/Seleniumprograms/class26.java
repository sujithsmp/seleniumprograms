package Seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class26 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//String ttle =driver.getTitle();
		//if(ttle.equals("OrangeHRM")){
			//System.out.println("Title matches:  " +ttle);
		//}
		//else {
			//System.out.println("Title not Matches");
		//}		
		//get current url
		//System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());//5F9B70281E4B29D4E5EA2AB12E499D4C, 64A5E5119AE0434C5E49821D1A7E09A6
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		Set<String>windowid=driver.getWindowHandles();
		System.out.println(windowid);

		
	
		
		 

	}

}
