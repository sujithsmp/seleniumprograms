package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//1. Login to the application
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement pswrd = driver.findElement(By.id("loginform-password"));
		pswrd.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		//2. Navigate to Worker menu
		WebElement workersMenu = driver.findElement(By.xpath("//a[text()='Workers']"));
		workersMenu.click();
		
		//3. Add an explicit wait for the "Search" text to be present in the "Search" button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		boolean text=wait.until(ExpectedConditions.textToBePresentInElement(search,"Search"));
		System.out.println(text);
		wait.until(ExpectedConditions.visi(null))
		
		//4. Add an explicit wait for the class attribute value to be present in the html.
		WebElement table = driver.findElement(By.xpath("//table"));
        boolean isClassPresent = wait.until(ExpectedConditions.attributeToBe(table, "class", "table table-striped table-bordered"));
        System.out.println("Is the expected class value present? " + isClassPresent);
		
		//5. Click Delete icon for any row --> Add an explicit wait for the alert to be present
		WebElement delete = driver.findElement(By.xpath("//tbody//tr[1]//a[@title='Delete']"));
		delete.click();
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
		
		//Alert myalert=driver.switchTo().alert();
		myalert.accept();
		
		
	
		
	}

}
