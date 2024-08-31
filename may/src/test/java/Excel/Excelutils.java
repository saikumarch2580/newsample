package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelutils {

	//String path= System.getProperty("user.dir")+"\\ExcelFolder\\Selenium2024.xlsx";
	String path = "C:\\Users\\Sai Anna\\Desktop\\Selenium2024.xlsx";
	File file;
	FileInputStream fs;
	XSSFWorkbook workbook;
	XSSFSheet Sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test()
	public void excel() throws Exception {
		
		file = new File(path);
	    fs = new FileInputStream(file);
		workbook = new XSSFWorkbook(fs);
		Sheet = workbook.getSheet("Credentials"); 
		System.out.println(Sheet); 
		int TotalRows = Sheet.getLastRowNum();
		int TotalLastCell = Sheet.getRow(0).getLastCellNum();
		System.out.println(TotalRows);
		System.out.println(TotalLastCell);
		
		 
	}
	@Test()
	public void getCellData(XSSFCell cell) throws Exception {
		
		file = new File(path);
	    fs = new FileInputStream(file);
		workbook = new XSSFWorkbook(fs);
		Sheet = workbook.getSheet("Credentials"); 
		int TotalRows = Sheet.getLastRowNum();
		int TotalLastCell = Sheet.getRow(0).getLastCellNum();
	   
		
		for(int r=1; r<=TotalRows; r++) {
			 row = Sheet.getRow(r);	 
			 for(int j=0; j<TotalLastCell; j++) {		 
				 cell = row.getCell(j);
				 System.out.println("Total rows :" + r);			 
				 DataFormatter format = new DataFormatter();
				 format.formatCellValue(cell);
				 System.out.println("Total cells :" + cell);
				 
			 }  
			 
			  
			
		 
		}
		
	}
	}	