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

public class utilityFile {

	public File excelfile;
	public FileInputStream excel;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path = null;

	utilityFile(String path) {

		this.path = path;
	}

	public int getrowcount(String sheetname) throws Exception {
		excelfile = new File(path);
		excel = new FileInputStream(excelfile);
		workbook = new XSSFWorkbook(excel);
		sheet = workbook.getSheet(sheetname);
		int row = sheet.getLastRowNum();
		workbook.close(); 
		excel.close();
		return row;

	}

	public int getcellcount(String sheetname, int row) throws Exception {
		excelfile = new File(path);

		excel = new FileInputStream(excelfile);
		workbook = new XSSFWorkbook(excel);
		sheet = workbook.getSheet(sheetname);
		XSSFRow rowcount = sheet.getRow(row);
		int cell = sheet.getRow(0).getLastCellNum();
		workbook.close();
		excel.close();
		return cell;
	}

	public String celltype(String sheetname, int rownum, int cellnum) throws IOException {
		excelfile = new File(path);
		excel = new FileInputStream(excelfile);
		workbook = new XSSFWorkbook(excel);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		workbook.close();
		excel.close();
		DataFormatter formatter = new DataFormatter();
		String data = formatter.formatCellValue(cell);
		return data;

	}
  
}
