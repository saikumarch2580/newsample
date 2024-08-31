package April.may;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReloadPageUsingJavascript {
	
	WebDriver driver;
	@Test()
	public void refreshThepage() throws Exception {
	
		driver = new ChromeDriver();
		driver.get("https://app.autorox.co");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("history.go(0)");
		Thread.sleep(1000);
		jse.executeScript("history.go(0)");
		
		
		
	}
	}