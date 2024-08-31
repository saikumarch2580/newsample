package saitestngpractice.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class axtrail {
	
	WebDriver driver;
	
	@Test
	public void opennewjobcard() throws Exception {
		
		WebDriver driver = new ChromeDriver();
	
			
		//login
		driver.get("https://pre.autorox.co/axprprod/");
	//	driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("masters");
		driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Admin@123");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
	
		
		driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]")).click();
		driver.findElement(By.xpath("(//span[contains(text(), 'Job Cards')] )[1]")).click();
		driver.findElement(By.xpath("//button[@id='estlater'][2]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[@id='select2-stateCode-container']")).click();
		
		Thread.sleep(2000);
		
		
		//selectState(driver,"AP" );
		driver.findElement(By.xpath("//*[@id=\"reg_2\"]")).sendKeys("09");
		driver.findElement(By.xpath("//*[@id=\"reg_3\"]")).sendKeys("rrr");
		driver.findElement(By.xpath("//*[@id=\"reg_4\"]")).sendKeys("7115");
		driver.findElement(By.xpath("//*[@id=\"odometer\"]")).sendKeys("1000");
		// MMVY IN NEW JOB CARD
		int i=1; 
		driver.findElement(By.xpath("//input[@id='make']")).sendKeys("Toyota");
		while(i<2)
			i++;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='make']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='make']")).sendKeys(Keys.ENTER);
			
	//	driver.findElement(By.xpath("//input[@id='make']")).click();		
	//	driver.findElement(By.xpath("//a[text()='Toyota']")).click();
		int j=0;
	  driver.findElement(By.xpath("//input[@id='model']")).sendKeys("INNOVA");
	  while(j<1)
			j++;
		
	  Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//input[@id='model']")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath("//input[@id='model']")).sendKeys(Keys.ENTER);
		 
		
		
		driver.findElement(By.xpath("//input[@id='model']")).sendKeys(Keys.ENTER);
		
		
		
		
		//driver.findElement(By.xpath("//a[text()='INNOVA']")).click();
		
		int k=0;
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2000");
		while(k<1)
			k++;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys(Keys.ENTER);
		
		
	//	driver.findElement(By.xpath("//a[text()='2000']")).click();
		
		
		
		int l=0;
		driver.findElement(By.xpath("//input[@id='variant']")).sendKeys("AT");
		while(l<1)
			l++;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='variant']")).sendKeys(Keys.DOWN);
		
		
		
		driver.findElement(By.xpath("//input[@id='variant']")).sendKeys(Keys.ENTER);
		
	
		//driver.findElement(By.xpath("//a[text()='AT']")).click();
	//	driver.findElement(By.xpath("//span[@id='serviceTypeIdTxt_']")).click();
		//driver.findElement(By.xpath("//span[text()=' PMS']")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_name\"]")).sendKeys("siddha");
		driver.findElement(By.xpath("//*[@id=\"mobile_no\"]")).sendKeys("9100090851");
		driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]")).click();
		// driver.findElement(By.xpath("(//span[contains(text(), 'Job Cards')]
		// )[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"estlater\"]")).click();
		}
	
		}
	//public void addNewPartlineitems(WebDriver driver , Integer numberOfParts) throws Exception {
		//for (int i =0 ; i< numberOfParts ;i++) {	
//			driver.findElement(By.xpath("//*[@id=\"partname\"]")).sendKeys("bumper");
//			driver.findElement(By.xpath("//*[@id=\"quantity\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("2");
//			driver.findElement(By.xpath("//*[@id=\"partprice\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"partprice\"]")).sendKeys("2999");
//			driver.findElement(By.xpath("//div[@id='hideconclick']/a")).click();
//			Thread.sleep(2000);	
//	
	
	
	
/*	public void selectState(WebDriver driver, String codes) throws Exception
	{

		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@id='select2-stateCode-results']"));
     //	String stateCodes = "";
		for (WebElement e : dropdown) {

			System.out.println(e.getText());
			String state = e.getText();
			System.out.println(state);
			String states = "AP";
			if (states.equalsIgnoreCase(codes)) {
				
				System.out.println("State name is :" + " " + codes);
				driver.findElement(By.xpath("//ul[@id='select2-stateCode-results']//li[contains(text(), '"+codes+"')]")).click();
				
				//e.click();

				creationOfJobCard(driver, 10);		

	}  */




		//}

	//}
	
	
//	}


	



			
