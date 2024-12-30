package Seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhidden {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='colors']"));
	//dropdown.click();
	Select dropd=new Select(dropdown);
	List<WebElement>op=dropd.getOptions();
	/*for(WebElement d:op) {
		//System.out.println(d.getText());
		String a = d.getText();
		if(a.equals("red")) {
			d.click();
		}
		
	}*/
	
	for(int i=0;i<op.size();i++)	
	{
		//System.out.println(list.get(i).getText());
		String t =op.get(i).getText();
		if(t.equals("Red")||t.equals("Blue")||t.equals("Green"))
		{
			op.get(i).click();
		}
	}
	}

}
