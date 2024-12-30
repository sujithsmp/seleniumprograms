package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEg {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		
		WebElement frame1 =  driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		driver.switchTo().defaultContent();
		
		//frame2
		
		WebElement frame2 =  driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("welcome2");
		driver.switchTo().defaultContent();
		
		//frame3
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("welcome3");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i6']")).click();
		driver.findElement(By.xpath("//label[@for='i21']//div[@class='uHMk6b fsHoPb']")).click();
		//driver.findElement(By.xpath("//div[@id='i8']/div/div")).click();
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		//if unable to do operation do javascriptexecutor
		//WebElement javascript=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",javascript);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame3);
		WebElement el=driver.findElement(By.xpath("//input[@name='mytext3']"));
		 el.clear();
		 el.sendKeys("welcome4");
		 driver.switchTo().defaultContent();
		 
		 
		 WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		 driver.switchTo().frame(frame5);
		 driver.findElement(By.tagName("a")).click();
		 driver.switchTo().defaultContent();;//img[@src='/Content/Images/ui.vision.logo2.webp']
		 driver.switchTo().frame(frame5);
		 boolean disp=driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']")).isDisplayed();
		 System.out.println(disp);
		 
	}

}
