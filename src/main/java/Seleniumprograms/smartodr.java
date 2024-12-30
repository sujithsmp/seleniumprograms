package Seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class smartodr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.smartodr.in/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sujithsmp@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sujithsmp@1234");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='OTP']")).sendKeys("318854");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}
