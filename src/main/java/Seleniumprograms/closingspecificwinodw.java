package Seleniumprograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closingspecificwinodw {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowid=driver.getWindowHandles();
		System.out.println(windowid);
		List<String> windowlist=new ArrayList(windowid);
		String parentid=windowlist.get(0);
		String childid=windowlist.get(1);
		//switch to child window
		//driver.switchTo().window(childid);
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getTitle());
		//switch to parent window
		//driver.switchTo().window(parentid);
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getTitle());
		for(String windowvar:windowid) 
		{
			String title =  driver.switchTo().window(windowvar).getTitle();
			if(title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
			}
			
			
		}

	}

}
