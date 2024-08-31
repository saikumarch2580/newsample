package April.may;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	
	@Test()
	public void takescreenshot() throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName_login")).sendKeys("Autorox@test");
		driver.findElement(By.id("password_login")).sendKeys("Admin@123");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screenshots//two.png"));
		System.out.println(src);
		
		Actions act = new Actions(driver);
		
		WebElement menu = driver.findElement(By.id("sideLogo_img"));
		WebElement jobCard = driver.findElement(By.xpath("(//span[contains(text(),'Job Cards')])[1]"));
		
		act.moveToElement(menu).click().build().perform();
		act.moveToElement(jobCard).click().build().perform();
		WebElement JobcardImage = driver.findElement(By.xpath("//*[@id=\"estlater\"]"));
		File srcFolder = JobcardImage.getScreenshotAs(OutputType.FILE);
		
	  FileHandler.copy(srcFolder, new File("screenshots//three.png"));
	   
	}

}
