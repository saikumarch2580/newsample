package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticalOne {
	@Parameters({"url","username","password"})
	@Test()
	public void openUrl(@Optional("https://app.autorox.co") String url, String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='userName_login']")).sendKeys(username);	
		driver.findElement(By.xpath("//input[@id='password_login']")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		 
		
	}

}
