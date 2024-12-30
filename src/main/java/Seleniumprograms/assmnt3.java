package Seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assmnt3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	int a =	driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
	System.out.println(a);
	for(int i=1;i<=a;i++)
	{
		if(i>1)
		{
			Thread.sleep(3000);
			WebElement next=driver.findElement(By.xpath("//ul[@id='pagination']//a[text()="+i+"]"));
			next.click();
		}
		int b=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		System.out.println(b);
		 
		for(int r=1;r<=b;r++)
			{
				String book=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[2]")).getText();
				System.out.println("book name  " + book);
				
			}
	}
	

	}

}
