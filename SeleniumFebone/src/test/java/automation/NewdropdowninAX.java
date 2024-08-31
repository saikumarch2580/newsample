package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewdropdowninAX {
	
	@Test()
	public void login() {

	WebDriver driver = new ChromeDriver();
	driver.get("https://pre.autorox.co/axprprod/");  
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("masters");
	driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Sairam@123");
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
	driver.findElement(By.xpath("(//img[@class='sidebarIcon'])[2]")).click();
	driver.findElement(By.xpath("//button[@id='estlater'][2]")).click();
	
	
}
}