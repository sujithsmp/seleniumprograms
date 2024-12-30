package package3federal;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import package1rbi.Rbi;

public class Federal implements Rbi
{
	XSSFSheet sh;
	public Federal() throws IOException
	{
		FileInputStream fp=new FileInputStream("C:\\Users\\Sujith\\git\\javaoops\\mymaven\\src\\main\\resources\\bank.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fp);
		sh=w.getSheet("federal");
	}
	public boolean WithdrawalGreaterThan50k(double amount) 
	{
		
		return amount>50000;
	}


	public double rateOfInterest(int i, int j) 
	{
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		double interest=c.getNumericCellValue();
		return interest;
		
	}
	public double compoundInterest(double principal, double years) 
	{
	        double rate = rateOfInterest(1,1);
	        return principal * Math.pow((1 + rate / 100), years);
	}
}


