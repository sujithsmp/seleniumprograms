package Seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		/*	
		
	if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("41.pdf"))
			{
				System.out.println("ok macha");
			}
	else
	{
		System.out.println("sorry macha");
	}*/
		
		//two files upload
	
	String f1="D:\\4.pdf";
	String f2="D:\\6.pdf";
	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(f1+"\n"+f2);	
	if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("4.pdf") 
			&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("6.pdf"))
	{
		System.out.println("ok macha");
	}
else
{
System.out.println("sorry macha");
}
	
	}

}
