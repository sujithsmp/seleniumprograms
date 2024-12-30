package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorScrollBy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		
		//1.scroll down page by pixel number
		/*js.executeScript("window.scrollBy(0,1500)", "");
		
		System.out.println(js.executeScript("return window.pageYOffset",""));
		
		
		//2.scroll the page till the element is visible
		WebElement ele1=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView()", ele1);
		System.out.println(js.executeScript("return window.pageYOffset", ""));*/
		
		//3.scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset", ""));
		
		//4.scrolling upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset", ""));
		
		//5.zooming
		js.executeScript("document.body.style.zoom='50%'");;

	}

}
