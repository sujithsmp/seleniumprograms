package Seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptscrolloing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		//js.executeScript("window.scrollBy(0,1250)","");
		//js.executeScript("arguments[0].scrollIntoView()",ele1);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);	
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			
		//System.out.println(js.executeScript("return window.pageYOffset",""));
		//js.executeScript("document.body.style.zoom='50%'");
		
	}

}
