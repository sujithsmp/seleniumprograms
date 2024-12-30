package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAndMouseEvents {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement element=driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(element).perform();
		WebElement rightbutton=driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightbutton).perform();
		
		//mouse hover
		actions.moveToElement(rightbutton).perform();
		
		//keyboard action
		actions.sendKeys(Keys.ARROW_DOWN).perform();
	}

}
