package April.may;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class RobotClass {
	
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
		sc.click(jobcards);
		
		Pattern workinprogress = new Pattern("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\may\\Images\\Workinprogress.jpg");
		sc.wait(workinprogress, 10);
		sc.click(workinprogress);
		
		Pattern workinprogressbutton = new Pattern("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\may\\Images\\workinprogressbutton.jpg");
		sc.wait(workinprogressbutton, 10);
		sc.click(workinprogressbutton);
		
		driver.findElement(By.id("estimationFooterCarIcon")).click();
		
		Pattern uploadimage = new Pattern("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\may\\Images\\downloadimage.jpg");
		sc.wait(uploadimage, 10);
		sc.click(uploadimage);
        
        Robot rt = new Robot();
        rt.delay(2000);
        //copy path of the image
        
        //C:\Users\Sai Anna\Desktop\Images\autoroxlogo.png
        
        StringSelection ss = new StringSelection("C:\\Users\\Sai Anna\\Desktop\\Images\\autoroxlogo.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().getContents(ss);
        
        rt.keyPress(KeyEvent.VK_CONTROL);
        rt.keyPress(KeyEvent.VK_V);
        rt.keyRelease(KeyEvent.VK_CONTROL);
        rt.keyRelease(KeyEvent.VK_V);
        // click open button
        
       rt.keyPress(KeyEvent.VK_ENTER);
       
        
        
        
        
}
}
