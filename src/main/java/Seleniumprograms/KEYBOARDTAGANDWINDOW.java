package Seleniumprograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KEYBOARDTAGANDWINDOW {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		act.keyDown(Keys.CONTROL).click(ele1).keyUp(Keys.CONTROL).perform();
		List<String> wind=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(wind.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("sujith");
	

	}

}
