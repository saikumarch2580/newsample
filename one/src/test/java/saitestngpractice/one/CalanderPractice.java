package saitestngpractice.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test()
public class CalanderPractice {
	
	

public void datepicker() throws Exception {
	
	WebDriver driver = new ChromeDriver();

		
	//login
	driver.get("https:app.autorox.co");
//	driver.get("https://app.autorox.co");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("csteam");
	driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Cst@1234");
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
	driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]")).click(); 
	driver.findElement(By.xpath("(//span[contains(text(), 'Job Cards')] )[1]")).click();
	driver.findElement(By.xpath("//button[@id='estlater'][2]")).click();
	//Thread.sleep(4000);
	//driver.findElement(By.xpath("//span[@id='select2-stateCode-container']")).click();

	//public void creationOfJobCard(WebDriver driver, int n) throws Exception {
		
	
	Thread.sleep(2000);
//	for(int a=0; a<n; a++) {
//	selectState(driver,"AP" );
	driver.findElement(By.xpath("//*[@id=\"reg_2\"]")).sendKeys("09");
	driver.findElement(By.xpath("//*[@id=\"reg_3\"]")).sendKeys("rrr");
	driver.findElement(By.xpath("//*[@id=\"reg_4\"]")).sendKeys("1131"); 
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
	
	//ESTIMATION DATE
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div[1]/div/div[3]/div/div[9]/div/span/input[4]")).click();
	String month = "Aug ";
	String year = "2024";
	
	String text=driver.findElement(By.xpath("//span[contains(text(), 'Nov ')]")).getText();
	System.out.println(text);
	
//////	while(true) {
//////		
//////		if(text.equals(month)){ 
//////			
////			break;			
//		} 
//		else
	for(int c=0; c<17; c++) {
			driver.findElement(By.xpath("/html/body/div[16]/div[1]/span[3]")).click();
			
	}
	
	
	
	List<WebElement> allElements=driver.findElements(By.xpath("/html/body/div[16]/div[2]/div/div[2]/div"));
	
	for(WebElement e: allElements) {
		
		System.out.println(e);
	}
}
	
	

		
	}
	

	


	


/*	
	driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
	// driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]")).click();
	// driver.findElement(By.xpath("(//span[contains(text(), 'Job Cards')]
	// )[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"estlater\"]")).click();
	}


*/

