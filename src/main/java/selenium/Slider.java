package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement min=driver.findElement(By.xpath("//div[@class=\"price-range-block\"]//SPAN[1]"));
		System.out.println("initial position of min slider" + min.getLocation());//(86, 232)
		act.dragAndDropBy(min,212,232).perform();
		WebElement max=driver.findElement(By.xpath("//span[2]"));
		System.out.println("initial position of max slider" +max.getLocation());//(59, 250)
		act.dragAndDropBy(max, -100, 250).perform();
	}

}

