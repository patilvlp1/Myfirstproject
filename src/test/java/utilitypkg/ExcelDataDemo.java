package utilitypkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDemo {
	public static String Readdata(int row, int coloumn) throws IOException {
		//set a path in file
		String path = System.getProperty("user.dir") + "\\excel\\TestData.xlsx";
		
		File dest= new File(path);
		//To load Excel file
		FileInputStream loadfile= new FileInputStream(dest);
		
		//To access Workbook
		XSSFWorkbook workbook= new XSSFWorkbook(loadfile);
		//to create worksheet from workbook
		XSSFSheet sh1=workbook.getSheet("Sheet1");

		String getvalue=sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(getvalue);
		
		DataFormatter df= new DataFormatter();
		String formatedvalue=df.formatCellValue(sh1.getRow(row).getCell(coloumn));
		System.out.println(formatedvalue);
		
		 return formatedvalue;
	 
	}
	public static void writedata() throws IOException
	{
		String path = System.getProperty("user.dir") + "\\excel\\TestData.xlsx";
        File dest= new File(path);
		
		FileInputStream loadfile= new FileInputStream(dest);
		//To access Workbook
		XSSFWorkbook wb= new XSSFWorkbook(loadfile);
		//to worksheet from weekbook
		XSSFSheet sh1=wb.getSheet("Sheet1");
		//write the data
		File fout = new File(path);
		FileOutputStream fo= new FileOutputStream(fout);
		//for exsisting row n column
		sh1.getRow(8).getCell(0).setCellValue("vikas");
		//create cell and rows
		sh1.getRow(1).createCell(2).setCellValue("patil");
		
		sh1.createRow(9).createCell(0).setCellValue("1001");
		wb.write(fo);	
	}
	public static void readalldata() throws IOException
	{
		String path = System.getProperty("user.dir") + "\\excel\\TestData.xlsx";
        File dest= new File(path);
		
		FileInputStream loadfile= new FileInputStream(dest);
		//To access Workbook
		XSSFWorkbook wb1= new XSSFWorkbook(loadfile);
		//to worksheet from workbook
		XSSFSheet sh1=wb1.getSheet("Sheet2");
		int totalNoOfRows=sh1.getPhysicalNumberOfRows();
		System.out.println("Total Number of rows->"+totalNoOfRows);
		int rowcount=sh1.getLastRowNum();
		System.out.println("Last Row number->"+rowcount);
		
		int cellcount=sh1.getRow(0).getLastCellNum();
		System.out.println("cell count->"+cellcount);
		
		int totalNoOfCell=sh1.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total No Of Cell->"+totalNoOfCell);
			
	}
	
	public static void main(String[] args) throws IOException {
		/*String path = System.getProperty("user.dir") + "\\excel\\TestData.xlsx";
		
		File dest= new File(path);
		
		FileInputStream loadfile= new FileInputStream(dest);
		
		//To acces Workbook
		XSSFWorkbook workbook= new XSSFWorkbook(loadfile);
		
		XSSFSheet sh1=workbook.getSheet("Sheet1");
		
		String getvalue=sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(getvalue);*/
		
		//Readdata(0,1);
		writedata();
		readalldata();
		
	}

}
