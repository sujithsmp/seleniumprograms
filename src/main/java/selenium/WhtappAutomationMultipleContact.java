package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WhtappAutomationMultipleContact 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9900");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		
		String message = "Sorry guys njan bulk contact messaging automate cheithu nokuairunnu";
        String[] contacts = {"Thara Sis", "Kingini", "Kari","My Second","Swathy","Amma Vdf","Lakshmi AR","Pooja",
        		"Reji Chechi M","Deepak","Popy Gym","Rajagopal master","Gokul Bro","Waajid REIZEND","Gokul Gym","Archa"};
        Thread.sleep(5000);
        Actions act=new Actions(driver);
        for (String contact : contacts) 
        {
        	WebElement searchBox = driver.findElement(By.xpath("//div[@contenteditable='true' and @class='x1hx0egp x6ikm8r x1odjw0f x6prxxf x1k6rcq7 x1whj5v']"));
        	searchBox.click();
        	searchBox.clear();
            searchBox.sendKeys(contact);
            Thread.sleep(2000);
            //WebElement contactElement = driver.findElement(By.xpath("//span[@title='" + contact + "']"));
            //contactElement.click();
            act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
            //Thread.sleep(2000);
            WebElement messageBox = driver.findElement(By.xpath("//div[@contenteditable='true' and @class='x1hx0egp x6ikm8r x1odjw0f x1k6rcq7 x6prxxf']"));
            messageBox.sendKeys(message);
            messageBox.sendKeys("\n"); 
            
        }
        	

	}

}
