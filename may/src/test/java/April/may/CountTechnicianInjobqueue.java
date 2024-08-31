package April.may;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CountTechnicianInjobqueue {

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
//		    jse.executeScript("document.getElementById('jobQueue').click()");
//		    Thread.sleep(2000); 
		    WebElement jobqueue = driver.findElement(By.xpath("//li[@id='jobQueue']"));
		   
		    Actions ac = new Actions(driver);
		    Thread.sleep(2000);
		    ac.moveToElement(jobqueue).click().build().perform();
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("//input[@class='search']")).sendKeys("siddu");
		    Thread.sleep(20000);
		    List<WebElement> technicians = driver.findElements(By.xpath("//tbody[@role='rowgroup']//td[contains(text(), 'Siddu')]"));
		    System.out.println("Total technicians with this name :" + technicians.size());
		    int size = technicians.size();
		    for(int i=0; i<size; i++) {
		    	technicians.get(i);
		    	
		    	System.out.println("no.of technicians :" + i);
		    }
		    
			 
			 
		}
	}



