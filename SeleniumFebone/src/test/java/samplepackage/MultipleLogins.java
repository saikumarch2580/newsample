package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleLogins { 
	WebDriver driver;
   
	@Test(dataProvider ="sampleone")
	public void Logins(String username, String Password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.autorox.co:9443/axuat/login"); 
		driver.findElement(By.xpath("//input[@id='userName_login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password_login']")).sendKeys(Password);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default my_logout_btn']")).click();
 
	} 
    
    @DataProvider(name="sampleone", parallel=true)
    public String[][] getdata() {
    	
    	String[][] data = {{"saimultiplevehicle", "Sairam@123"},{"zambiacountry", "Sairam@123"}, {"generaluat","Sairam@123"}};
    	
    	return data; 
    } 

}
