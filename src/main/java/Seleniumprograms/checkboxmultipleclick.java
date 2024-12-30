package Seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxmultipleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	List<WebElement> ele=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for(int i=0;i<ele.size();i++)
		{
			ele.get(i).click();
		}
		 */
	/*for(WebElement e:ele)
	{
		e.click();
	}*/
	//select last 3 checkboxes
	/*for(int i=4;i<ele.size();i++)
	{
		ele.get(i).click();
	}*/
	//select first 3 checkbox
	/*for(int i=0;i<4;i++)
	{
		ele.get(i).click();
	}*/
	//unselect checkboxes which they are alreday selected

	for(int i=0;i<3;i++)
	{
		ele.get(i).click();
	}
	
	Thread.sleep(5000);
	
	for(int i=0;i<ele.size();i++)
	{
	 if(ele.get(i).isSelected())
	 {
		ele.get(i).click();
	 }
	}
		
		

}}
