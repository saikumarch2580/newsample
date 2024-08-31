package saitestngpractice.one;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class screenshots {
	@Test
	public void newScreeshots() throws Exception {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://app.autorox.co");

	
	
/*	File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destFile = new File("./screenshots/img1.png");
	FileUtils.copyFile(sourceFile, destFile);
	driver.quit();      */
	
	//login
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("csteam");
	driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Cst@1234");
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
	
	
	//job card creation
	
	driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]")).click();
	driver.findElement(By.xpath("(//span[contains(text(), 'Job Cards')] )[1]")).click();
	driver.findElement(By.xpath("//button[@id='estlater'][2]")).click();
	driver.findElement(By.xpath("//*[@id=\"reg_2\"]")).sendKeys("09");
	driver.findElement(By.xpath("//*[@id=\"reg_3\"]")).sendKeys("ddd");
	driver.findElement(By.xpath("//*[@id=\"reg_4\"]")).sendKeys("7115");
	driver.findElement(By.xpath("//*[@id=\"odometer\"]")).sendKeys("1000");
	// MMVY IN NEW JOB CARD
	int i=0;
	driver.findElement(By.xpath("//input[@id='make']")).sendKeys("Toyota");
	while(i<1)
		i++;
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='make']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//input[@id='make']")).sendKeys(Keys.ENTER);
	
	
	
//	driver.findElement(By.xpath("//a[text()='Toyota']")).click();
	driver.findElement(By.xpath("//input[@id='model']")).sendKeys("INNOVA");
	driver.findElement(By.xpath("//a[text()='INNOVA']")).click();
	
	int j=0;
	driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2000");
	while(j<2)
	j++;
	driver.findElement(By.xpath("//input[@id='year']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//input[@id='year']")).sendKeys(Keys.ENTER);
	
	
	
	
//	driver.findElement(By.xpath("//a[text()='2000']")).click();
	int k=0;
	driver.findElement(By.xpath("//input[@id='variant']")).sendKeys("AT");
	while(k<1)
	k++;
	driver.findElement(By.xpath("//input[@id='variant']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//input[@id='variant']")).sendKeys(Keys.ENTER);
	
	
	
	//driver.findElement(By.xpath("//a[text()='AT']")).click();
	driver.findElement(By.xpath("//*[@id=\"customer_name\"]")).sendKeys("sairam");
	driver.findElement(By.xpath("//*[@id=\"mobile_no\"]")).sendKeys("9100090851");
	Thread.sleep(2000);
	
	//Calander
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div[1]/div/div[3]/div/div[9]/div/span/input[4]")).click();
	
	while (!driver.findElement((By.xpath("(//span[@class='cur-month'])[8]"))).getText().contains("Sep")) {
		Thread.sleep(3000);
		
			driver.findElement(By.xpath("/html/body/div[11]/div[1]/span[3]")).click();
			
	
	
	driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
	
}
	
		List <WebElement> days = driver.findElements(By.xpath("(//div[@class='dayContainer']//span[@class='flatpickr-day nextMonthDay'])"));
		
		for(int m=0; m<days.size(); m++) {
			System.out.println(m);
			days.get(m).getText().equalsIgnoreCase("30");
			days.get(m).click();
			
			break;
		}
		
}
}	
	
	
	
	