package Seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
	dropdown.click();
	Select dropd=new Select(dropdown);
	//select option from the drop down
	
	/*dropd.selectByVisibleText("Germany");
	Thread.sleep(3000);
	dropd.selectByValue("brazil");
	Thread.sleep(3000);
	dropd.selectByIndex(4);*/
	
	List<WebElement>options=dropd.getOptions();
	int size=options.size();
	System.out.println(size);
	
	/*for(int i=0;i<size;i++)
	{
		System.out.println(options.get(i).getText());
	}*/
	for(WebElement s:options)
	{
		System.out.println(s.getText());
		if(s.getText().equals("Canada"))
		{
			System.out.println("Canada is there");
		}
	}
	
	
	
	
	}

}
