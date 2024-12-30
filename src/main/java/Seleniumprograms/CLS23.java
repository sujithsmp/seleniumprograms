package Seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLS23 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//CSS SELECTOR tag#idname
		//TAG IS OPTIONAL WE CAN REMOVE THE TAG
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("HELLO");
		//CSS SELECTOR tag.clss name
		//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("HELLO");
		//CSS SELECTOR tag[attribute='value']
		//driver.findElement(By.cssSelector("input[class='nav-input nav-progressive-attribute']")).sendKeys("HELLO");
		//CSS SELECTOR tag.classname[attribute='value']
		//driver.findElement(By.cssSelector("input.nav-input[name='field-keywords']")).sendKeys("HELLO");
		//driver.findElement(By.cssSelector("input.nav-input[class='nav-input nav-progressive-attribute']")).sendKeys("HELLO");
		//without tag
		driver.findElement(By.cssSelector(".nav-input[class='nav-input nav-progressive-attribute']")).sendKeys("HELLO");
		
				
		
	}

}
