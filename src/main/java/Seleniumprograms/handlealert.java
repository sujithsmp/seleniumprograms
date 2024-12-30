package Seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlealert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//normal alert
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		//confirmationsl alert
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//Alert myalert1=driver.switchTo().alert();
		System.out.println(myalert.getText());
		Thread.sleep(5000);
		myalert.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		System.out.println(myalert.getText());
		Thread.sleep(5000);
		myalert.dismiss();*/
		
		//promt alert
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("test");
		Thread.sleep(3000);
		myalert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		myalert.sendKeys("test");
		Thread.sleep(3000);
		myalert.dismiss();
		
	}

}
