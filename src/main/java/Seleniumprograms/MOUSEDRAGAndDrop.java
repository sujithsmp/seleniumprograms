package Seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSEDRAGAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//div[@id='box4']"));
		
		WebElement ele2=driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement ele3=driver.findElement(By.xpath("//div[@id='dropContent']"));
		act.dragAndDrop(ele1, ele2).perform();
		Thread.sleep(3000);
		act.dragAndDrop(ele1, ele3).perform();
		
	}

}
