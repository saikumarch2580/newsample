package saitestngpractice.one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waits {
   
	@Test()
	public void waitOne() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.autorox.co:9443/axuat/login");
		
		driver.findElement(By.id("userName_login")).sendKeys("generaluat");
		driver.findElement(By.id("password_login")).sendKeys("Sairam@123");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']")));
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
	} 
}
