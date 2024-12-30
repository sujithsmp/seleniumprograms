package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2RadioButton {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
		//1.	Select the radio buttons and verify the same is selected or not
		WebElement checkRadio=driver.findElement(By.id("inlineRadio1"));
		checkRadio.click();
		boolean check=checkRadio.isEnabled();
		System.out.println(check);
		
		//2. Verify the presence of the "Show Selected Value" button
		WebElement displayed=driver.findElement(By.id("button-one"));
		boolean check1=checkRadio.isDisplayed();
		System.out.println(check1);
		
		//3.Verify the button "Show Selected Value" is enabled or not.
		boolean check2=checkRadio.isEnabled();
		System.out.println(check2);
		
		
	}

}
