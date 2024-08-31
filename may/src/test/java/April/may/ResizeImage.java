package April.may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizeImage {
	
	@Test()
	public void resize() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']//div[3]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(resize).dragAndDropBy(resize, 100, 50);
	}

}
