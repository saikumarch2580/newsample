package saitestngpractice.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class excelPractice {
	

public void createExcel() throws Exception {
	
	//WebDriver driver = new ChromeDriver();
	
	
	File excelfile = new File("C:\\Users\\Sai Anna\\Desktop\\Excel selenium\\excelpractice.xlsx");
	System.out.println(excelfile.exists());
	//if you provide exists, so you can get to know the file is added to your program or not

	FileInputStream worksheet = new FileInputStream(excelfile);
	XSSFWorkbook Workbook = new XSSFWorkbook(worksheet);
	XSSFSheet sheet = Workbook.getSheet("Parts"); 
	int noofRows= sheet.getPhysicalNumberOfRows();
	int noofCells = sheet.getRow(0).getLastCellNum();
	 
	for(int i=1; i<noofRows; i++) { 
		for(int j=0; j<noofCells; j++) {
			DataFormatter df = new DataFormatter();
			//If you have alphabets and numbers combination or only numbers in excelsheet then you have to use dataformatter.
			System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));	
			//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			
			
			

	}
		System.out.println();
	}		
//	
//	System.out.println(sheet.getPhysicalNumberOfRows());
//	System.out.println(sheet.getLastRowNum());
	worksheet.close();
	Workbook.close();
	
	
}
	
}


