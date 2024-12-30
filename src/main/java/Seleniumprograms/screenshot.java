package Seleniumprograms;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		//full page screenshot 
		/*TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	//path of screenshot folder
	//File target=new File("C:\\Users\\Sujith\\Downloads\\Selenium_Workspace\\seleniumwedriver\\screenshot\\fullpage.png");
	File target=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
	source.renameTo(target);*/
		//section
	/*WebElement 	el=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));	
		File source=el.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\screenshot\\section.png");
		source.renameTo(target);*/
		
		//WEB ELEMENT
		WebElement 	el=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	File source=el.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"\\screenshot\\ele.png");
		source.renameTo(target);
	}

}

