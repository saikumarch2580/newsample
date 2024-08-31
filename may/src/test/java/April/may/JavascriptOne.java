package April.may;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavascriptOne {
	
	WebDriver driver;
	
	@Test()
	public void javascriptOne() throws Exception {
		
        driver = new ChromeDriver();
		
		driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName_login")).sendKeys("tester");
		driver.findElement(By.id("password_login")).sendKeys("Admin@123");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		System.out.println((String)jse.executeScript("return document.URL"));
		System.out.println((String)jse.executeScript("return document.title"));
	
		
		//WebElement Menu = driver.findElement(By.xpath("//img[@id='sideLogo_img']"));
		
		jse.executeScript("document.getElementById('sideLogo_img').click()");
		Thread.sleep(2000);	
		jse.executeScript("document.getElementsByClassName('sidebarIcon')[1].click()");
		Thread.sleep(2000);	
		//jse.executeScript("document.getElementsByClassName('form-control input-sm')[1].value = 'MH12AB9895'");
		Thread.sleep(2000);
		WebElement DashboardSearch = driver.findElement(By.xpath("(//input[@class='form-control input-sm'])[2]"));
		 
		jse.executeScript("arguments[0].value='sairam123'", DashboardSearch);
		jse.executeScript("document.getElementsByClassName('form-control input-sm')[1].style.boarder ='red'", DashboardSearch);
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.scrollByAmount(0, 1500).perform();
		Thread.sleep(2000);
		ac.scrollByAmount(0, -1000).perform();
		WebElement Addbutton = driver.findElement(By.xpath("(//button[@id='dropdownMenu1'])[2]"));
		WebElement Jobcard = driver.findElement(By.xpath("//li[@id='estlater']"));
		ac.moveToElement(Addbutton).click().build().perform();
		ac.moveToElement(Jobcard).click().build().perform();
		Thread.sleep(2000); 
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)");
		//taking screenshot
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\may\\screenshots\\two.png"));
		     
		
	}

	 

	}  

