package excelread;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead
{
	XSSFSheet sh;
	public  ExcelRead() throws IOException
	{
		FileInputStream fp=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\mymaven\\src\\main\\resources\\Book2.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fp);
		sh=w.getSheet("Sheet1");
	}
	public void readExcel()
	{
		for(Row r:sh)
		{
			for(Cell c:r)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
    public void readFirstColumn() 
    {
    	ArrayList<String> values = new ArrayList<>();
        // Iterate through each row in the sheet
        for (Row r : sh) 
        {
            // Get the cell from the first column (index 0)
            Cell c = r.getCell(0);
            if (c != null) 
            { // Check if the cell is not null
                // Print the value of the first column cell
                values.add(c.toString());
            }
        }
        for (String v : values) {
            System.out.print(v + " ");
        }
    }
	
	public String readData(int i,int j)
	
	{
		
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int cellType=c.getCellType();
		switch(cellType)
		{
			case Cell.CELL_TYPE_STRING:
				String data=c.getStringCellValue();
				return data;
				
			case Cell.CELL_TYPE_NUMERIC:
				double number=c.getNumericCellValue();
				return String.valueOf(number);
				
			default:
				return null;
		}
	}
	public static void main(String[] args) throws IOException 
	{
		ExcelRead obj=new ExcelRead();
		obj.readExcel();
		System.out.println("Data :"+obj.readData(0,0));
		 obj.readFirstColumn();

	}

}
