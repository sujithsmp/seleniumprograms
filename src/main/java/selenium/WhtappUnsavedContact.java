package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WhtappUnsavedContact 
{
	XSSFSheet sh;
	static ArrayList<String> contacts = new ArrayList<>();
	static ArrayList<String> messages = new ArrayList<>();
	public WhtappUnsavedContact() throws IOException
	{
		FileInputStream fp=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\mymaven\\src\\main\\resources\\Contact.xlsx");
		//XSSFWorkbook w=new XSSFWorkbook(fp);
		XSSFWorkbook w=new XSSFWorkbook(fp);
		sh=w.getSheet("Sheet1");
	}
	public void readContact() 
    {
    	
        // Iterate through each row in the sheet
        for (Row r : sh) 
        {
            // Get the cell from the first column (index 0) & index 3)
            Cell contactCell = r.getCell(0);
            Cell messageCell = r.getCell(3);
            
            if (contactCell != null && messageCell != null) 
            { // Check if the cell is not null
                // Print the value of the first column cell
            	contacts.add(contactCell.toString());
            	messages.add(messageCell.toString());
            }
        }
    }

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WhtappUnsavedContact obj=new WhtappUnsavedContact();
		obj.readContact();
		
		ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("debuggerAddress", "localhost:9900");
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();
	
    Thread.sleep(5000);
    Actions act=new Actions(driver);
    for (int i=0;i<contacts.size();i++) 
    {
    	String contact=contacts.get(i);
    	String message=messages.get(i);
    	WebElement newChat=driver.findElement(By.xpath("//span[@data-icon=\"new-chat-outline\"]"));
    	newChat.click();
    	WebElement searchBox = driver.findElement(By.xpath("//div[@contenteditable='true' and @class='x1hx0egp x6ikm8r x1odjw0f x6prxxf x1k6rcq7 x1whj5v']"));
    	searchBox.click();
    	searchBox.clear();
        searchBox.sendKeys(contact);
        Thread.sleep(5000);
        //WebElement contactElement = driver.findElement(By.xpath("//div[@role='button']//div[1]//span[@title='"+contact+"'  and contains(@class,'x1iyjqo2 x6ikm8r')"));
        //contactElement.click();
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);
        WebElement messageBox = driver.findElement(By.xpath("//div[@contenteditable='true' and @class='x1hx0egp x6ikm8r x1odjw0f x1k6rcq7 x6prxxf']"));
        messageBox.sendKeys(message);
        messageBox.sendKeys("\n"); 
        
    }
    	
	}

}