package April.may;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class sikuli {
	
	@Test()
	public void login() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.autorox.co/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("tester");
		driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Admin@123");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Book Appointment - Autorox"));
		
		Screen sc = new Screen();
		Pattern jobcards = new Pattern("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\may\\Images\\jobcardimage.jpg");
		sc.wait(jobcards, 20);
		sc.click(jobcards);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div/div[6]/table/tbody/tr[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='estimationFooterCarIcon']")).click();
		//driver.findElement(By.xpath("(//div[@class='upload__btn-box'])[1]")).click();
		 Pattern downloadimg = new Pattern("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\may\\Images\\downloadimage.jpg");
		 sc.wait(downloadimg, 10); 
		 sc.click(downloadimg, 10);
		 sc.click(downloadimg);
		 Pattern folder = new Pattern("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\may\\Images\\folderimage.jpg");
	     sc.click(folder);
	     sc.type(folder, "C:\\Users\\Sai Anna\\Desktop\\Images\\autorox");
	     Pattern open = new Pattern("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\may\\Images\\openfolder.jpg");
	     sc.click(open, 10);
	     
	
	
	}

}
