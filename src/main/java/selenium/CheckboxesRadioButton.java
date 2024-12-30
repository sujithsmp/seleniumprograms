package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesRadioButton
{

public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.qabible.in/check-box-demo.php");
driver.manage().window().maximize();
WebElement checkbox=driver.findElement(By.id("gridCheck"));
checkbox.click();
if(checkbox.isSelected())
{
System.out.println("selected");
}
else
{
System.out.println("not selected");
}
/*if(checkbox.isDisplayed())
{
System.out.println("Displayed");
}
else
{
System.out.println("not Displayedd");
}*/
boolean check=checkbox.isDisplayed();
System.out.println(check);
boolean check1=checkbox.isEnabled();
System.out.println(check1);

}

}
