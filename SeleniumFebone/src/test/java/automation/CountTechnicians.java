package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountTechnicians {

	WebDriver driver;
	@Test()
	public void countTechnician() throws Exception {
		
		driver = new ChromeDriver();
		driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName_login")).sendKeys("csteam");
		driver.findElement(By.id("password_login")).sendKeys("Hajimo@2023");
		driver.findElement(By.xpath("//*[@id=\"loginPageBody\"]/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		Thread.sleep(20000);
		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    Thread.sleep(2000);
	    jse.executeScript("document.getElementById('sideLogo_img').click()");
	    Thread.sleep(2000);
	    jse.executeScript("document.getElementById('TimeTracker').click()");
	    Thread.sleep(2000);
	    jse.executeScript("document.getElementById('jobQueue').click()");
	    
		 
		 
	}
}
