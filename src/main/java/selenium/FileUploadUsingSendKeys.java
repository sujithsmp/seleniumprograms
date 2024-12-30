package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendKeys {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		
		//upload single file
		
		/*String file="D:\\Selenium\\Selenium by Sujith Sujathan.docx";
		driver.findElement(By.id("uploadfile_0")).sendKeys(file);
		WebElement submitfile = driver.findElement(By.id("submitbutton"));
		submitfile.click();*/
		
		//upload 2 files 
		
		String file1="D:\\Selenium\\Selenium by Sujith Sujathan.docx";
		String file2="D:\\Selenium\\Assignment.docx";
		driver.findElement(By.id("uploadfile_0")).sendKeys(file1+"\n"+file2);
		WebElement submitMulfile = driver.findElement(By.id("submitbutton"));
		submitMulfile.click();
	}

}
