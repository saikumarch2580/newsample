package April.may;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorOne {
	
	WebDriver driver;
	@Test()
	public void Javascript() throws Exception {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName_login")).sendKeys("csteam");
		driver.findElement(By.id("password_login")).sendKeys("Hajimo@2023");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("prompt('My name is sairam')");
		
		
		
	}

}
