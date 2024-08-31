package saitestngpractice.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class excelwithautorox {
	
	public void excelpractice() throws Exception {
	
	File excelfile = new File("C:\\Users\\Sai Anna\\Desktop\\Excel selenium\\excelpractice.xlsx");
	
System.out.println(excelfile.exists());
	FileInputStream excelfile1 = new FileInputStream(excelfile);
	
XSSFWorkbook workbook = new XSSFWorkbook(excelfile1);
XSSFSheet sheet = workbook.getSheet("Parts");
int row = sheet.getLastRowNum();
int cell =	sheet.getRow(0).getLastCellNum();




System.out.println("noofrows: " + row);
System.out.println("noofcells: " + cell);



	
		WebDriver driver = new ChromeDriver();
		//driver.get("https://pre.autorox.co/axprprod/");
		//driver.get("https://app.autorox.co:9443/axuat/");
		driver.get("https://app.autorox.co/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("generaluat");
		//driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("preprod");
		driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("csteam");
		driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Cst@1234");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		 
		driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]")).click();
		driver.findElement(By.xpath("(//span[contains(text(), 'Job Cards')] )[1]")).click();
		driver.findElement(By.xpath("//button[@id='estlater'][2]")).click();
		driver.findElement(By.xpath("//*[@id=\"reg_2\"]")).sendKeys("09");
		driver.findElement(By.xpath("//*[@id=\"reg_3\"]")).sendKeys("kjh");
		driver.findElement(By.xpath("//*[@id=\"reg_4\"]")).sendKeys("3954");
		driver.findElement(By.xpath("//*[@id=\"odometer\"]")).sendKeys("1000");
		// MMVY IN NEW JOB CARD
		int m=0;
		driver.findElement(By.xpath("//input[@id='make']")).sendKeys("Toyota");
		Thread.sleep(2000);
		while(m<1)
			m++;
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='make']")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath("//input[@id='make']")).sendKeys(Keys.ENTER);
		 
		
	//	driver.findElement(By.xpath("//a[text()='Toyota']")).click();
		Thread.sleep(2000);
		int n=0;
		
		driver.findElement(By.xpath("//input[@id='model']")).sendKeys("INNOVA");
		while(n<1)
			n++;	
		Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@id='model']")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath("//input[@id='model']")).sendKeys(Keys.ENTER);
		 
		 
		
		//driver.findElement(By.xpath("//a[text()='INNOVA']")).click();
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2000");
		driver.findElement(By.xpath("//a[text()='2000']")).click();
		driver.findElement(By.xpath("//input[@id='variant']")).sendKeys("AT");
		driver.findElement(By.xpath("//a[text()='AT']")).click();
		//select service type	
		driver.findElement(By.xpath("//span[@id='serviceTypeIdTxt_']")).click();	
		driver.findElement(By.xpath("//span[text()=' Body Shop']")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_name\"]")).sendKeys("sairam");
		driver.findElement(By.xpath("//*[@id=\"mobile_no\"]")).sendKeys("9100090851");
		driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
			
		
		
		// driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]")).click();
		// driver.findElement(By.xpath("(//span[contains(text(), 'Job Cards')]
		// )[1]")).click();
		
		for(int i=1; i<=row; i++) {
			XSSFRow rows = sheet.getRow(i);
		 Thread.sleep(2000);

			String partname = rows.getCell(0).getStringCellValue();
			String qty = rows.getCell(1).getStringCellValue();
			String price =	rows.getCell(2).getStringCellValue();
			String Service = rows.getCell(3).getStringCellValue();
		    String ServicePrice = rows.getCell(4).getStringCellValue();
			
				System.out.println(partname);
				 
			
			
				System.out.println(qty);
				System.out.println(price);
		
		
		driver.findElement(By.xpath("//*[@id=\"partname\"]")).sendKeys(partname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys((qty));
		driver.findElement(By.xpath("//*[@id=\"partprice\"]")).sendKeys((price));
		driver.findElement(By.xpath("//div[@id='hideconclick']/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"partname\"]")).sendKeys(Service);		
		driver.findElement(By.xpath("//*[@id=\"totallabourprice\"]")).sendKeys(ServicePrice);
		driver.findElement(By.xpath("//div[@id='hideconclick']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='hideconclick']/a")).click();
		Thread.sleep(1000);
		
		}
	
	
	
		}
}
