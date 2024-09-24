package utility_flights;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Air {
	public static String un;
	public static String pwd;
	public static String str_value;
	public void getDataFromExcelSheet(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException
	{
	FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\AirlineProject1\\AmazonFlights_DDT\\amazonflights_login.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
    un=w1.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	pwd=w1.getSheet(sheetname).getRow(row).getCell(cell+1).getStringCellValue();
	}
	
	public void getDataFromExcelSheet1(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("D:\\eclipse-workspace\\AirlineProject1\\AmazonFlights_DDT\\amazonflights_login.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		str_value= w1.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
