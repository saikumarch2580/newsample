package April.may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDrop {
	
	@Test()
	public void newlogin() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		WebElement Block1 = driver.findElement(By.xpath("//h1[@class='draghandle']"));
		WebElement Block3 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[3]"));
		ac.clickAndHold(Block1).moveToElement(Block3).release().build().perform();
	}
	

}
