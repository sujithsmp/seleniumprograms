package selenium;

import java.time.Duration;

import javax.swing.ToolTipManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement tooltip=driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
		String attributeValue=tooltip.getDomAttribute("title");
		System.out.println(attributeValue);

	}

}
