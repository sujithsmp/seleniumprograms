package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newtab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		newtab.click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(parentWindow);
		for (String ids : allWindows)

		{
			System.out.println(ids);
			if (!parentWindow.equals(ids)) {
				driver.switchTo().window(ids);
				
			}

		}
		String parentWindow2 = driver.getWindowHandle();
		System.out.println("After switch." + parentWindow2);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.switchTo().window(parentWindow);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.id("windowButton")).click();
	}

}
