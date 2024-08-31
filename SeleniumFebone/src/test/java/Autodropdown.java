import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autodropdown {
	
	@Test()
	public void login() {
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.autorox.co:9443/axuat/login");
	driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("saicar");
	driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Sairam@123");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
	driver.findElement(By.xpath("(//img[@class='sidebarIcon'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn_m21 m-0 btn-secondary dropdown-toggle']")).click();
	driver.findElement(By.xpath("//a[text()='New Job Card']")).click();
	driver.findElement(By.xpath("//span[@id='select2-stateCode-container']")).click();
	
	
	
	WebElement dropdown = driver.findElement(By.xpath("//ul[@id='select2-stateCode-results']"));
	 
	   String options = dropdown.getText();
      
            	System.out.println(options);
            	
            
            	
            	            
	 
	 
	 
    
    	 
    	  
     }
	
	
	public void selectState() {
		
	
	}

}
