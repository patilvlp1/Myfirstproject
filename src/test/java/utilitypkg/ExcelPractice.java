package utilitypkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice 
{
	public static void main(String[]args) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\excel\\TestData.xlsx";
		
		//To set path in File
		File dest= new File(path);
		//To load Excel file
		FileInputStream loadfile= new FileInputStream(path);
		//to access the workbook
		XSSFWorkbook workbook=new XSSFWorkbook(loadfile);
		// to create sheet form workbook
		XSSFSheet sh1= workbook.getSheet("Sheet1");
		//To access row n column value
		String getvalue=sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(getvalue);
		
	}
	

}
