package Seleniumprograms;

import java.time.Duration;
import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assment4 {
static void selectmonthyeardate(WebDriver driver,String reqyear,String reqmonth,String reqdate) {
		
		WebElement list=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select opt=new Select(list);
		opt.selectByVisibleText(reqyear);
		
		while(true)	
		{
			String	displayedmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
	
			if(displayedmonth.equals(reqmonth))
			{
				break;
			}
			
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		
			
		}
		List<WebElement>day=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement d:day) 
		{
			if(d.getText().equals(reqdate))
			{
				d.click();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		String reqyear="2023";
		String reqmonth="January";
		String reqdate="25";
		
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		
		selectmonthyeardate(driver,reqyear,reqmonth,reqdate	);
		
	}

}
