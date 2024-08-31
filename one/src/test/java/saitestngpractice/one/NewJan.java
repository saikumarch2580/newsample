package saitestngpractice.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NewJan {

	@Test()
	public void Janexcel() throws Exception {

		File fis = new File("C:\\Users\\Sai Anna\\Desktop\\SeleniumdataDriven.xlsx");
		FileInputStream inputStream = new FileInputStream(fis);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet("username");
		int noofrows = sheet.getLastRowNum();
		int noofcells = sheet.getRow(1).getLastCellNum();

		System.out.println(noofrows);
		System.out.println(noofcells);
		for (int r = 1; r <= noofrows; r++) {
			XSSFRow row = sheet.getRow(r);

			for (int c = 0; c < noofcells; c++) {
				XSSFCell cell = row.getCell(c); 
				switch (cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;

				}

			}
			System.out.println();

		}

	}

}