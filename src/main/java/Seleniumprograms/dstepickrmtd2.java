package Seleniumprograms;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dstepickrmtd2 {
	static void selectmonthyeardate(WebDriver driver,String reqyear,String reqmonth,String reqdate) {
		
		WebElement list=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select opt=new Select(list);
		opt.selectByVisibleText(reqyear);
		
		while(true)	
		{
			String	displayedmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			Month expectedmonth=convertmonth(reqmonth);
			Month currentmonth=convertmonth(displayedmonth);
			
			int out=expectedmonth.compareTo(currentmonth);
			if(out<0)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			else if (out>0)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			else
			{
				break;
			}
			
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
	//user defined function for converting month from string
	static Month convertmonth(String reqmonth) 
	{
		HashMap<String,Month> monthmap=new HashMap<String,Month>();
		monthmap.put("January", Month.JANUARY);
		monthmap.put("February", Month.FEBRUARY);
		monthmap.put("March", Month.MARCH);
		monthmap.put("April", Month.APRIL);
		monthmap.put("May", Month.MAY);
		monthmap.put("June", Month.JUNE);
		monthmap.put("July", Month.JULY);
		monthmap.put("August", Month.AUGUST);
		monthmap.put("September", Month.SEPTEMBER);
		monthmap.put("Octobery", Month.OCTOBER);
		monthmap.put("November", Month.NOVEMBER);
		monthmap.put("Decemeber", Month.DECEMBER);
		
		Month vmonth=monthmap.get(reqmonth);
		
		if(vmonth==null) 
		{
			System.out.println("invalid month");
		}
		
		return vmonth;
		
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		String reqyear="2025";
		String reqmonth="August";
		String reqdate="25";
		
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		
		selectmonthyeardate(driver,reqyear,reqmonth,reqdate	);
		
		
		
	}

}
