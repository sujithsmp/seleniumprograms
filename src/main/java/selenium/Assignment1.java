package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		//1. Enter some text in "Enter Message" text box --> Click "Show Message" Button. 
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Hello");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		showMessageButton.click();
		
		//2. Enter some text in "Enter value A", "Enter value B" text boxes --> Click "Get Total" button.
		WebElement valueA=driver.findElement(By.cssSelector("input#value-a"));
		valueA.sendKeys("10");
		WebElement valueB=driver.findElement(By.cssSelector("input#value-b"));
		valueB.sendKeys("25");
		WebElement totalButton=driver.findElement(By.cssSelector("button#button-two"));
		totalButton.click();

		//3.Get the text of "Show Message" , "Get Total" buttons and print it
		
		System.out.println(showMessageButton.getText());
		System.out.println(totalButton.getText());
		
		//4. Get any style properties of "Show Message" , "Get Total" buttons and print it
		String color=showMessageButton.getCssValue("color");
		System.out.println(color);
		String bgColor=totalButton.getCssValue("background-color");
		System.out.println(bgColor);
		
		//5. Get the tag Name of "Show Message" , "Get Total" buttons and print it
		String tnameShowMessageButton=showMessageButton.getTagName();
		System.out.println(tnameShowMessageButton);
		String tnameTotalButton=totalButton.getTagName();
		System.out.println(tnameTotalButton);
		
		//6. Get any attribute Values of "Show Message" , "Get Total" buttons and print it.
		
		String atrValueShowMessageButton=showMessageButton.getAttribute("id");
		System.out.println(atrValueShowMessageButton);
		String atrValueTotalButton=totalButton.getAttribute("class");
		System.out.println(atrValueTotalButton);
		
	}

}
