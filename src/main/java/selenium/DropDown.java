package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id=\'single-input-field\']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Red");
		select.selectByIndex(0);
		select.selectByValue("Green");
		//verify
	WebElement	element=select.getFirstSelectedOption();
	String text=element.getText();
	System.out.println(text);
	//multiselect dropdown
	
	WebElement dropdownMulti=driver.findElement(By.xpath("//select[@id=\'multi-select-field\']"));
	Select selectMul=new Select(dropdownMulti);
	selectMul.selectByVisibleText("Red");
	selectMul.selectByVisibleText("Yellow");
	List<WebElement>element2=selectMul.getAllSelectedOptions();
	for(WebElement ele:element2)
	{
		System.out.println(ele.getText());
	}
	
	//Capture the options from the dropdown
	List<WebElement>options=select.getOptions();
	System.out.println("number of options in the dropdown:"+options.size());
	
	//printing the options in console
	System.out.println("List of options are:");
	for(int i=0;i<options.size();i++)
	{
		
		System.out.println(options.get(i).getText());
	}
	
	}

}
