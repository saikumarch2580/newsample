import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {
	
	@Test()
	public void newframes() {
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//div[@class='tox-icon']")).click();
		WebElement ele = driver.findElement(By.xpath("//body[@id='tinymce']//p"));
		driver.switchTo().frame(ele);
		ele.clear();
		ele.sendKeys("sairam");
		
	}

}
