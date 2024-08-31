package April.may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {
	
	public void oldlogin() {
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://pre.autorox.co/axprprod/");
	    driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("carclub");
	    driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Sairam@123");
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
	    
		
	}

}
