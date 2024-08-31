package April.may;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ArraylistInAutoroxstock {

	WebDriver driver;

	@Test(priority = 1)
	public void login() throws Exception {

		driver = new ChromeDriver();
		driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userName_login']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='password_login']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		// Menu
		driver.findElement(By.xpath("//img[@id='sideLogo_img']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//nav[@id='trigger']//li[4]//a[1]")).click();
		driver.findElement(By.xpath("//input[@id='searchText']")).sendKeys("xyyy");
		Thread.sleep(2000);
	}
    @Test(priority = 2)
	public void getAllxpathElementsdata() {
		WebElement PartNo = driver.findElement(By.xpath("//td[@id='stockPartNumber_0']"));
    	WebElement PartName = driver.findElement(By.xpath("//td[@id='tdstackdata_0']"));
	    WebElement Brand = driver.findElement(By.xpath("//td[@id='stockBrand_0']"));
		WebElement Category = driver.findElement(By.xpath("//input[@id='tags0']"));
		WebElement QoH = driver.findElement(By.xpath("//td[@id='stockQty_0']"));
	    WebElement PurchasePrice = driver.findElement(By.xpath("//td[@id='stockPartNumber_0']"));
	
		
		
		ArrayList<String> list = new ArrayList <>();
		
		list.add(PartNo.getText());
		list.add(PartName.getText());
		list.add(Brand.getText());
		list.add(Category.getText());
		list.add(QoH.getText());
		list.add(PurchasePrice.getText()); 
		
		System.out.println("The total list is :" + list);
		
	}
}
