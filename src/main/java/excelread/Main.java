package excelread;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		ExcelRead obj=new ExcelRead();
		obj.readExcel();
		System.out.println("Data :"+obj.readData(0,1));
		

	}

}
