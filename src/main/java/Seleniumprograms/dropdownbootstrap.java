package Seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownbootstrap {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//select single option from thje drop down
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		//select all options from the drop down
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		for(int i=0;i<list.size();i++)	
		{
			//System.out.println(list.get(i).getText());
			String t =list.get(i).getText();
			if(t.equals("Bootstrap")||t.equals("Angular")||t.equals("CSS"))
			{
				list.get(i).click();
			}
		}
		
	}

}
